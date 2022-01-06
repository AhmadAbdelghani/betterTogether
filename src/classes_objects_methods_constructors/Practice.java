package classes_objects_methods_constructors;

public class Practice {

	
	public static void main(String[] args) {
		
		Practice practice = new Practice();
		
		System.out.println(practice.gap("ahmad"));
	}
	
	public String gap(String str) {
				
			if (str.length()<=2)
				return str.toUpperCase();
			else 
				for (int i = str.length()-3; i > str.length(); i++) {
					str = "" + str.charAt(i);
					
				}
			return str.toUpperCase();
			
			}
		}

