package com.zwf.LeetCode.fourty2sixty;

//一个是直接乘以n次, 另一种是递归
public class Pow_50 {

	public double myPow(double x, int n) {
		int res = 1;
		if (n == Integer.MIN_VALUE)
			return 0.0000;
		if (n < 0) {
			n = -n;
			x = 1 / x;
		}
		for (int i = 0; i < n; i++) {
			res *= x;
		}
		return res;
	}

	double myPow2(double x, int n) {
		if (n == 0)
			return 1;
		if (n < 0) {
			n = -n;
			x = 1 / x;
		}
		return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
	}

}
