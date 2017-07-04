package com.zwf.LeetCode.one2twenty;

//给一个数组, 每个值表示木板的高度, 问取哪两块木板得到的谁最多. 注意这里忽略两块木板中间的木板
public class ContainerWithMostWater_11 {
	// 左右两根指针, value小的那个往中间移, 每次与最大值比较
	public int maxArea(int[] h) {
		int res = 0, left = 0, right = h.length - 1, max = Integer.MIN_VALUE;
		while (left < right) {
			res = Math.min(h[left], h[right]) * (right - left);
			max = Math.max(max, res);
			if (h[right] > h[left])
				left++;
			else
				right--;
		}
		return max;
	}

}
