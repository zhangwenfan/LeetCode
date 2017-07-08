package com.zwf.LeetCode.fourty2sixty;

//左右两根指针, 分别记录最大值
public class TrappingRainWater_42 {

	public int trap(int[] nums) {
		if (nums.length < 2)
			return 0;
		int res = 0, left = 0, right = nums.length - 1, //
				leftMax = nums[0], rightMax = nums[nums.length - 1];
		while (left < right) {
			leftMax = Math.max(leftMax, nums[left]);
			rightMax = Math.max(rightMax, nums[right]);
			if (leftMax <= rightMax) {
				res = res + leftMax - nums[left];
				left++;
			} else {
				res = res + rightMax - nums[right];
				right--;
			}
		}
		return res;
	}

}
