package com.zwf.LeetCode.twenty2fourty;

//在左边界搜一次, 右边界在搜一次
public class SearchforaRange_34 {

	public int[] searchRange(int[] nums, int target) {
		int[] res = new int[] { -1, -1 };
		travel(nums, target, res, 0);
		travel(nums, target, res, 1);
		return res;
	}

	private void travel(int[] nums, int target, int[] res, int indi) {
		int lo = 0, hi = nums.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (nums[mid] == target) {
				if (indi == 0) {
					if (mid == 0 || nums[mid - 1] < target) {
						res[0] = mid;
						return;
					} else
						hi = mid - 1;
				} else {
					if (mid == nums.length - 1 || nums[mid + 1] > target) {
						res[1] = mid;
						return;
					} else
						lo = mid + 1;
				}
			} else if (nums[mid] < target)
				lo = mid + 1;
			else
				hi = mid - 1;
		}
	}

}
