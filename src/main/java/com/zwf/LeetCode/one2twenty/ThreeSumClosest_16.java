package com.zwf.LeetCode.one2twenty;

import java.util.Arrays;

//求于target最接近的3个数的和.
//这个和3Sum差不多, 只不过把判断条件换成是否与target的差距更小, 并且不用考虑重复问题.
public class ThreeSumClosest_16 {

	public int threeSumClosest(int[] n, int target) {
		Arrays.sort(n);
		int res = n[0] + n[1] + n[2];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n.length; i++) {
			int le = i + 1, ri = n.length - 1;
			while (le < ri) {
				int num = n[i] + n[le] + n[ri];
				if (Math.abs(num - target) < min) {
					min = Math.abs(num - target);
					res = num;
				}
				if (num > target)
					ri--;
				else if (num < target)
					le++;
				else
					return res;
			}
		}
		return res;
	}

}
