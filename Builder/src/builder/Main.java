package builder;

public class Main {

	public static void main(String[] args) {
		
	System.out.println("PRODUCT1");
	  CreamBuilder faceCream=new FaceCream();
	  CreamMaker maker=new CreamMaker(faceCream);
	  maker.Maker(); 
	  System.out.println("PRODUCT2");
	  Cream cream = maker.getCream(); 
	  CreamBuilder hairCream=new HairCream();
	  CreamMaker maker2=new CreamMaker(hairCream);
	  maker2.Maker(); 
	  
      Cream cream2 = maker2.getCream(); 

      System.out.println(" result: "+ cream); 
      System.out.println(" result: "+ cream2); 
	 }

}
