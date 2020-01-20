package uniud.ApplicazioneTv;

import uniud.ApplicazioneTv.eccezioni.ImpossibileAggiungereAGestore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestoreCanale extends Gestore<Canale>{

    ArrayList canali = new ArrayList<Canale>();
    /**
     * Cambia il canale (Mutator)
     * @param numero numero selezionato dal telecomando
     */
    Canale sceltaCanale(int numero){
        CanaleIterator canaleIterator = new CanaleIterator(canali);
        while (canaleIterator.hasNext() || canaleIterator.getNumber() != numero){
        }
        return canaleIterator.getCanale();
    }

    @Override
    void aggiungi(Canale nuovo, int pos) throws ImpossibileAggiungereAGestore {
        canali.remove(sceltaCanale(pos));
        canali.add(nuovo);
    }

    @Override
    void rimuovi(Canale daRimuovere) {
        canali.remove(getPosition(daRimuovere));
    }

    @Override
    Boolean giaInserito(Canale daVerificare) {
        CanaleIterator canaleIterator = new CanaleIterator(canali);
        /*while (){
        }*/
        return false;
    }

    public int getPosition(Canale daTrovare){
        int pos;
        CanaleIterator canaleIterator = new CanaleIterator(canali);
        while (canaleIterator.hasNext() || canaleIterator.getCanale() != daTrovare){
        }
        return canaleIterator.getPosition();
    }
    public void cambiaTrasmissione(Canale canale, Trasmissione trasmissione1, Trasmissione trasmissione2) {
        sceltaCanale(getPosition(canale)).cambiaTrasmissione(trasmissione1,trasmissione2);
    }

    public void aggiungiTrasmissione(Canale canale, Trasmissione trasmissione1) {
        sceltaCanale(getPosition(canale)).aggiungiTrasmissione(trasmissione1);
    }

    public void cercaTrasmissione() {

    }
}
