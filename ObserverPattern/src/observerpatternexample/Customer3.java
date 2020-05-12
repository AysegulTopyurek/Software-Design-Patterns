package observerpatternexample;

public class Customer3 implements Observer {
	@Override 
	public void update(NewCollection m) {
		System.out.println("Really nice"+m.getCollectionContent());
	}
}
