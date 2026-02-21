package Clear_Interview;

import java.util.List;
import java.util.stream.Stream;

public class Merge_Two_Array_Find_Sum_Of_Odd_Number {

	public static void main(String[] args) {
//		merge two integer list
//		get the sum of odd number

		List<Integer> list1 = List.of(1, 2, 3, 4);
		List<Integer> list2 = List.of(5, 3, 4, 6, 7, 8);

		int num = Stream.concat(list1.stream(), list2.stream()).filter(e -> e % 2 != 0).mapToInt(Integer::intValue)
				.sum();
		System.out.println("The Sum is :: " + num);

	}

}
