package builder;
//Director krem için
public class CreamMaker {
	
	 private  CreamBuilder creamBuilder; 
	  
	    public CreamMaker(CreamBuilder creamBuilder) 
	    { 
	        this.creamBuilder = creamBuilder; 
	    } 
	  
	    public Cream getCream() 
	    { 
	        return this.creamBuilder.getCream(); 
	    } 
	  
	    public void Maker() 
	    { 
	        this.creamBuilder.buildType(); 
	        this.creamBuilder.buildCategory(); 
	        this.creamBuilder.buildAgeGroup(); 
	        this.creamBuilder.buildContent(); 
	    } 
}
