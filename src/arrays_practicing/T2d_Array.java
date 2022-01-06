package arrays_practicing;

public class T2d_Array {

	public static void main(String[] args) {
		
		// 2D array = an array of arrays 
		
		String [][] cars = new String [3][3];
		
		cars[0][0] = "Toyota";
		cars[0][1] = "Hundai";
		cars[0][2] = "Mazda";
		cars[1][0] = "Corola";
		cars[1][1] = "Civic";
		cars[1][2] = "Mazda 3";
		cars[2][0] = "BMW";
		cars[2][1] = "Mercedece";
		cars[2][2] = "Tesla";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.println(cars[i][j]);
			}
		}
	}
}
