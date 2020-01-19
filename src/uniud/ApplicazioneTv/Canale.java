package uniud.ApplicazioneTv;

import java.util.ArrayList;
import java.util.List;

public class Canale {
    private String nome;
    private int numero;
    private ArrayList<Trasmissione> trasmissioni = new ArrayList<Trasmissione>();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
