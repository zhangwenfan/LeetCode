package com.zwf.LeetCode.fourty2sixty;

/*
 * 以[2,3,1,1,4]为例, 第一个2之后最远能跳到index[1], 这时候我们就检查
 * 2到1之间有没有能够跳的更远的. 如果存在, 那么那个点就是新的end point.
 * 每次都只在遍历到这个end point的时候再计算新的最远的end point. 
*/
public class JumpGameII_42 {

	public int jump(int[] nums) {
		int res = 0, max = 0, end = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			max = Math.max(max, i + nums[i]);
			if (i == end) {
				res++;
				end = max;
			}
		}
		return res;
	}

}
