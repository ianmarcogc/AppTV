package Exam.ApplicazioneTv;

import java.time.LocalDateTime;
import java.util.Map;

public class Trasmissione {
    private String titolo, schedaInformativa, linguaDefault;
    private Map<String,String> elencoLingue;   // linua - sottotitoli
    private Genere genere;
    LocalDateTime dateTime;

    public Trasmissione(String titolo, String schedaInformativa, String linguaDefault, Map<String, String> elencoLingue, Genere genere, LocalDateTime dateTime) {
        this.titolo = titolo;
        this.schedaInformativa = schedaInformativa;
        this.linguaDefault = linguaDefault;
        this.elencoLingue = elencoLingue;
        this.genere = genere;
        this.dateTime = dateTime;
    }

    public boolean equals(Trasmissione trasmissione){
        if (titolo.equals(trasmissione.titolo) && schedaInformativa.equals(schedaInformativa)){
            return true;
        }
        return false;
    }
}
