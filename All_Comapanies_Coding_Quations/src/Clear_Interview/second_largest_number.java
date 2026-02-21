package Clear_Interview;

public class second_largest_number {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 20, 8, 15 };
		int secondLargestNumber = findSecondLargest(arr);
		System.out.println("The second Largest Elemnt : " + secondLargestNumber);

	}

	private static int findSecondLargest(int[] arr) {
		int largeNumber = Integer.MIN_VALUE, secondLargestElemnt = Integer.MIN_VALUE;

		if (arr == null || arr.length < 2) {
			return 0;
		}
		for (int num : arr) {

			if (num > largeNumber) {
				secondLargestElemnt = largeNumber;

				largeNumber = num;
			} else if (num > secondLargestElemnt && num != largeNumber) {
				secondLargestElemnt = num;
			}

		}

		return secondLargestElemnt;
	}

}
