package New_Start;

public class reverse_String_Sequence {

	public static void main(String[] args) {

		String str = "I love Java";
		String[] string = str.split(" ");

		String result = reverseString(string);
		System.out.println("The reverse String : " + result);

	}

	private static String reverseString(String[] string) {

//		StringBuilder sb = new StringBuilder();
//		
//		for(int i = string.length -1 ; i >=0 ; i--) {
//			
//			sb.append(string[i] + " ");
//		}
//		
//		return sb.toString().trim();

		// Second Approch
		int left = 0, right = string.length - 1;
		while (left < right) {
			String temp = string[left];
			string[left] = string[right];
			string[right] = temp;
			
			left++;
			right--;

		}
		return String.join(" ", string);

	}

}
