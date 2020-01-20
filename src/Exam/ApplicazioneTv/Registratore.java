package Exam.ApplicazioneTv;

import java.util.ArrayList;

public class Registratore {
    ArrayList registrazioni;

    public Registratore() {
        registrazioni = new ArrayList<Trasmissione>();
    }

    public Registratore(ArrayList registrazioni) {
        this.registrazioni = registrazioni;
    }


    public void aggiungi(Trasmissione trasmissione) {
        registrazioni.add(trasmissione);
    }

    public void annullaRegistrazione(Trasmissione trasmissione) {
        for (int i = 0; i < registrazioni.size(); i++) {
            if(registrazioni.get(i) == trasmissione){
                registrazioni.remove(i);
            }
        }
    }

    public boolean isPrenotata(Trasmissione trasmissione) {
        for (int i = 0; i < registrazioni.size(); i++) {
            if(registrazioni.get(i) == trasmissione){
                return true;
            }
        }
        return false;
    }
}
