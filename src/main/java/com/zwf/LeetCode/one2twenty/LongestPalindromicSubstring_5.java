package com.zwf.LeetCode.one2twenty;

//找最长的回文
//遍历这个String, 然后从中间向两边展开, 看是不是回文, 注意考虑偶数和单数的情况
public class LongestPalindromicSubstring_5 {

	private int max = 0, lo = 0;

	public String longestPalindrome(String s) {
		if (2 > s.length())
			return s;
		for (int i = 0; i < s.length(); i++) {
			// 单数回文
			isPalindrome(s, i, i);
			// 双数回文
			isPalindrome(s, i, i + 1);
		}
		return s.substring(lo, lo + max);
	}

	private void isPalindrome(String s, int left, int right) {
		int res = 0;
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
			res = right - left - 1;
		}
		if (res > max) {
			max = res;
			lo = left + 1;
		}
	}

}
