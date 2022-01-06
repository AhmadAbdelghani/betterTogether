package Memory_Managment;

import java.util.Scanner;

public class Heap_And_stack {
   
	public static void main (String[] args) {
//		Scanner stdin = new Scanner(System.in);
//		System.out.println("Enter a world ");
//		String text=stdin.next();
//         for (int i =0; i<1000000; i++) {
//        	 
//        	 System.out.println(text);
//         }
//         
         String str = "";
         
         String upper;
         
         if (str.length()>3) {
        	 upper = str.substring(0,str.length()-3)+str.substring(str.length()-3).toUpperCase();
        	 System.out.println(upper);
         }else {
        	 upper = str.toUpperCase();
        	 System.out.println(upper);
         }
         
	}
}
