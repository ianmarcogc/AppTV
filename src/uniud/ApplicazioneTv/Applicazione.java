package uniud.ApplicazioneTv;

import uniud.ApplicazioneTv.eccezioni.TipoGestoreNonSupportato;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Applicazione {

    private GestoreCanale gestoreCanale;
    private GestoreRegistrazione gestoreRegistrazione;
    private MonitorTV monitorTV;
    public Applicazione(List<Integer> numeriTavoli) {
        try {
            //design-pattern "Factory"
            gestoreCanale = (GestoreCanale) ProduttoriGestori.getProduttore(Gestori.CANALI).produci();
            gestoreRegistrazione = (GestoreRegistrazione) ProduttoriGestori.getProduttore(Gestori.REGISTRAZIONE).produci();
            monitorTV = new MonitorTV();
        } catch (TipoGestoreNonSupportato tgns) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Tipo gestore non supportato");
        }

        /*if(numeriTavoli != null) {
            numeriTavoli.forEach(n -> gestoreComande.aggiungiTavolo(n));
        }*/

    }
    void sceltaCanale(int numero){ Canale canaleScelto = gestoreCanale.sceltaCanale(numero); monitorTV.cambiaCanale(canaleScelto);}

    void sceltaCanale(int numero, int monitor){ Canale canaleScelto = gestoreCanale.sceltaCanale(numero); monitorTV.cambiaCanale(canaleScelto, monitor); }

    void cambiaTrasmissione(Canale canale, Trasmissione trasmissione1, Trasmissione trasmissione2){
        gestoreCanale.cambiaTrasmissione(canale, trasmissione1, trasmissione2);
    }
    void aggiungiTrasmissione(Canale canale, Trasmissione trasmissione){
        gestoreCanale.aggiungiTrasmissione(canale, trasmissione);
    }
    void cercaTrasmissione(/*QUERY*/){
        gestoreCanale.cercaTrasmissione();
    }
    void avviaRegistrazione(Trasmissione trasmissione){

    }

    void annullaRegistrazione(Trasmissione trasmissione){

    }
    void isPrenotata(Trasmissione trasmissione){

    }
}
