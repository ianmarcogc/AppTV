package uniud.ApplicazioneTv;

import uniud.ApplicazioneTv.eccezioni.ImpossibileAggiungereAGestore;

import java.util.ArrayList;
import java.util.List;

public class GestoreCanale extends Gestore<Canale>{

    List canali = new ArrayList<Canale>();
    /**
     * Cambia il canale (Mutator)
     * @param numero numero selezionato dal telecomando
     */
    void sceltaCanale(int numero){
        while ()//aggiungere iteratore
    }
    void sceltaCanale(int numero, int monitor){

    }

    @Override
    void aggiungi(Canale nuovo, int pos) throws ImpossibileAggiungereAGestore {

    }

    @Override
    void rimuovi(Canale daRimuovere) {

    }

    @Override
    Boolean giaInserito(Canale daVerificare) {
        return null;
    }
}
