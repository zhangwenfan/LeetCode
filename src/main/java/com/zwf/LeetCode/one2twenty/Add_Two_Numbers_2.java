package com.zwf.LeetCode.one2twenty;

public class Add_Two_Numbers_2 {

	/*You are given two non-empty linked lists representing two non-negative integers. 
	 * The digits are stored in reverse order and each of their nodes 
	 * contain a single digit. Add the two numbers and return it as a linked list.

			You may assume the two numbers do not contain any leading zero, 
			except the number 0 itself.

			Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
			Output: 7 -> 0 -> 8*/
	/*每次在res后面添加一个ListNode, 如果前面有进位就添加1, 不然就添加0.
	在中间要判断一下是不是两个list都为null, 因为这样的话就不用添加最后一个ListNode了*/
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = new ListNode(0);
		ListNode dummy = res;
		while (null != l1 || null != l2) {
			if (null != l1) {
				res.val += l1.val;
				l1 = l1.next;
			}
			if (null != l2) {
				res.val += l2.val;
				l2 = l2.next;
			}
			if (res.val >= 10) {
				res.val = res.val % 10;
				res.next = new ListNode(1);
			} else if (null == l1 && null == l2) {
				break;
			} else {
				res.next = new ListNode(0);
			}
			res = res.next;
		}
		res = null;
		return dummy;
	}
}
