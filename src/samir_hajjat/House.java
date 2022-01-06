package samir_hajjat;

public class House {

	private int numberOfLevels;
	private int numberOfRoom;
	private boolean isOnSale;
	private String nameOfOwner;
	
	
	public House (int numberOfLevels, int numberOfRoom ) {
		this.numberOfLevels = numberOfLevels;
		this.numberOfRoom = numberOfRoom;
	}
	
	public void setNumberOfLevels_Rooms(int numberOfLevels, int numberOfRoom) {
		this.numberOfLevels = numberOfLevels;
		this.numberOfRoom=numberOfRoom;
	}
	
	
	
	public void setIsOnSale(boolean isOnSale) {
		this.isOnSale = isOnSale;
	}
	public void setNameOfOwner(String nameOfOwner) {
		this.nameOfOwner = nameOfOwner;
	}
	
	public int getNumberOfLevels() {
		return numberOfLevels;
	}
	
	public int getNumberOfRoom() {
		return numberOfRoom;
	}
	
	public String getNameOfOwner() {
		return nameOfOwner;
	}
	public boolean getIsOnSale() {
		return isOnSale;

	
	
	}
	
	

	
	public void printInfo() {
		System.out.println ("House numberOfLevels=" + numberOfLevels + ", numderOfRoom=" + numberOfRoom + ", isOnSale=" + isOnSale
				+ ", nameOfOwner=" + nameOfOwner)  ;
	}
	}

