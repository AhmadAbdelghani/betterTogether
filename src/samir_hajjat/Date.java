package samir_hajjat;

public class Date {

	private byte day;
	private int month;
	private int year;
	
	public Date() {
		System.out.println("constructor 1");
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public Date (int month, byte day, int year) {
		this();
		System.out.println("constructor 2");
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
    public byte getDay() {
    	return day;
    }
    
    public int getMonth() {
    	return month;
    }
    
    public int getYear() {
    	return year;
    }
    
    public void setDay(byte day) {
    	this.day= day;
    	
    }
    
    public void setMonth(int month) {
    	this.month=month;
    }
    
    public void setYear(int year) {
    	this.year=year;
    }
    
    public String toString () {
    	String date = month+"/"+day+"/"+year;
    	return date;
    }
	
	
	
	
}
