package arrays_practicing;

import java.util.ArrayList;

import java.util.Arrays;

public class ArrayList_Methods {

	Integer myInt;
	
	// code lap question 
	public static String f(ArrayList<String> words) {
		String s = "";
		for (int i=0; i<words.size(); i++) {
			s += words.get(i).charAt(0);
		}
		return s;
	}
	
	
	public static ArrayList<Integer> reverse(ArrayList<Integer> nums){
		   int temp =0;
		for (int i =0; i < nums.size()/2; i++ ) {
			temp=nums.get(i);
			nums.set(i, nums.size()-1-i);
			nums.set(nums.size()-1-i, temp);
			
		}
		return nums;
	}
	
	
	
	public static int claculate(ArrayList<Integer> nums) {
		int sum =0;
		for ( int i =0; i < nums.size();) {
			if (nums.get(i)<0) {
				nums.remove(i);
				
			}else {
				sum+=nums.get(i);
				i++;
			}
			
		}
		return sum;
	}
	
	
	public static int reverseCalculate(ArrayList<Integer> nums2) {
		int sum =0;
		
		while(nums2.size()>0) {
			int temp = nums2.remove(0);
			if(temp >0){
				sum+=temp;
			}
			System.out.println(nums2);
		}
		
		return sum ;
	}
	
	public static String removeX(String str) {
		char [] charArr = str.toCharArray();
		String str1 = "";
		for (int i =0 ; i< charArr.length;i++) {
			if(charArr[i] != 'x' || i ==0 || i == charArr.length-1) {
				str1+=charArr[i];
			}
		}
		
		return str1;
		
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayList<String> lists = new ArrayList();
		lists.add("ahmad");
		lists.add("hello");
		lists.add("goodby");
		lists.add("hi");
		lists.add("salam");
	      System.out.println(f(lists));
	      
	      ArrayList<Integer> numbers = new ArrayList<>();
	      numbers.add(-11);
	      numbers.add(-55);
	      numbers.add(-1);
	      numbers.add(100);
	      numbers.add(1);
	      numbers.add(2);
	      numbers.add(3);
	      
	      

	      int[] numbers1 = {1, 3, 4, 7};
	      
	      String array = Arrays.toString(numbers1);
	      
	      System.out.println(reverseCalculate(numbers));
	      
	      
	      
	      String str = "the quick fox jumped over the lazy dog";
	      String str3 = "";
	      int index = 10;
	      if (str.charAt(index)==' ') {
	    	  str3 = str.substring(0, index);
	      } else {
	    	  str3 =str.substring(0,str.substring(0,index).lastIndexOf(' '));
	      }
	      
	      System.out.println("*****");
	      System.out.println(str3);
	      System.out.println("*****");
	      
	      
	     
           
	       
	      
	      
	      
//	      System.out.println(removeX(str));
	      
		
	}
}
