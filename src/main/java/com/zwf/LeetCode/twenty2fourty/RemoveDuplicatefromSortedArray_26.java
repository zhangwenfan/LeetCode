package com.zwf.LeetCode.twenty2fourty;

//取一个index指着最大位
public class RemoveDuplicatefromSortedArray_26 {

	public int removeDuplicates(int[] nums) {
    if (0 == nums.length) return 0;
    int index = 1, cur = nums[0];
    for (int i=index; i<nums.length; i++) {
        if (nums[i] > cur) {
            nums[index++] = nums[i];
            cur = nums[i];
        }
    }
    return index;
}

}
