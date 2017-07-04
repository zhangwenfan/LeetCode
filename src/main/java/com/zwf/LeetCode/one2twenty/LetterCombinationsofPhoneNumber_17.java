package com.zwf.LeetCode.one2twenty;

import java.util.ArrayList;
import java.util.List;

//把手机上面的数字映射成一个arr.
//这里递归所要考虑到的小点就是: 如果给了三个数字, 那个所有的String都是3位长度的
public class LetterCombinationsofPhoneNumber_17 {

	private String[] keys = new String[]//
	{ "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations(String d) {
		List<String> res = new ArrayList<>();
		if (null == d || 0 == d.length())
			return res;
		append("", 0, d, res);
		return res;
	}

	private void append(String pre, int index, String d, List<String> res) {
		if (index >= d.length()) {
			res.add(pre);
			return;
		} else {
			String s = keys[d.charAt(index) - '0'];
			for (int i = 0; i < s.length(); i++) {
				append(pre + s.charAt(i), index + 1, d, res);
			}
		}
	}

}
