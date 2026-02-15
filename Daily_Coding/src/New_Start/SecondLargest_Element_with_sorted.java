package New_Start;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest_Element_with_sorted {

	public static void main(String[] args) {
		int[] arr = { 13, 30, 2, 15, 33 };

		int secondLargestNumber = secondLargest(arr);
		System.out.println("The Second Largest Element :" + secondLargestNumber);

	}

	private static int secondLargest(int[] arr) {
		if (arr == null || arr.length < 2) {
			return 0;
		}

		int secodLargest = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();

		return secodLargest;
	}

}
