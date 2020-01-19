package uniud.ApplicazioneTv;

/**
 * Rappresenta un produttore di gestori di canali
 *
 */

public class ProduttoreGestoreCanali implements Produttore {

    /**
     * Produce un gestore di men�. (Observer)
     * @return una nuova istanza di un gestore di comande
     */
    @Override
    public GestoreCanale produci() {
        return new GestoreCanale();
    }

}