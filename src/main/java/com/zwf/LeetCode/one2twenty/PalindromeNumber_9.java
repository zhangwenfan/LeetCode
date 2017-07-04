package com.zwf.LeetCode.one2twenty;

//回文数字, 不能转化成String来做
//反转这个Integer, 看与原来的相不相等. 这里没判断overflow, 因为overflow必然不相等
public class PalindromeNumber_9 {

	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int rev = 0, y = x;
		while (0 != x) {
			rev = 10 * rev + x % 10;
			x /= 10;
		}
		return (rev == y);
	}

}
