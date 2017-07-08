package com.zwf.LeetCode.fourty2sixty;

//难点在于O(n)的时间复杂度和constant空间复杂度
//把这个arr按第0位为1, 第1位为2([1,2,3,6,7,99])这样的顺序排好, 
//小于0的和大于nums.length的不用管, 因为我们之关心第一位正整数
public class FirstMissingPositive_41 {

	public int firstMissingPositive(int[] nums) {
		int n = nums.length, i = 0;
		while (i < n) {
			if (nums[i] > 0 && nums[i] - 1 < n && nums[nums[i] - 1] != nums[i])
				swap(nums, nums[i] - 1, i);
			else
				i++;
		}
		for (int j = 0; j < n; j++) {
			if (nums[j] != j + 1) {
				return j + 1;
			}
		}
		return n + 1;
	}

	private void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}
