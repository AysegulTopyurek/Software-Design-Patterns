package prototypePattern;

public class DeepCopyInJava {
	public static void main(String[] args)
    {
       Hospital2 medicines = new Hospital2("vitamin A", "Vitamin B", "Vitamin C");
 
        Patients patient1 = new Patients(111, "Ayþegül", medicines);
 
        Patients patient2 = null;
 
        try
        {
 
            patient2 = (Patients) patient1.clone();
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

