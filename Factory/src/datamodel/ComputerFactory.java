package datamodel;
import datamodel.Computer;
import datamodel.Asus;
import datamodel.Dell;

public class ComputerFactory {

	
	
	
	public static Computer getComputer(String type, String ramSize, String processor, String cpu){
		if("Asus".equalsIgnoreCase(type)) return new Asus(ramSize, processor, cpu);
		else if("Dell".equalsIgnoreCase(type)) return new Dell(ramSize, processor, cpu);
		
		return null;
	}
	/*public static Computer createComputer(String type) {
		if(type.equals(Computer.ASUS)) {
			return new Asus(16,"Intelcorei7","4720HQ");
		}
		else if(type.equals(Computer.DELL)) {
			return new Dell("Intelcorei5");
		}else {
			return null;
		}
	}*/
}
