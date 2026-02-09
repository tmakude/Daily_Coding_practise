package New_Start;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge_Two_list_and_remove_Duplicates {

	public static void main(String[] args) {
		// Merge_Two_list_and_remove_Duplicates
		List<Integer> lis1 = List.of(1, 2, 3, 4, 5);
		List<Integer> lis2 = List.of(3, 4, 5, 6, 7);

		List<Integer> distinctNumber = Stream.concat(lis1.stream(), lis2.stream()).distinct()
				.collect(Collectors.toList());
		System.out.println(distinctNumber);

	}

}
