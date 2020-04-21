package builder;

public class HairCream implements CreamBuilder {
	 private Cream cream;
	 
	 public HairCream()
	 {
	  cream  =new Cream();
	 }
	 public void buildType() {
	  System.out.println("Cream Type : Curly Hair");
	  cream.setType(" Type for cream ");
	 }
	 
	 public void buildCategory() {
	  System.out.println("Cream Category : Moisturizer");
	  cream.setCategory("Category for cream");
	 }
	 public void buildAgeGroup() {
	  System.out.println("Age Gou : For all");
	  cream.setAgeGroup("Age Group");
	 }
	 
	 public void buildContent() {
	  System.out.println("Contents :Aloe vera,Carnitine,Ceramide ");
	  cream.setContent("Content");
	 }

	 public Cream getCream() {
	  return cream;
	 }
}


