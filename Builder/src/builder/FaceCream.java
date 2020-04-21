package builder;
//Concreate builder
public class FaceCream implements CreamBuilder{
	 private Cream cream;
	 
	 public FaceCream()
	 {
	  cream  =new Cream();
	 }
	 public void buildType() {
	  System.out.println(" Cream type : Normal skin");
	  cream.setType(" Type for cream ");
	 }
	 
	 public void buildCategory() {
	  System.out.println("Cream Category : Skin Care");
	  cream.setCategory("Category for cream");
	 }
	 public void buildAgeGroup() {
	  System.out.println("Age Group: 30+");
	  cream.setAgeGroup("Age Group");
	 }
	 
	 public void buildContent() {
	  System.out.println("Contents:Vitamin c,Water, Lauryl Lactate");
	  cream.setContent("Content");
	 }

	 public Cream getCream() {
	  return cream;
	 }
}
