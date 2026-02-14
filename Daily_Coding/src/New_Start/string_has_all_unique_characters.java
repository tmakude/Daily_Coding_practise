package New_Start;

import java.util.HashSet;
import java.util.Set;

public class string_has_all_unique_characters {

	public static void main(String[] args) {
		String string = "Hello";

		String answer = checkUniqueCharacters(string);
		System.out.println(answer);

	}

	private static String checkUniqueCharacters(String string) {

		Set<Character> set = new HashSet<Character>();

		for (Character c : string.toCharArray()) {
			if (!set.add(c)) {
				return "The String is not Unique";

			}
		}
		return "The String is Unique";
	}

}
