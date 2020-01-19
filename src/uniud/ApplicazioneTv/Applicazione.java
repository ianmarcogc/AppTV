package uniud.ApplicazioneTv;

import uniud.ApplicazioneTv.eccezioni.TipoGestoreNonSupportato;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Applicazione {

    private GestoreCanale gestoreCanale;
    private GestoreRegistrazione gestoreRegistrazione;
    public Applicazione(List<Integer> numeriTavoli) {
        try {
            //design-pattern "Factory"
            gestoreCanale = (GestoreCanale) ProduttoriGestori.getProduttore(Gestori.CANALI).produci();
            gestoreRegistrazione = (GestoreRegistrazione) ProduttoriGestori.getProduttore(Gestori.REGISTRAZIONE).produci();
        } catch (TipoGestoreNonSupportato tgns) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Tipo gestore non supportato");
        }

        /*if(numeriTavoli != null) {
            numeriTavoli.forEach(n -> gestoreComande.aggiungiTavolo(n));
        }*/

    }
    void sceltaCanale(int numero){ gestoreCanale.sceltaCanale(numero); }

    void sceltaCanale(int numero, int monitor){ gestoreCanale.sceltaCanale(numero,monitor); }

    void cambiaTrasmissione(Canale canale, Trasmissione trasmissione1, Trasmissione trasmissione2){

    }
    void aggiungiTrasmissione(Canale canale, Trasmissione trasmissione){

    }
    void cercaTrasmissione(/*QUERY*/){

    }
    void avviaRegistrazione(Trasmissione trasmissione){

    }

    void annullaRegistrazione(Trasmissione trasmissione){

    }
    void isPrenotata(Trasmissione trasmissione){

    }
}
