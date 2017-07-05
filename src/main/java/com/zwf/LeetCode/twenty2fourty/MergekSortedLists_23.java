package com.zwf.LeetCode.twenty2fourty;

import com.zwf.LeetCode.ListNode;

//和整合两个ListNode类似, 两两取出整合, 时间复杂度为N2
public class MergekSortedLists_23 {

	public ListNode mergeKLists(ListNode[] lists) {
		if (null == lists || 0 == lists.length)
			return null;
		ListNode res = new ListNode(0);
		res.next = lists[0];
		ListNode dummy = res;
		for (int i = 1; i < lists.length; i++) {
			// res = dummy;
			travel(res, lists[i]);
		}
		return dummy.next;
	}

	private void travel(ListNode head, ListNode list) {
		if (null == list)
			return;
		if (null == head.next) {
			head.next = list;
			return;
		}
		if (list.val < head.next.val) {
			ListNode temp = head.next;
			head.next = list;
			travel(head.next, temp);
		} else {
			travel(head.next, list);
		}
	}

}
