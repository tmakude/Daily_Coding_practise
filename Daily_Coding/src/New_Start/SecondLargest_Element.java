package New_Start;

public class SecondLargest_Element {

	public static void main(String[] args) {

		// Second Largest Element

		int[] arr = { 10, 5, 20, 8, 15 };

		int secondLargest = secondLargestNumber(arr);
		System.out.println("Second Largest Number : " + secondLargest);

	}

	private static int secondLargestNumber(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		if (arr == null) {
			return 0;
		}

		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;

			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		return secondLargest;
	}

}
