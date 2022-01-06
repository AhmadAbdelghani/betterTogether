package array_list_practicing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.Collection;

public class Bank_OfAm {

	public static void main(String[] args) {
		
		// task one 
		
		ArrayList<String> personal = new ArrayList<>();
		personal.add("Small Business");
		personal.add("Wealth Managment");
		personal.add("Security");
		personal.add("About Us");
		
		ArrayList<String> checking = new ArrayList<>();
		checking.add("Savings");
		checking.add("Credit Cards");
		checking.add("Home Laons");
		checking.add("Auto Loans");
		checking.add("Investing");
		checking.add("Better Money Habits");
		
		
		checking.add(personal.get(1)); // this is one way 
		
		//checking.remove(5); // this is one way by using the index
		checking.remove("Better Money Habits");
		
		System.out.println(checking);
		
		// sort second list
		Collections.sort(checking);
		System.out.println(checking);
		
		//check if the second array contains the same element asd thr first array
		
		System.out.println(checking.equals(personal));
		
		
		
		
		
		
		
		
		
	}
}
