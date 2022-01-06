package arrays_practicing;

import java.util.Arrays;
import java.util.List;

public class Applying_The_methods {

	public static void main(String[] args) {
		
		
		
		String[] texts1 = {"Ahmad","Mohammad", "Mahmoud", "Atef", "Haitham"};
		
		
		List<Integer> nums = Arrays.asList(new Integer[] {1,3,5,6,8,9});
		
         System.out.println(nums);
         
         
         List<String> names = Arrays.asList ("Sami", "Akram", "Mohanad");
         
         List<Double> numbers = Arrays.asList(new Double[] {0.10, 0.15, 0.20, 0.25});
         
         numbers.set(0, null);
         System.out.println(numbers);
		

	}

}
