package New_Start;

import java.util.Comparator;
import java.util.List;

public class LongestString_From_Array {

	public static void main(String[] args) {

		List<String> list = List.of("Tushar", "Vikas", "Atul", "Ranjendra");

		String str = list.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println("The Longest String :: " + str);

	}

}
