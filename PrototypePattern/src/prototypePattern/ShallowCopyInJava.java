package prototypePattern;

public class ShallowCopyInJava {

	public static void main(String[] args)
    {
       Hospital medicines = new Hospital("vitamin A", "Vitamin B", "Vitamin C");
 
        Patient patient1 = new Patient(111, "Ayþegül", medicines);
 
        Patient patient2 = null;
 
        try
        {
           
 
            patient2 = (Patient) patient1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
 
        System.out.println(patient1.hospital.medicine3);         
 
        patient2.hospital.medicine3 = "Vitamin D";
 
        System.out.println(patient1.hospital.medicine3); 
}
}
