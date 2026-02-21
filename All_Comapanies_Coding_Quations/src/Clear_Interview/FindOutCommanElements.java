package Clear_Interview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class FindOutCommanElements {

	public static void main(String[] args) {
//		Write a program to find common elements 
//		from two integer arrays in java

		List<Integer> list1 = List.of(1, 2, 3, 4);
		List<Integer> list2 = List.of(5, 3, 4, 6, 7, 8);
		Set<Integer> set = new HashSet<Integer>();

		Stream.concat(list1.stream(), list2.stream()).filter(e -> !set.add(e)).forEach(System.out::println);

	}

}
