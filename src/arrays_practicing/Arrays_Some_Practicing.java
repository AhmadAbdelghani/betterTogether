package arrays_practicing;

import java.util.Arrays;
public class Arrays_Some_Practicing {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		numbers[0]=1;
		numbers[1]=2;
//		for(int elm : numbers) {      this enhanced loop it prints each element
//			System.out.println(elm);   in the array 
//		}
		
		//System.out.println(Arrays.toString(numbers));
		
		int[] numbers2 = {5,3,0,5,6,5};
		Arrays.sort(numbers2);  // this method sort the Array elements for us 
		System.out.println(numbers2.length+"\n"+ Arrays.toString(numbers2));
		// when we use Arrays.toString method then we can print the Arrays elements
		
		int count = 0;
		for (int i =0; i<numbers2.length; i++) {
			if (numbers2[i]==5) {
				count++;
			}
			
		}
		System.out.println(count);
		
		
//	String str = "axxxaaxx";
//	
//	String cut = "";
//	
//	for (int i =0; i < str.length(); i++) {
//		cut = cut + str.substring(0, i+1);
//	}
//	System.out.println(cut);
	
	int[] parkingTickets = {2, 2, 3, 2, 3, 4, 5};
	
	
	   int counter = 0;
	   
      for (int i=0; i < parkingTickets.length-1; i++) {
    	  if (parkingTickets[i]==parkingTickets[i+1]|| parkingTickets[i]==parkingTickets[i+1]+1) {
    		  counter++;
    	  }
      }
	System.out.println("the counter is "+counter);
	
	
	
	 Arrays.sort(parkingTickets);
	 
	 int k = parkingTickets[parkingTickets.length-1];
	 System.out.println(k);
	
	
	}
}
