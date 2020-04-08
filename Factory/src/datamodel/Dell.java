package datamodel;

public class Dell extends Computer {

	private String ramSize;
	private String processor;
	private String cpu;
	
	public Dell(String ramSize, String processor, String cpu){
		this.ramSize=ramSize;
		this.processor=processor;
		this.cpu=cpu;
	}
	
	public String getRAM() {
		return this.ramSize;
	}


	public String getPROCESSOR() {
		return this.processor;
	}

	public String getCPU() {
		return this.cpu;
	}

}
