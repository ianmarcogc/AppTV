package Exam.utente;

import Exam.ApplicazioneTv.Applicazione;
import Exam.ApplicazioneTv.ApplicazioneClient;

public class Main {

    public static void main(String[] args) {
        Applicazione app = new Applicazione();
        ApplicazioneClient cliente = new ApplicazioneClient(100, "italiano");

        app.addObserver(cliente);


    }
}
