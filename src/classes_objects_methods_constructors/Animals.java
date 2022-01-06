package classes_objects_methods_constructors;

public class Animals {

	
		String type;
		int age;
		String size;
		boolean isNeutered;
		String color;
		
		
		public Animals () {
			System.out.println("new animal is being added");
			
			
		}
		
		
		public void bark() {
			System.out.println("This animala bark!");
		}
		
		public void eat() {
		  System.out.println("This animal eats 3 times a day");
		}
	
	   public void drink() {
		   System.out.println("this animal drinks twice a day");
	   }
	   
	   public void run() {
		   System.out.println("This animal runs");
	   }
	   
	   public Animals(String type) {
		   this.type = type;
		   
	   }
	   
	
	   
	   public void getAnimalInfo() {
		   System.out.println(""+type+" "+age+" "+size+" "+isNeutered+" "+color);
		   
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


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public boolean isNeutered() {
		return isNeutered;
	}


	public void setNeutered(boolean isNeutered) {
		this.isNeutered = isNeutered;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
}
