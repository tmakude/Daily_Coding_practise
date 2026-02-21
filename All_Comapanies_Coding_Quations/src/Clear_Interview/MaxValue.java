package Clear_Interview;

import java.util.Arrays;

public class MaxValue {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 20, 8, 15 };
		int maxNumber = Arrays.stream(arr).max().getAsInt();
		System.out.println(maxNumber);

	}

}
