package uniud.ApplicazioneTv;

import uniud.ApplicazioneTv.eccezioni.ImpossibileAggiungereAGestore;

public class GestoreRegistrazione extends Gestore<Registratore>{
    @Override
    void aggiungi(Registratore nuovo, int pos) throws ImpossibileAggiungereAGestore {

    }

    @Override
    void rimuovi(Registratore daRimuovere) {

    }

    @Override
    Boolean giaInserito(Registratore daVerificare) {
        return null;
    }
}
