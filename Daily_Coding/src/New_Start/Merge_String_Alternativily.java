package New_Start;

public class Merge_String_Alternativily {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "pqr";

		int length1 = str1.length();
		int length2 = str2.length();

		// apbqcr

		StringBuilder sb = new StringBuilder();

		int i = 0;
		int j = 0;

		while (i < length1 || j < length2) {

			if (i < length1) {

				sb.append(str1.charAt(i++));

			}
			if (j < length2) {

				sb.append(str2.charAt(j++));

			}
		}

		System.out.println(sb);

	}

}
