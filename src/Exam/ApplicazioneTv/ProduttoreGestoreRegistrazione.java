package Exam.ApplicazioneTv;

/**
 * Rappresenta un produttore di gestori di registrazioni
 *
 */
public class ProduttoreGestoreRegistrazione implements Produttore {

    /**
     * Produce un gestore di men�. (Observer)
     * @return una nuova istanza di un gestore di registrazioni
     */
    @Override
    public GestoreRegistrazione produci() {
        return new GestoreRegistrazione();
    }

}
