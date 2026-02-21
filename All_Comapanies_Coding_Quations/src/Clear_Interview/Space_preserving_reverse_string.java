package Clear_Interview;

import java.util.Arrays;

public class Space_preserving_reverse_string {

	public static void main(String[] args) {
		String name = "I am a java developer";
		String[] str = name.split(" ");
		String reverseString = "";

		for (int i = str.length - 1; i >= 0; i--) {

			reverseString += reverseStrig(str[i]);
		}

		System.out.println(reverseString.trim());
		
		reverseStringUsingJava8(name);

	}

	private static void reverseStringUsingJava8(String name) {
		String[] str = name.split(" ");
		/
		
		
		
	}

	private static String reverseStrig(String name) {

		return new StringBuilder(name).reverse().append(" ").toString();

	}

}
