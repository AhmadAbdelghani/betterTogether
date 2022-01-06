package arrays_practicing;

public class Methods_Strings {
	
	public int countXX(String str) {
		int count = 0;
		for (int i =0; i< str.length()-1; i++) {
			if (str.substring(i, i+2).equals("xx")) {
				count++;
			}
			
		}
		return count;
	}
	

	public String frontTimes(String str, int n) {
		int frontLen = 3;
		  if (frontLen > str.length()) {
		    frontLen = str.length();
		  }
		  String front = str.substring(0, frontLen);
		  
		  String result = "";
		  for (int i=0; i<n; i++) {
		    result = result + front;
		  }
		  return result;
	}
	
	
	public int stringMatches(String a, String b) {
		
		int len = Math.min(a.length(), b.length());
		int count = 0;
		for (int i =0; i < len-1 ; i++) {
			String aSub =a.substring(i, i+2);
			String bSub = b.substring(i, i+2);
			if (aSub.equals(bSub)) {
				count++;
			}
		}
		return count;
	}
	
	public String altPairs(String str) {
		  String str1 = "";
		  
//		  "itten" 
		  // ki
		 
		  boolean isTwice = false;
		  int i =0;
		  while(str.length()>0) {
			  str1+= str.charAt(0);
			  str = str.substring(i+1);
		  }
		return str1;
		  
		}
	
	
	
	
	
	
	
	
	
	
}
