package uniud.ApplicazioneTv;
/**
 * Rappresenta un produttore di gestori di registratori
 *
 */
public class ProduttoreGestoreRegistrazione implements Produttore {

    /**
     * Produce un gestore di men�. (Observer)
     * @return una nuova istanza di un gestore di comande
     */
    @Override
    public GestoreRegistrazione produci() {
        return new GestoreRegistrazione();
    }

}
