package uniud.ApplicazioneTv;

import uniud.ApplicazioneTv.eccezioni.TipoGestoreNonSupportato;

/**
 * Rappresenta un "produttore di produttori" di gestori
 */
public class ProduttoriGestori {

    /**
     * Restituisce una nuova istanza di un gestore produttore richiesto.
     * (Observer)
     * @param tipoGestore definisce il tipo di produttore richiesto
     * @return un nuovo gestore per il tipo specificato
     * @throws TipoGestoreNonSupportato se il tipo specificato non � conosciuto
     */
    public static Produttore getProduttore(Gestori tipoGestore) throws TipoGestoreNonSupportato{
        if(Gestori.CANALI.equals(tipoGestore)) {
            return new ProduttoreGestoreCanali();
        } else if (Gestori.REGISTRAZIONE.equals(tipoGestore)) {
            return new ProduttoreGestoreRegistrazione();
        } else {
            throw new TipoGestoreNonSupportato();
        }
    }
}
