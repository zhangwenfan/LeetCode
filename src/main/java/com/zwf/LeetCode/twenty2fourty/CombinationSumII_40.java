package com.zwf.LeetCode.twenty2fourty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumII_40 {

	List<List<Integer>> res = new ArrayList<List<Integer>>();

	public List<List<Integer>> combinationSum2(int[] nums, int target) {
		Arrays.sort(nums);
		List<Integer> list = new LinkedList<Integer>();
		travel(0, -1, list, target, nums);
		return res;

	}

	private void travel(int cur, int index, List<Integer> list, int target, int[] nums) {
		if (cur == target) {
			res.add(new ArrayList<Integer>(list));
			return;
		} else if (cur > target)
			return;
		else {
			for (int i = index + 1; i < nums.length; i++) {
				if (i > index + 1 && nums[i] == nums[i - 1])
					continue;
				list.add(nums[i]);
				travel(cur + nums[i], i, list, target, nums);
				list.remove(list.size() - 1);
			}
		}
	}

}
