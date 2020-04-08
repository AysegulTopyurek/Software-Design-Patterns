package datamodel;
import datamodel.ComputerFactory;
import datamodel.Computer;
public class Debug {
public static void main(String[] args) {
	
	Computer asus = ComputerFactory.getComputer("asus","2 GB","500 GB","2.4 GHz");
	Computer dell = ComputerFactory.getComputer("dell","16 GB","1 TB","2.9 GHz");
	System.out.println("Factory Asus::"+asus);
	System.out.println("Factory Dell::"+dell);
}
}
