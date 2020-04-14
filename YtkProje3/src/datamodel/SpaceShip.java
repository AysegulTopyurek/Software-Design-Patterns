package datamodel;

public class SpaceShip {
 private String name;
 private Integer crew;
 public SpaceShip(String name, Integer crew) {
	 this.name =name;
	 this.crew = crew;
	 
 }
 public String getName() {
	 return name;
 }
 public Integer getCrew() {
	 return crew;
 }
public void setName(String name) {
	this.name = name;
}
public void setCrew(Integer crew) {
	this.crew = crew;
}
}
