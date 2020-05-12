package observerpatternexample;

import java.util.ArrayList;
import java.util.List;

public class CEO implements Subject{
	 private List<Observer> observers = new ArrayList<>();
	 
	    @Override
	    public void addObserver(Observer o) {
	        observers.add(o);
	    }
	 
	    @Override
	    public void removeObserver(Observer o) {
	        observers.remove(o);
	    }
	 
	    @Override
	    public void notifyUpdate(NewCollection m) {
	        for(Observer o: observers) {
	            o.update(m);
	        }
	    }

}
