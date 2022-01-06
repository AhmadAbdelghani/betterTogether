package arrays_practicing;

import java.util.Arrays;

public class Methods_Arrays {

	public static void printArray(int[] array) {
		
		for (int elm: array) {
			System.out.print(elm+", ");
		}
	}
    public static int sumArray(int[] array) {
    	int sum = 0;
    	for (int i =0; i < array.length; i++) {
    		sum = sum + array[i];
    	}
    	return sum;
    }
    
    
    public static boolean isReverse(int[] a, int[] b) {
    	
    	int k;
    	for (k=0; k<a.length && a[k]==b[a.length-1-k]; k++);
    	return k==a.length;
    }
    
    
    public static void reverse(int[] array) {
    	
    	
    	for (int i =0; i<array.length/2; i++) {
    		int temp = array[i];
    		array[i]=array[array.length-1-i];
    		array[array.length-1-i]=temp;
    	}
    }
    
    
	
	public static void main(String[] args) {
		
		
		
		
		int[] nums = {1,2,3,4,5,6,7};
		
		
		int[] nums1 = {7,6,5,4,3,2,1};
		
		printArray(nums);
		int sum = sumArray(nums);
		System.out.println(sum);
		
		boolean bol2 = isReverse(nums, nums1);
		System.out.println(bol2);
		//System.out.println(nums.length);
		 reverse(nums);
		
		 for (int i =0; i < nums.length-1; i++) {
			 
		 }
		 
		
		
		
	}
	
}
