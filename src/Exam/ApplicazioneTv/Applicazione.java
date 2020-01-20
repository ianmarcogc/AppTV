package Exam.ApplicazioneTv;

import Exam.ApplicazioneTv.eccezioni.TipoGestoreNonSupportato;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Applicazione implements Observable{

    private GestoreCanale gestoreCanale;

    private Observer observer;

    public Applicazione() {
        try {
            //design-pattern "Factory"
            gestoreCanale = (GestoreCanale) ProduttoriGestori.getProduttore(Gestori.CANALI).produci();
        } catch (TipoGestoreNonSupportato tgns) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Tipo gestore non supportato");
        }

    }

    @Override
    public void addObserver(Observer obs) {
        observer = obs;
    }

    public void aggiornaCanale(int numero){
        Canale canaleScelto = gestoreCanale.sceltaCanale(numero);
        observer.aggiornaCanale(canaleScelto);
    }

    public void aggiornaCanale(int numero, int monitor){
        Canale canaleScelto = gestoreCanale.sceltaCanale(numero);
        observer.aggiornaCanale(canaleScelto,monitor);
    }

    public void cambiaTrasmissione(Canale canale, Trasmissione trasmissione1, Trasmissione trasmissione2){
        gestoreCanale.cambiaTrasmissione(canale, trasmissione1, trasmissione2);
        System.out.println("dfgh");
    }
    public void aggiungiTrasmissione(Canale canale, Trasmissione trasmissione){
        gestoreCanale.aggiungiTrasmissione(canale, trasmissione);
    }
    public void cercaTrasmissione(/*QUERY*/){
        gestoreCanale.cercaTrasmissione();
    }

    public void avviaRegistrazione(Trasmissione trasmissione){
        observer.avviaRegistrazione(trasmissione);
    }

    public void annullaRegistrazione(Trasmissione trasmissione){
        observer.annullaRegistrazione(trasmissione);
    }

    public boolean isPrenotata(Trasmissione trasmissione){
        return (observer.isPrenotata(trasmissione));
    }
}
