package datamodel;

public abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getPROCESSOR();
	public abstract String getCPU();
	
	
	public String toString(){
		return "RAM= "+this.getRAM()+", PROCESSOR="+this.getPROCESSOR()+", CPU="+this.getCPU();
	}
}