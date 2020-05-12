package observerpatternexample;

public class Test {

	public static void main(String[] args) {
		Customer1 c1 = new Customer1();
        Customer2 c2 = new Customer2();
        Customer3 c3 = new Customer3();
       
       CEO p = new CEO();
         
        p.addObserver(c1);
        p.addObserver(c2);
       
         
        p.notifyUpdate(new NewCollection("-----First Message"));   
         
        p.removeObserver(c2);
        p.addObserver(c3);
         
        p.notifyUpdate(new NewCollection("-----Second Message"));

	}

}
