package samir_hajjat;

public class DatePrint {

	public static void main(String[] args) {
		
		Date date1 = new Date();
		date1.setDay((byte)14);
		date1.setMonth(07);
		date1.setYear(2021);
		
		
		Date date2 = new Date(03,(byte)05,1992);
	    System.out.println(date2);
		System.out.println(date1);
		
		
		Date date3 = new Date(10, (byte)19, 1990);
		System.out.println(date3.toString());
		
		
	   
	}

}
