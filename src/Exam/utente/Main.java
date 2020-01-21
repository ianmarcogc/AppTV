package Exam.utente;

import Exam.ApplicazioneTv.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
         *NON INSERIRÒ QUESTO COMMENTO IN ESAME, È SOLO PER VELOCIZZARE LA COMPRENSIONE
         *
         * il problema di questo proggetto è che ho docuto modificare la struttura in corso di svolgimento, la prego
         * di dirmi in qualsiasi caso tutto quello che non va bene
         * per comodità ho usato parti di codice fatto in classe(è già commentato ed è testato)
         * non ho implementato tutto per mancanza di tempo
         * non ho commentato le funzioni più semplici
         *
         * Le implementazioni principali sono:
        * L'Observer ApplicazioneClient per simulare una persona da casa che registra e vede la tv
        * Una Factory per i gestori
        *
        *
        * DOMANDA: avendo due iteratori praticamente uguali avrebbe avuto senso creare un interfaccia, sarebbe stata meglio una classe astratta
        * o è meglio così?
        * DOMANDA: per la creazione dei canali sarebbe stato meglio farla con un builder? e per le trasmissioni?
        * DOMANDA: avrei dovuto creare anche il gestore delle trasmissioni? uno per ogni canale? non mi convince,
        * ma avrebbe un risultato positivo?
        * */
        Applicazione app = new Applicazione();
        ApplicazioneClient cliente = new ApplicazioneClient(100, "italiano");

        app.addObserver(cliente);

        LocalDateTime dateTime = LocalDateTime.MIN;
        ArrayList trasmissioneTemp = new ArrayList<Trasmissione>();
        Trasmissione trasmissione1 = new Trasmissione("CAMMELLI", "nessuna schedaInformativa", "italiano", null, Genere.INFORMAZIONI, dateTime);
        Trasmissione trasmissione2 = new Trasmissione("MICHELANGELO", "nessuna schedaInformativa", "italiano", null, Genere.ARTE, dateTime);
        trasmissioneTemp.add(0,trasmissione1);

        Canale canale1 = new Canale("canale0", 0, trasmissioneTemp);
        app.aggiungiTrasmissione(canale1,trasmissione1);
        app.cambiaTrasmissione(canale1,trasmissione1,trasmissione2);
        if(app.isPrenotata(trasmissione1)){
            System.out.println("presente");
        } else {
            System.out.println("non presente");
        }
    }
}
