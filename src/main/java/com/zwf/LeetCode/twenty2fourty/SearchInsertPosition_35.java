package com.zwf.LeetCode.twenty2fourty;

//需要注意lo和hi只需要剔除一边的边界就可以了
public class SearchInsertPosition_35 {

	public int searchInsert(int[] nums, int target) {
		int lo = 0, hi = nums.length - 1;
		while (lo <= hi) {
			if (lo == hi) {
				if (nums[lo] < target)
					return lo + 1;
				else
					return lo;
			} else {
				int mid = (lo + hi) / 2;
				if (nums[mid] == target)
					return mid;
				else if (nums[mid] > target)
					hi = mid;
				else
					lo = mid + 1;
			}
		}
		return 0;
	}

}
