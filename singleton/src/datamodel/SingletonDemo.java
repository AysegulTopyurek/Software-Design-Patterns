package datamodel;



public class SingletonDemo {
	
	public static void main(String[] args) {
		DataModel model = DataModel.getInstance();
		model.setModelName("New SHÝP");
		System.out.printf(model.getModelName()+"%n");
		// Lambda Runnable
        Runnable task1 = () -> {
        	DataModel model1 = DataModel.getInstance();
        	model1.getSpaceStation().addShip(new SpaceShip("Flat" ,123));
        	System.out.printf(model1.getModelName()+"%n");
        	new SpaceShipPrintOutHelper().printAll();
        };
        new Thread(task1).start();
        
        //DataModel.getInstance().getSpaceStation().addShip(new SpaceShip("Almost flat" , 10));
     // Lambda Runnable
        
        Runnable task2 = () -> {
        DataModel model2 = DataModel.getInstance();
        	//DataModel.getInstance().getSpaceStation().addShip(new SpaceShip("Almost flat" , 10));
        	model2.setModelName("New Ship2");
        	System.out.printf(model2.getModelName()+"%n");
        	new SpaceShipPrintOutHelper().printAll();
        };
        new Thread(task2).start();
		
        System.out.printf("------------------------------%n");
		new SpaceShipPrintOutHelper().printAll();
	}
}
