package Exam.ApplicazioneTv;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Rappresenta un produttore di gestori di canali
 *
 */

public class ProduttoreGestoreCanali implements Produttore {

    /**
     * Produce un gestore di men�. (Observer)
     * @return una nuova istanza di un gestore di canali
     */
    @Override
    public GestoreCanale produci() {
        ArrayList canali = new ArrayList<Canale>();
        LocalDateTime dateTime = LocalDateTime.now();
        Canale canaleTemp;
        ArrayList trasmissioneTemp = new ArrayList<Trasmissione>();
        trasmissioneTemp.add(0,new Trasmissione("CAMMELLI", "nessuna schedaInformativa", "italiano", null, Genere.INFORMAZIONI, dateTime.now()));
        for (int i = 0; i < 10; i++){
            canali.add(i, new Canale("canale"+i,i, trasmissioneTemp));
        }
        return new GestoreCanale(canali);
    }

}