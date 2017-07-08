package com.zwf.LeetCode.twenty2fourty;

//比较基础的dp
public class CountandSay_38 {

	public String countAndSay(int n) {
		String res = "1";
		for (int i = 0; i < n - 1; i++) {
			String temp = "";
			char c = res.charAt(0);
			int count = 1;
			for (int j = 1; j < res.length(); j++) {
				if (c == res.charAt(j))
					count++;
				else {
					temp = temp + count + c;
					c = res.charAt(j);
					count = 1;
				}
			}
			res = temp + count + c;
		}
		return res;
	}

}
