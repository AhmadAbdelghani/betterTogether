package classes_objects_methods_constructors;

public class Development_Site {

	public static void main(String[] args) {
		
		House obj1 = new House();
		   
		      obj1.setName("Boreeni House");
		      obj1.setDesighn("American design");
		      obj1.setNumOfLevels(2);
		      obj1.setLocation("Fiarfax");
			 
		      
		House obj2 = new House("Ahamd house", 2 , "Fairfax", "American" );
		 String a = obj2.getName();
		 System.out.println(a);
		 
		 House obj4 = new House("Samer House", 9, "Clifton", "Greek Style");
		 
		 House obj3 = new House();
		       obj3.setName("Rashad hose");
		       obj3.setNumOfLevels(5);
		       obj3.setDesighn("Arabic Design");
		       obj3.setLocation("California");
		       
		 
		
		obj4.printHouseInfo();
		obj2.printHouseInfo();
		obj1.printHouseInfo();
		obj3.printHouseInfo();
		 
		 House obj5 = new House(2, "Play Ground");
		 obj5.printHouseInfo();;
		 
		 
		 House obj6 = new House(3);
		 House obj7 = new House("Sultan");
		 
	}

}
