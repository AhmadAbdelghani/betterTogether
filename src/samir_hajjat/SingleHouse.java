package samir_hajjat;

public class SingleHouse extends House {
     
	public  SingleHouse(int numberOfLevels, int numberOfRoom) {
		super(numberOfLevels, numberOfRoom);
		
	}
	
	public static void main(String[] args) {
		SingleHouse house1 = new SingleHouse(2, 4);
		TownHouse house2 = new TownHouse(2, 2);
		
		house2.setNumberOfLevels_Rooms(4, 10);
		
		System.out.println(house2.getNumberOfLevels());
		
	}
}
