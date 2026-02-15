package New_Start;

public class Max_Element_From_Array {

	public static void main(String[] args) {
		int[] arr = { 13, 30, 2, 15, 33 };

		int maxElemnt = findMax_Element(arr);
		System.out.println(maxElemnt);

	}

	private static int findMax_Element(int[] arr) {
		if (arr == null || arr.length < 2) {
			return 0;
		}
		int maxElement = Integer.MIN_VALUE;

		for (int num : arr) {

			if (num > maxElement) {

				maxElement = num;
			}

		}

		return maxElement;
	}

}
