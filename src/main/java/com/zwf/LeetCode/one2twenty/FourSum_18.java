package com.zwf.LeetCode.one2twenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//基本和3Sum一样, 不管问题是多少sum, 时间复杂度都是n - 1.
public class FourSum_18 {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i - 1] == nums[i])
				continue;
			for (int j = i + 1; j < nums.length; j++) {
				if (j > i + 1 && nums[j - 1] == nums[j])
					continue;
				int le = j + 1, ri = nums.length - 1;
				while (le < ri) {
					int num = nums[i] + nums[j] + nums[le] + nums[ri];
					if (num == target) {
						res.add(Arrays.asList(nums[i], nums[j], nums[le], nums[ri]));
						while (le < ri && nums[le] == nums[le + 1])
							le++;
						while (le < ri && nums[ri] == nums[ri - 1])
							ri--;
						le++;
						ri--;
					} else if (num > target)
						ri--;
					else
						le++;
				}
			}
		}
		return res;
	}

}
