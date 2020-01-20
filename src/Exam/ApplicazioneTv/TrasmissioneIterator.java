package Exam.ApplicazioneTv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

public class TrasmissioneIterator implements Iterator<Trasmissione> {
    private int current;
    final private Vector<Trasmissione> elements;
    TrasmissioneIterator(ArrayList s){
        if(s == null){
            throw new NullPointerException("Trasmissione not null");
        }
        this.elements = (Vector<Trasmissione>) s.clone();
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return (this.current < this.elements.size());
    }

    @Override
    public Trasmissione next() {
        if(hasNext()){
            this.current++;
            return (this.elements.get(this.current-1));
        } else{
            throw new NoSuchElementException("Non trovato");
        }
    }

    public int getPosition(){
        return this.current;
    }

    public Trasmissione getTrasmissione(){
        return this.elements.get(this.current);
    }

    public void reset(){
        this.current = 0;
    }
}

