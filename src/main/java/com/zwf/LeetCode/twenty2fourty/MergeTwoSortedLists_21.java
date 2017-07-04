package com.zwf.LeetCode.twenty2fourty;

import com.zwf.LeetCode.ListNode;
/*
 * 合并两个ListNode, 不能创建新的ListNode.
 * 用递归, 每次比较head的下一个和l2的val
 */
public class MergeTwoSortedLists_21 {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (null == l1)
			return l2;
		if (null == l2)
			return l1;
		ListNode head = new ListNode(0);
		head.next = l1;
		ListNode dummy = head;
		travel(head, l2);
		return dummy.next;
	}

	private void travel(ListNode head, ListNode l2) {
		if (head == null || l2 == null)
			return;
		if (head.next != null && head.next.val <= l2.val)
			travel(head.next, l2);
		else {
			ListNode temp = head.next;
			head.next = l2;
			travel(head.next, temp);
		}
	}
}
