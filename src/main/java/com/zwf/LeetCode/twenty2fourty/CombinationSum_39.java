package com.zwf.LeetCode.twenty2fourty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//几个Combination都差不多, 区别点都在于for loop里面的i=index上面
public class CombinationSum_39 {

	List<List<Integer>> res = new ArrayList<List<Integer>>();

	public List<List<Integer>> combinationSum(int[] nums, int target) {
		Arrays.sort(nums);
		travel(0, 0, new LinkedList<Integer>(), target, nums);
		return res;
	}

	private void travel(int cur, int index, List<Integer> list, int target, int[] nums) {
		if (cur == target) {
			res.add(new ArrayList<Integer>(list));
			return;
		} else if (cur > target)
			return;
		else {
			for (int i = index; i < nums.length; i++) {
				list.add(nums[i]);
				travel(cur + nums[i], i, list, target, nums);
				list.remove(list.size() - 1);
			}
		}
	}

}
