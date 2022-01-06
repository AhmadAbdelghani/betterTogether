package zoo;

public class Dog extends Animal {
    
	public Dog(String type, int age,int numberOfLeg, boolean eatMeat) {
	   super(type, age, numberOfLeg,eatMeat);
	}
	
	@Override
	public void speak() {
		System.out.println("this animal bark");
	}
	
	@Override
	public void eats() {
		System.out.println("this animal eats dog food");
	}
}
