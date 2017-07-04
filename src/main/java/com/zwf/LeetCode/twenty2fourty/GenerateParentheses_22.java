package com.zwf.LeetCode.twenty2fourty;

import java.util.ArrayList;
import java.util.List;

/*
 * 要用递归做, 核心思想在于, 一个'('必然出现在一个')'之前, 并且')'的数量不会超过'('的数量
 */
public class GenerateParentheses_22 {

	public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<>();
		backtrack("", 0, 0, n, res);
		return res;
	}

	private void backtrack(String s, int open, int close, int max, List<String> res) {
		if (s.length() == max * 2) {
			res.add(s);
			return;
		}
		if (open < max)
			backtrack(s + "(", open + 1, close, max, res);
		if (close < open)
			backtrack(s + ")", open, close + 1, max, res);
	}

}
