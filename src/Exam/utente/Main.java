package Exam.utente;

import Exam.ApplicazioneTv.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Applicazione app = new Applicazione();
        ApplicazioneClient cliente = new ApplicazioneClient(100, "italiano");

        app.addObserver(cliente);

        LocalDateTime dateTime = LocalDateTime.MIN;
        ArrayList trasmissioneTemp = new ArrayList<Trasmissione>();
        Trasmissione trasmissione1 = new Trasmissione("CAMMELLI", "nessuna schedaInformativa", "italiano", null, Genere.INFORMAZIONI, dateTime);
        Trasmissione trasmissione2 = new Trasmissione("MICHELANGELO", "nessuna schedaInformativa", "italiano", null, Genere.ARTE, dateTime);
        trasmissioneTemp.add(0,trasmissione1);

        System.out.println(dateTime);
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
