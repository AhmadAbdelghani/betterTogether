package arrays_practicing;

public class Coding_Bat {

	public static void main(String[] args) {
		
	Methods_Strings obj1 = new Methods_Strings();
	
	 String a = obj1.frontTimes("a", 5);
	
	System.out.println(a);
	System.out.println(obj1.countXX("iw scjkdmxxnkxnnzzzznxxxx"));
	
	System.out.println(obj1.stringMatches("ahmadhjs", "ahmadboreeni"));
	System.out.println(obj1.altPairs("Kitten"));
	
	// code lap 20713
	int[] currentMembers = {1, 3, 4, 5, 6, 7};
	boolean isAMember = false;
	int memberID = 8;
	
	for (int i =0; i < currentMembers.length; i++) {
		if (currentMembers[i]==memberID) 
			isAMember=true;
	}
	  // System.out.println(isAMember);
	    
	   
	   
	   int[] zipCodes = { 1234, 12345, 12349, 13245, 1234};
	   int k = 0;
	   int j = 0;
	   boolean duplicate = false;
	   
	   for (k=0; k<zipCodes.length ; k++) {
		   for (j = 0; j < k; j++) {
			   if (zipCodes[j]==zipCodes[k])
				   duplicate=true;
		   }
		   
	   }
	   
	   System.out.println(duplicate);
	   
	  
	   
	}

}
