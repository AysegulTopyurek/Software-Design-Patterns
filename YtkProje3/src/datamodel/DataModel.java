package datamodel;

public class DataModel {
private static DataModel datamodel = null;
private SpaceStation spaceStation;
private String modelName;


private DataModel() {
	
 spaceStation = new SpaceStation("Big spacestation");
 spaceStation.addShip(new SpaceShip("MX1",100));
 spaceStation.addShip(new SpaceShip("MX2",400));
 spaceStation.addShip(new SpaceShip("MX3",300));
 spaceStation.addShip(new SpaceShip("MX4",200));
}
public static DataModel getInstance() {
	if(datamodel == null) {
		synchronized(DataModel.class) {
			if(datamodel == null)
				datamodel = new DataModel();
	}
		}
 return datamodel;
}
 public SpaceStation getSpaceStation() {
	 return spaceStation;
 }
 public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
}
