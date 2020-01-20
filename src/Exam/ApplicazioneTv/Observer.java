package Exam.ApplicazioneTv;

public interface Observer {
    void aggiornaCanale(Canale canale);
    void aggiornaCanale(Canale canale,int monitor);
    void avviaRegistrazione(Trasmissione trasmissione);
    void annullaRegistrazione(Trasmissione trasmissione);
    boolean isPrenotata(Trasmissione trasmissione);
}
