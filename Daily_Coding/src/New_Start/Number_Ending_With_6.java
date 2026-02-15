package New_Start;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Number_Ending_With_6 {

	public static void main(String[] args) {
		int[] arr = {11,22,33,44,63,66};
		Arrays.stream(arr).mapToObj(String :: valueOf).filter(s -> s.endsWith("6")).forEach(System.out::println);

	}

}
