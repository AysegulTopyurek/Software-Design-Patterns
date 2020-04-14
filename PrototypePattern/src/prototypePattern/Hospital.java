package prototypePattern;

public class Hospital {
	 String medicine1;
	 
	    String medicine2;
	 
	    String medicine3;
	 
	    public Hospital(String med1, String med2, String med3)
	    {
	        this.medicine1 = med1;
	 
	        this.medicine2 = med2;
	 
	        this.medicine3 = med3;
	    }
	}
	 
	class Patient implements Cloneable
	{
	    int id;
	 
	    String name;
	 
	    Hospital hospital;
	 
	    public Patient(int id, String name, Hospital hospital)
	    {
	        this.id = id;
	 
	        this.name = name;
	 
	        this.hospital = hospital;
	    }
	 
	    
	 
	    protected Object clone() throws CloneNotSupportedException
	    {
	        return super.clone();
	    }
}
