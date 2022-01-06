package arrays_practicing;

public class Code_Lap2 {

	public static void main(String[] args) {
		
		
		int[] parkingTeckits = {12, 34, 56, 100, 230, 12, 10, 22, 11, 9, 60};
		
		int k;
		int mostTickets=0;
		
		for (k=0; k < parkingTeckits.length; k++) {
			if (parkingTeckits[k]>mostTickets) 
				mostTickets=parkingTeckits[k];
		}
		System.out.println(mostTickets);
		
		int[]nums = {1,2,3,4};
		System.out.println(makeMiddle(nums).toString());
		
		
	}
	
	public static int[] makeMiddle(int[] nums) {
		int index1 = nums.length/2-1;
		int index2 = nums.length/2;
		int[] result = {index1, index2};
		return result;
	}
}
