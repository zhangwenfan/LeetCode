package com.zwf.LeetCode.fourty2sixty;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 就是死脑筋把所有的加一遍, 遇到相同的不加, 因为这个题里面nums里的数不会重复
 * 所以用.contains()没问题. 
 * 在初始化res的时候可以优化, nums.length!就是res的大小
*/
public class Permutations_46 {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new LinkedList<>();
		travel(res, new ArrayList<Integer>(), nums);
		return res;
	}

	private void travel(List<List<Integer>> res, List<Integer> list, int[] nums) {
		if (nums.length == list.size())
			res.add(new ArrayList<Integer>(list));
		for (int i = 0; i < nums.length; i++) {
			if (list.contains(nums[i]))
				continue;
			else {
				list.add(nums[i]);
				travel(res, list, nums);
				list.remove(list.size() - 1);
			}
		}
	}

}
