package NesoAcademy;

import java.awt.Point;

public class Main  {

	public static void main(String[] args) {
		System.out.println(Circle.getNumberOfCircles());
		Circle c1 = new Circle(new Point(1,2),3);
		System.out.println(Circle.getNumberOfCircles());
		
		System.out.println(c1.getArea());
		c1.setCenter(new Point(3,5));
		c1.setRadius(5);
		System.out.println(c1.getArea());
		
		
		Circle c2 = new Circle();
		c2.center=new Point(1,2);
		
		c1.numberOfCircles=19;
		
		
		
		
		c2.radius=3;
		
		System.out.println(Circle.getNumberOfCircles());
		Circle c3 = new Circle();
		c3.setCenter(new Point (3, 5));
		c3.setRadius(4);
		
		System.out.println(Circle.getNumberOfCircles());
		
		Circle.numberOfCircles=2;
		  System.out.println(Circle.getNumberOfCircles());
		  
		  
        
	}

}
