package strings_methods;

public class String_Methods_Codingbat {


//Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, 
//and otherwise return the string unchanged. This is a little harder than it looks.
//
//withoutX2("xHi") → "Hi"
//withoutX2("Hxi") → "Hi"
//withoutX2("Hi") → "Hi"
	
	public String withoutX(String str) {
		String str1="";
		
		for (int i=0; i<2; i++) {
			if (i==0 && str.charAt(i)!='x');
			str1+=str.charAt(i);
			 if (i==1 && str.charAt(i)!='x');
			str1+=str.charAt(i);
		}
		return str1;
	}
	
	
	
	
	
		
}
	
	
	
	
	

