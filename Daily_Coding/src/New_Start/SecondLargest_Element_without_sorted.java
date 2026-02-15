package New_Start;

public class SecondLargest_Element_without_sorted {

	public static void main(String[] args) {
		int[] arr = { 13, 30, 2, 15, 33 };

		int secondLargestNumber = secondLargest(arr);
		System.out.println("Second Largest Element : " + secondLargestNumber);

	}

	private static int secondLargest(int[] arr) {

		if (arr == null || arr.length > 2) {
			return 0;
		}

		int largestNumber = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {

			if (num > largestNumber) {

				secondLargest = largestNumber;
				largestNumber = num;
			} else if (num > secondLargest && num != largestNumber) {

				secondLargest = num;

			}
		}

		return secondLargest;
	}

}
