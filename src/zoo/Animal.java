package zoo;

public class Animal {

	private String type;
	private int age;
	private  int numberOfLeg=4;
	private boolean eatMeat;
	
	public Animal(String type, int age,int numberOfLeg, boolean eatMeat) {
		this.type = type;
		this.age = age;
		this.numberOfLeg = numberOfLeg;
		this.eatMeat = eatMeat;
	}
	

	
	
	public void speak() {
		System.out.println("this animal talks");
	}
	
	
	public void eats() {
		System.out.println("this animal eats meet");
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getNumberOfLeg() {
		return numberOfLeg;
	}


	public void setNumberOfLeg(int numberOfLeg) {
		this.numberOfLeg = numberOfLeg;
	}


	public boolean isEatMeat() {
		return eatMeat;
	}


	public void setEatMeat(boolean eatMeat) {
		this.eatMeat = eatMeat;
	}
	
	
	
	
}
