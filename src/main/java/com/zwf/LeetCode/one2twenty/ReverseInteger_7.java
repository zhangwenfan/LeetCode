package com.zwf.LeetCode.one2twenty;

//反转Integer, 不能转化成String来做
//res每次乘10, x除10, 边界case用res != res * 10 / 10来判断
public class ReverseInteger_7 {

	public int reverse(int x) {
		int res = 0, y = x;
		while (x != 0) {
			if (res != res * 10 / 10)
				return 0;
			res = res * 10 + x % 10;
			x /= 10;
		}
		return res;
	}

}
