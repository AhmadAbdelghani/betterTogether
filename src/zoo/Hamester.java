package zoo;

public class Hamester extends Animal {

	public Hamester(String type, int age,int numberOfLeg, boolean eatMeat) {
		   super(type, age, numberOfLeg,eatMeat);
		}
 
	@Override
	public void speak() {
		System.out.println("Makes squizy sound");
	}
	
	@Override
	public void eats() {
		System.out.println("Eats hanesters food ");
	}
}
