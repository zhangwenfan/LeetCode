package com.zwf.LeetCode.twenty2fourty;

//与删除duplication一样, 拥抱一根指针指着最后一位
public class RemoveElement_27 {

	public int removeElement(int[] nums, int val) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val)
				nums[index++] = nums[i];
		}
		return index;
	}

}
