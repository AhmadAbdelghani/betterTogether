package samir_hajjat;

public class Burke {

	public static void main(String[] args) {
		
		TownHouse obj1 = new TownHouse(3,3);
		obj1.setIsOnSale(true);
		obj1.setNameOfOwner("Tha2er");
		
		
	    SingleHouse obj2 = new SingleHouse(1, 5);
	    obj2.setNameOfOwner("Ahmad");
	    obj2.setIsOnSale(false);
	    obj2.printInfo();
	    obj1.printInfo();
	 

	}

}
