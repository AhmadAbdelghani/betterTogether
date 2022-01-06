package zoo;

public class Zoo1 {

	public static void main(String[] args) {
		
		Dog huske = new Dog("husky", 3,4,true);
		Cat cherry = new  Cat ("DSH", 3, 4, false);
		 Dog pitbull = new Dog("pitbull", 3, 4, true);
		
		huske.speak();
		cherry.speak();
		cherry.setType("scottch fold");
		String type = cherry.getType();
		System.out.println(type);
		
		pitbull.eats();
		pitbull.speak();
		
		
		Hamester habibi = new Hamester("habibi", 1, 4, false);
		
		habibi.eats();
		habibi.speak();
		
	}
	
	
	

}
