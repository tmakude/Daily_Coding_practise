package New_Start;

public class Find_Largest_And_Second_Largest_Element {

	public static void main(String[] args) {
		// Find_Largest_And_Second_Largest_Element
		int[] arr = {13,30,2,15,33};
		
		int LargestValue = Integer.MIN_VALUE;
		int secondLargestValue = Integer.MAX_VALUE;
		
		for(int i =0 ; i < arr.length ; i++) {
			
			if(arr[i] > LargestValue) {
				
				secondLargestValue = LargestValue;
				LargestValue = arr[i];
				
			}
		}
		
		System.out.println("The Largest value is : " + LargestValue  );
		System.out.println("The secondLargestValue value is : " + secondLargestValue  );
		
		

	}

}
