package com.zwf.LeetCode.one2twenty;

//删去倒数第n个node, 不能用新的ListNode
/*
 * 用快慢指针, 快指针先把n个位置走完, 然后和慢指针一起走
 */
public class RemoveNthNodeFromEndList_19 {
	public class ListNode {
		int val;
		ListNode next;
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = head, fast = head, slow = head;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		if (null == fast)
			return dummy.next;
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return dummy;
	}

}
