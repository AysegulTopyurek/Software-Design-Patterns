package observerpatternexample;

public class Customer2 implements Observer {

@Override 
public void update(NewCollection m) {
	System.out.println("NEW COLLECTÝON WAS BAD"+m.getCollectionContent());
}
}
