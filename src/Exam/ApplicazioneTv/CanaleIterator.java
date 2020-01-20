package Exam.ApplicazioneTv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

public class CanaleIterator implements Iterator<Canale> {
    private int current;
    final private Vector<Canale> elements;
    CanaleIterator(ArrayList s){
        if(s == null){
            throw new NullPointerException("Canale not null");
        }
        this.elements = (Vector<Canale>) s.clone();
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return (this.current < this.elements.size());
    }

    @Override
    public Canale next() {
        if(hasNext()){
            this.current++;
            return (this.elements.get(this.current-1));
        } else{
            throw new NoSuchElementException("Non trovato");
        }
    }

    public int getNumber(){
        return this.elements.get(this.current).getNumero();
    }

    public int getPosition(){
        return this.current;
    }

    public Canale getCanale(){
        return this.elements.get(this.current);
    }

    public void reset(){
        this.current = 0;
    }
}
