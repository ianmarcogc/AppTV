package Exam.ApplicazioneTv;

import Exam.ApplicazioneTv.eccezioni.TipoGestoreNonSupportato;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Questa classe rappresenta l'applicazione che espone le API per la gestione dei canali e della trasmissione
 * si affida ad ApplicazioneClient per la registrazione e il settaggio dei canali della tv
 */

public class Applicazione implements Observable{

    private GestoreCanale gestoreCanale;

    private Observer observer;

    /**
     * Costruttore (Creator).
     * Crea una nuova istanza della classe Applicazione.
     */
    public Applicazione() {
        try {
            gestoreCanale = (GestoreCanale) ProduttoriGestori.getProduttore(Gestori.CANALI).produci();
        } catch (TipoGestoreNonSupportato tgns) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Tipo gestore non supportato");
        }

    }

    /**
     * Setta l'Observer
     * @param obs
     */
    @Override
    public void addObserver(Observer obs) {
        observer = obs;
    }

    /**
     * Manda il canale selto alla tv
     * @param numero
     */
    public void aggiornaCanale(int numero){
        Canale canaleScelto = gestoreCanale.sceltaCanale(numero);
        observer.aggiornaCanale(canaleScelto);
    }

    /**
     * Manda il canale selto alla tv e al monitor
     * @param numero
     * @param monitor
     */
    public void aggiornaCanale(int numero, int monitor){
        Canale canaleScelto = gestoreCanale.sceltaCanale(numero);
        observer.aggiornaCanale(canaleScelto,monitor);
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

   }
