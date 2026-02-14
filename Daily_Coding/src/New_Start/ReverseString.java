package New_Start;

public class ReverseString {

	public static void main(String[] args) {

		
        String str = "Tushar";
		String[] arr = str.split(" ");
		for (String s : arr) {
			String newString = reverseString(s);
		System.out.print(newString + " ".trim());
		
		
	}

	}

	private static String reverseString(String str) {

		String string = " ";
		for (int i = str.length() - 1; i >= 0; i--) {

			string += str.charAt(i);

	}
		return string;
	}

}
