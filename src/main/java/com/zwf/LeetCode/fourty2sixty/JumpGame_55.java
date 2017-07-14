package com.zwf.LeetCode.fourty2sixty;
//从左往右扫, 找到每个点所能达到的最远距离
public class JumpGame_55 {

	public boolean canJump(int[] nums) {
		if (nums.length <= 1)
			return true;
		int lastPosi = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > lastPosi)
				break;
			lastPosi = Math.max(lastPosi, nums[i] + i);
		}
		return lastPosi >= nums.length - 1 ? true : false;
	}

}
