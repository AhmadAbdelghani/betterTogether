package arrays_practicing;

import java.util.ArrayList;
import java.util.Arrays;

public class Two_Dymention_Arrays {

	public static void main(String[] args) {
		
		String[] friendsArray = new String[4];
		friendsArray[0]="Ahmad";
		friendsArray[1]="Rami";
		friendsArray[2]="Atef";
		friendsArray[3]="Hamzeh";
		
//		for (int i =0; i < friendsArray.length; i++) {
//			System.out.println(i+" "+friendsArray[i]);
//		}
		
		
//	for (String elm: friendsArray) {
//		System.out.print(elm+" ");
//	}	
		
		
		String[] friendsArray1 = {"Taha", "Mohammad", "Samer", "sanad"};
		
		ArrayList<String> friendsArrayList =
				new ArrayList<String>(Arrays.asList("Ahmad", "Atef", "Lobani", "Samer"));
		
		System.out.println(friendsArray1[1]);
		System.out.println(friendsArrayList.get(1));
		
		friendsArrayList.set(0, null);
		
		int length1 = friendsArray1.length;
		System.out.println(length1);
		
		int size = friendsArrayList.size();
		System.out.println(size);
		
		
	//	friendsArrayList.set(0, "Boreeni");
		//System.out.println(friendsArrayList.get(0));
		
		for (String elm : friendsArrayList) {
			System.out.println(elm);
		}
		System.out.println("==========================");
		
		for (int i =0; i < friendsArrayList.size(); i ++) {
			System.out.println(friendsArrayList.get(i));
		}
		
		System.out.println("==========================");
		
		friendsArrayList.add("Bara2");
		
		for (String elm : friendsArrayList) {
			System.out.println(elm);
		}
		
		friendsArrayList.remove(0);// when you remove element from the ArrayList the order of the index is re order again 
		String a = friendsArrayList.get(0);// i mean the index that was second index is now the first an so on
		System.out.println(a);
		
		
		System.out.println(friendsArrayList.size());
		System.out.println(friendsArrayList.get(0));
		
		System.out.println(friendsArrayList);
		
		System.out.println(friendsArray.toString());
		
		int x;
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(9);
		nums.add(10);
		nums.add(3);
		nums.add(4);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(2);
		nums.add(3);
		
		
		  int k = 2;
		for (int i =0; i<nums.size()/2; i++) {
			if (nums.get(i)==k)
				nums.set(i+1, nums.get(i+1)*2);
			
		}
		System.out.println(nums);
		
		
//		nums.set(0, nums.get(0)+10);
//		System.out.println(nums.get(0));
		
		
		
		
		
	}

}
