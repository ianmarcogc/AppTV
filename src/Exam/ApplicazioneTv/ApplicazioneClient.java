package Exam.ApplicazioneTv;

import Exam.ApplicazioneTv.eccezioni.TipoGestoreNonSupportato;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicazioneClient implements Observer{

    TV tv;
    Registratore registratore;
    private GestoreRegistrazione gestoreRegistrazione;
    private MonitorTV monitorTV;

    public ApplicazioneClient(int luminosità, String lingua) {
        try {
            //design-pattern "Factory"
            gestoreRegistrazione = (GestoreRegistrazione) ProduttoriGestori.getProduttore(Gestori.REGISTRAZIONE).produci();

        } catch (TipoGestoreNonSupportato tgns) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Tipo gestore non supportato");
        }
        monitorTV = new MonitorTV();
        tv = new TV(luminosità, lingua);
        registratore = new Registratore();
    }

    @Override
    public void aggiornaCanale(Canale canale) {
        monitorTV.aggiornaCanale(canale);
    }

    @Override
    public void aggiornaCanale(Canale canale,int monitor) {
        monitorTV.aggiornaCanale(canale,monitor);
    }

    @Override
    public void avviaRegistrazione(Trasmissione trasmissione){
        if(!isPrenotata(trasmissione)){
            registratore.aggiungi(trasmissione);
        }
    }

    @Override
    public void annullaRegistrazione(Trasmissione trasmissione){
        if(isPrenotata(trasmissione)){
            registratore.annullaRegistrazione(trasmissione);
        }
    }

    @Override
    public boolean isPrenotata(Trasmissione trasmissione){
        return (registratore.isPrenotata(trasmissione));
    }







}

