package prototypePattern;

class Hospital2 implements Cloneable
{
	String medicine1;
	 
    String medicine2;
 
    String medicine3;
 
    public Hospital2(String med1, String med2, String med3)
    {
        this.medicine1 = med1;
 
        this.medicine2 = med2;
 
        this.medicine3 = med3;
    }
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
 
class Patients implements Cloneable
{
    int id;
 
    String name;
 
    Hospital2 hospital;
 
    public Patients(int id, String name, Hospital2 hospital)
    {
        this.id = id;
 
        this.name = name;
 
        this.hospital = hospital;
    }
 
 
    protected Object clone() throws CloneNotSupportedException
    {
        Patients patient = (Patients) super.clone();
 
        patient.hospital = (Hospital2) hospital.clone();
 
        return patient;
    }
}
