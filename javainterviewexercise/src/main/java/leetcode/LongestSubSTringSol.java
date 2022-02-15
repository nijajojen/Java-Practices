package leetcode;

public class LongestSubSTringSol {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkeb"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int[] chars = new int[128];

		int left = 0;
		int right = 0;

		int res = 0;
		while (right < s.length()) {
			char r = s.charAt(right);
			int charAscii = r;
			chars[charAscii]++;

			while (chars[r] > 1) {
				char l = s.charAt(left);
				int lAscii = l;
				chars[lAscii]--;
				left++;
			}

			res = Math.max(res, right - left + 1);

			right++;
		}
		return res;
	}

}
