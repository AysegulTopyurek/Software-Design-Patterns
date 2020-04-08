package datamodel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpaceStation {
 private String name;
 private List<SpaceShip> spaceShips;
 
 public SpaceStation(String name) {
	 this.name = name;
	 spaceShips = new ArrayList<>();
 }
 public void addShip(SpaceShip spaceShip) {
	 spaceShips.add(spaceShip);
 }
 public List<SpaceShip> getSpaceShips(){
	 return spaceShips;
 }
 public SpaceShip getbyName(String name) {
	List<SpaceShip> collect = spaceShips.stream()
	 .filter(s -> s.getName().equalsIgnoreCase(name))
	 .collect(Collectors.toList());
	 return collect.get(0);
 }
 
}
