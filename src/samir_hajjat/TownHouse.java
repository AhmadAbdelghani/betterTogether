package samir_hajjat;

public class TownHouse extends House {
    public TownHouse(int numberOfLevels, int numberOfRoom ) {
    	super(numberOfLevels, numberOfRoom);
    
    }
    
	public static void main(String[] args) {
		
		SingleHouse house = new SingleHouse(1, 4);
		
		
		TownHouse house2 = new TownHouse(3, 6);
		
		
	}
	
}
