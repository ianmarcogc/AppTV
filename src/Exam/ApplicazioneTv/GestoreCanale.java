package Exam.ApplicazioneTv;

import Exam.ApplicazioneTv.eccezioni.ImpossibileAggiungereAGestore;

import java.util.ArrayList;

public class GestoreCanale extends Gestore<Canale>{

    ArrayList canali;

    public GestoreCanale(ArrayList canali) {
        this.canali = canali;
    }

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
        CanaleIterator canaleIterator = new CanaleIterator(canali);
        while (canaleIterator.hasNext()){
            Canale c = canaleIterator.getCanale();//equals(daTrovare)
            if(c.equals(daTrovare)){
                return canaleIterator.getPosition();
            }
            canaleIterator.next();
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
