package NesoAcademy;

import java.awt.Point;

public class Circle {
  
	
	Point center;
	double radius;
	static int numberOfCircles;
	
	Circle (){
		numberOfCircles++;
	}
    
	Circle (Point center, double radius){
		numberOfCircles++;
		this.center = center;
		this.radius = radius;
	}
	
	public double getPeramiter() {
		return 2* Math.PI*this.radius;
	}
	
	public double getArea() {
		return Math.PI* this.radius * this.radius;
		
	}
	
	public void setCenter(Point center ) {
		this.center = center;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public static int getNumberOfCircles() {
		if (numberOfCircles>= 0 && numberOfCircles <= 10) {
			return numberOfCircles;
		}else {
			numberOfCircles=0;
			return numberOfCircles;
					
		}
		
	
	}
	
	
	
	
	
}
