package classes_objects_methods_constructors;

public class House {

	private int numOfLevels;
	private String name;
	private String location;
	private String desighn;
	
	
	
	public int getNumOfLevels() {
		return numOfLevels;
	}



	public void setNumOfLevels(int numOfLevels) {
		this.numOfLevels = numOfLevels;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getDesighn() {
		return desighn;
	}



	public void setDesighn(String desighn) {
		this.desighn = desighn;
	}



	public House() {
		
		System.out.println("constructor 1");
	}
	
	public House(int numOfLevels) {
		
		this();
		System.out.println("constroctor 4");
		this.numOfLevels = numOfLevels;
	}
	
	public House(String name) {
		this();
	
		this.name = name;
	}
	
	public House(int numOfLevels, String name ) {
		this();
		System.out.println("constructor 3");
		this.numOfLevels = numOfLevels;
		this.name = name;
		
	}
	
	public House(String name, int numOfLevels) {
		this();
		System.out.println("constroctor 3");
		this.name = name;
		this.numOfLevels = numOfLevels;
	}
	
	public House (String name, int numOfLevels, String location, String desighn) {
		this();
		this.name = name;
		this.location = location;
		this.numOfLevels = numOfLevels;
		this.desighn = desighn;
	}
	
	public void printHouseInfo() {
		System.out.println(name + " "+ location+" "+numOfLevels+" levels "+desighn);
	}
	
	

	
}
