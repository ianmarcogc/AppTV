package uniud.ApplicazioneTv;

import java.util.ArrayList;
import java.util.List;

public class Canale {
    private String nome;
    private int numero;
    private ArrayList<Trasmissione> trasmissioni = new ArrayList<Trasmissione>();

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

    /*public CanaleIterator iterator(){
        return (new CanaleIterator(this));
    }*/

    public void cambiaTrasmissione(Trasmissione trasmissione1, Trasmissione trasmissione2){

    }

    public void aggiungiTrasmissione(Trasmissione trasmissione) {

    }
}
