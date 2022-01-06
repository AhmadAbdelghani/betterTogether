package practicinn_acces_modefier;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class AfricanElephant extends Elephant {
	
	public static void main(String[] args) {
		
		AfricanElephant elephant1 = new AfricanElephant();
		// these are the methods we can access from the parent class
		elephant1.move();
		elephant1.hoard();
		
		// these are the instance variables we can access from the parent class in the same package
		elephant1.trunckLength=2;
		elephant1.age=3;
		
		
	}

}
