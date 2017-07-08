package com.zwf.LeetCode.fourty2sixty;

/*
 * 先左上右下斜对角对换, 再上下对换.
 * 右上, 左右也可以
 */

public class RotateImage_48 {

	public void rotate(int[][] m) {
		int n = m.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				int temp = m[i][j];
				m[i][j] = m[n - j - 1][n - i - 1];
				m[n - j - 1][n - i - 1] = temp;
			}
		}
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n; j++) {
				int temp = m[i][j];
				m[i][j] = m[n - i - 1][j];
				m[n - i - 1][j] = temp;
			}
		}
	}

}
