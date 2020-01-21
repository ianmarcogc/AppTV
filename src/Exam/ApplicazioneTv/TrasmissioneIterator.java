package Exam.ApplicazioneTv;

import java.util.*;

public class TrasmissioneIterator implements Iterator<Trasmissione> {
    private int current;
    final private Vector<Trasmissione> elements;
    TrasmissioneIterator(ArrayList s){
        if(s == null){
            throw new NullPointerException("Trasmissione not null");
        }
        List<Trasmissione> list = new Vector<Trasmissione>(s);
        this.elements = (Vector<Trasmissione>) ((Vector<Trasmissione>) list).clone();
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

