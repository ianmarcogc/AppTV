package Exam.ApplicazioneTv;

import Exam.ApplicazioneTv.eccezioni.TipoGestoreNonSupportato;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Applicazione implements Observable{

    private GestoreCanale gestoreCanale;

    private Observer observerCanale, observerRegistratore;

    public Applicazione() {
        try {
            //design-pattern "Factory"
            gestoreCanale = (GestoreCanale) ProduttoriGestori.getProduttore(Gestori.CANALI).produci();
        } catch (TipoGestoreNonSupportato tgns) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Tipo gestore non supportato");
        }

    }

    @Override
    public void addObserver(Observer obsCanale,Observer obsRegistratore) {
        observerCanale = obsCanale;
        obsRegistratore = obsRegistratore;
    }

    public void aggiornaCanale(int numero){
        Canale canaleScelto = gestoreCanale.sceltaCanale(numero);
        observerCanale.aggiornaCanale(canaleScelto);
    }

    public void aggiornaCanale(int numero, int monitor){
        Canale canaleScelto = gestoreCanale.sceltaCanale(numero);
        observerCanale.aggiornaCanale(canaleScelto,monitor);
    }

    public void avviaRegistrazione(Trasmissione trasmissione){
        observerRegistratore.avviaRegistrazione(trasmissione);
    }

    public void annullaRegistrazione(Trasmissione trasmissione){
        observerRegistratore.annullaRegistrazione(trasmissione);
    }

    public boolean isPrenotata(Trasmissione trasmissione){
        return (observerRegistratore.isPrenotata(trasmissione));
    }

    void cambiaTrasmissione(Canale canale, Trasmissione trasmissione1, Trasmissione trasmissione2){
        gestoreCanale.cambiaTrasmissione(canale, trasmissione1, trasmissione2);
    }
    void aggiungiTrasmissione(Canale canale, Trasmissione trasmissione){
        gestoreCanale.aggiungiTrasmissione(canale, trasmissione);
    }
    void cercaTrasmissione(/*QUERY*/){
        gestoreCanale.cercaTrasmissione();
    }

}
