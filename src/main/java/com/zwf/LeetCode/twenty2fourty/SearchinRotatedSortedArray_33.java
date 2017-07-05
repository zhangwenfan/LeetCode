package com.zwf.LeetCode.twenty2fourty;

//用二分法来做
//其中要特别注意nums[lo]<=nums[mid], nums[lo] <= target, 和target <= nums[hi]
//这些边界情况
public class SearchinRotatedSortedArray_33 {

	public int search(int[] nums, int target) {
		if (0 == nums.length)
			return -1;
		int lo = 0, hi = nums.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (nums[mid] == target)
				return mid;
			else {
				if (nums[lo] <= nums[mid]) {
					if (nums[lo] <= target && target < nums[mid])
						hi = mid - 1;
					else
						lo = mid + 1;
				} else {
					if (nums[mid] < target && target <= nums[hi])
						lo = mid + 1;
					else
						hi = mid - 1;
				}
			}
		}
		return -1;
	}

}
