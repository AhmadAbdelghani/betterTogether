package array_list_practicing;

import practicinn_acces_modefier.Elephant;
import practicinn_acces_modefier.GetElephanTrunch;

public class AsianElephant extends Elephant {

	public static void main(String[] args) {
		// 
AsianElephant elephant2 = new AsianElephant();
		
		// instant variables we can access 
		elephant2.age=2;
		elephant2.trunckLength=4;
		
		System.out.println(elephant2.trunckLength);
		System.out.println(elephant2.age);
		
		// methods we can access because it's public 
		elephant2.move();
		
		// we couldn't access the hoard method because it's default (Package access)
		
		// create Create an object of Elephant in the Asian Elephant
		Elephant elephant4 = new Elephant();
		elephant4.age=4; // we are able to access the age instance variable because it's public 
		elephant4.move();// as well we are able to access the move methods because it's public as well
		
	
		// this one way we can get the protected instance variable  
		GetElephanTrunch getTrunk = new GetElephanTrunch();
		getTrunk.getTrunck();
		
		
	}
}
