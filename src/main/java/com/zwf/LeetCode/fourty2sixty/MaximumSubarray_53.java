package com.zwf.LeetCode.fourty2sixty;

//如果目前的和小于0, 那么就从新的index开始算
public class MaximumSubarray_53 {

	public int maxSubArray(int[] nums) {
		int cur = nums[0], max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (cur <= 0) {
				cur = nums[i];
				max = Math.max(cur, max);
			} else {
				cur += nums[i];
				max = Math.max(cur, max);
			}
		}
		return max;
	}

}
