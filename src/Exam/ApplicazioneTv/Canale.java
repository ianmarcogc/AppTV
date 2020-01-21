package Exam.ApplicazioneTv;

import java.util.ArrayList;

/**
 *
 */
public class Canale {
    private String nome;
    private int numero;
    private ArrayList<Trasmissione> trasmissioni;

    public Canale(String nome, int numero, ArrayList<Trasmissione> trasmissioni) {
        this.nome = nome;
        this.numero = numero;
        this.trasmissioni = trasmissioni;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void cambiaTrasmissione(Trasmissione trasmissione1, Trasmissione trasmissione2){
        TrasmissioneIterator trasmissioneIterator = new TrasmissioneIterator(trasmissioni);
        while (trasmissioneIterator.hasNext()){
            if(trasmissioneIterator.getTrasmissione().equals(trasmissione1));{
                trasmissioni.set(trasmissioneIterator.getPosition(),trasmissione2);
            }
            trasmissioneIterator.next();
        }
    }

    public void aggiungiTrasmissione(Trasmissione trasmissione) {
        trasmissioni.add(trasmissione);
    }

    public boolean equals(Canale canale){
        if(nome.equals(canale.nome) && numero == canale.numero){
            return true;
        }
        return false;
    }
}
