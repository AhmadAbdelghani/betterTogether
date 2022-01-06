package arrays_practicing;

import java.util.List;

public class Arrays {
  
	public static void main(String[] args) {
		// array = used to store multiple values in a single variable.
		
		String[] cars = {"Camaro", "Corvet", "Tesla"};
		
		cars[0] = "Mustang";
	//	System.out.println(cars[2]);
		
		
		String[] cars1 = new String[3];
		cars[0] = "Toyota";
		cars[1] = "BMW";
		cars[2] = "Hundai";
		//cars[3] = "hsjcb";
		//System.out.println(cars[2]);
	 
		
		for (int i=0; i < cars.length; i ++) {
			System.out.println(cars[i]);
		}
		
	int[] numbers = new int[5];
	numbers[0]=1;
	numbers[1]=2;
		
	int[] numbers2 = new int[1];
	int num = numbers[0];
	
	numbers2[0]=num;
	System.out.println(num);
	
	double[] tempratures= {2, 2, 3, 4, 5};
	
	double total= 0;
	int k=0;
	
	for (int i =0; i < tempratures.length-1; i++ ) {
		total = total + tempratures[i];
		
	}
	double avgTemp = total/tempratures.length+1;
	System.out.println(avgTemp);
	
			int[] currentMembers= {1,2,3,4,5};
			int memberID=1;
			boolean isAMember=false;
	         int b =0;
	         
	         
	    for (int i =0; i < currentMembers.length; i++) {
	    	b=currentMembers[i];
	    	if (b==memberID) {
	    		isAMember=true;
	    	}
	    		
	    	else
	    		isAMember=false;
	    }
	
		System.out.println(isAMember);
	}

	

	
	
}
