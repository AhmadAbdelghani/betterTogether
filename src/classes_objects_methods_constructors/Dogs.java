package classes_objects_methods_constructors;

public class Dogs {

	public static void main(String[] args) {
		
		Animals dog1 = new Animals("Maltese");
	            dog1.isNeutered = true;
	            dog1.color = "Gray";
	            dog1.size = "Small";
	            dog1.age = 1;
	            
	     Animals dog2 = new Animals("Huskey");
	            
	             dog2.isNeutered = true;
	             dog2.size = "larg";
	             dog2.color = "Black";
	             dog2.age = 3;
	            
	     Animals dog3 = new Animals("Chow Chow");        
	             dog3.age = 2;
	             dog3.isNeutered = false;
	             dog3.color = "Grey";
	             dog3.size = "Medium";
	    
	         System.out.println("the age is "+dog1.getAge());
	         dog1.getAnimalInfo();
	         
	             
	}

}
