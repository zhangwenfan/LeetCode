package com.zwf.LeetCode.twenty2fourty;

//找第一个子字符串
//注意n比h长和n为""
public class ImplementstrStr_28 {

	public int strStr(String h, String n) {
		if (null == n || "".equals(n))
			return 0;
		for (int i = 0; i < h.length(); i++) {
			if (h.charAt(i) == n.charAt(0) && check(i, h, n))
				return i;
		}
		return -1;
	}

	private boolean check(int index, String h, String n) {
		for (int i = 0; i < n.length(); i++) {
			if (index + i >= h.length() || h.charAt(index + i) != n.charAt(i))
				return false;
		}
		return true;
	}

}
