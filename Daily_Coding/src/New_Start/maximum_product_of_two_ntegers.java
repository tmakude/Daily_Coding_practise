package New_Start;

public class maximum_product_of_two_ntegers {

	public static void main(String[] args) {
		int arr[] = { 1, 20, -5, 4, -10 };

		int maxProduct = maxProduct(arr);
		System.out.println("The maxProduct : " + maxProduct);

	}

	private static int maxProduct(int[] arr) {

		if (arr == null || arr.length < 2) {
			return 0;
		}
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

		for (int num : arr) {
			if (num > max1) {
				max2 = max1;
				max1 = num;
			} else if (num > max2 && num != max1) {
				max2 = num;

			}

			if (num < min1) {
				min2 = min1;
				min1 = num;
			} else if (num < min2 && num != min1) {
				min2 = num;

			}
		}

		return Math.max(max2 * max1, min2 * min1);
	}

}
