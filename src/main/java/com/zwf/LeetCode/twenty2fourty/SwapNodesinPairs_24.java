package com.zwf.LeetCode.twenty2fourty;

import com.zwf.LeetCode.ListNode;

//交换相邻的两个Node
//temp出fir node和sed node,然后跳过sed node, 跟着while里面走一遍就懂了 
public class SwapNodesinPairs_24 {

	public ListNode swapPairs(ListNode head) {
		if (null == head)
			return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode cur = dummy;
		while (null != cur.next && null != cur.next.next) {
			ListNode fir = cur.next;
			ListNode sed = cur.next.next;
			fir.next = fir.next.next;
			sed.next = fir;
			cur.next = sed;
			cur = cur.next.next;
		}
		return dummy.next;
	}

}
