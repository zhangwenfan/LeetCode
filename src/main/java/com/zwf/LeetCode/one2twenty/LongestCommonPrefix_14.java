package com.zwf.LeetCode.one2twenty;

//求最长的prefix
//先遍历每一位， 再遍历每一个String， 先假设第一个String的长度就是最短的String,
//后面如果有更短的String,就直接返回res.
public class LongestCommonPrefix_14 {

	public String longestCommonPrefix(String[] strs) {
		if (null == strs || strs.length < 1)
			return "";
		int maxLen = strs[0].length();
		String res = "";
		for (int i = 0; i < maxLen; i++) {
			char c = strs[0].charAt(i);
			for (int j = 0; j < strs.length; j++) {
				if (i == strs[j].length() || strs[j].charAt(i) != c)
					return res;
			}
			res += c;
		}
		return res;
	}

}
