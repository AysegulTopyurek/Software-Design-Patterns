package observerpatternexample;

public class Customer1 implements Observer {

@Override 
public void update(NewCollection m) {
	System.out.println("NEW COLLECTÝON WAS AMAZÝNG"+m.getCollectionContent());
}
}
