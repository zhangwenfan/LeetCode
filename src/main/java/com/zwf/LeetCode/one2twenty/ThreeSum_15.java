package com.zwf.LeetCode.one2twenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//求一个arr里有没有3个数的和等于0
//sort(arr), 第一个index只能遍历， 后两个用lo, hi指针.
//要注意重复, 不仅仅是index的重复, lo, hi指针里面的重复也应该考虑
public class ThreeSum_15 {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int j = i + 1, k = nums.length - 1;
			while (j < k) {
				int n = nums[i] + nums[j] + nums[k];
				if (0 == n) {
					res.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k])));
					while (j < k && nums[j] == nums[j + 1])
						j++;
					while (j < k && nums[k] == nums[k - 1])
						k--;
					j++;
					k--;
				} else if (n > 0)
					k--;
				else
					j++;
			}
		}
		return res;
	}

}
