package DSA;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters_SlidingWindow {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));

	}

	private static int lengthOfLongestSubstring(String string) {
		Set<Character> set = new HashSet<Character>();
		int left = 0;
		int maxCount = 0;

		for (int right = 0; right < string.length(); right++) {

			 while (set.contains(string.charAt(right))) {
	                set.remove(string.charAt(left));
	                left++;
	            }

			set.add(string.charAt(right));
			System.out.println(set);
			maxCount = Math.max(maxCount, right - left + 1);

		}

		return maxCount;
	}

}
