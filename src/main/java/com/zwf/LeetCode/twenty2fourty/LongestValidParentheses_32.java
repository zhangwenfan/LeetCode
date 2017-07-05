package com.zwf.LeetCode.twenty2fourty;

import java.util.Stack;

//用stack存入不能匹配上的括号的index, 然后再找最大值 O(n)
public class LongestValidParentheses_32 {

	public int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				stack.push(i);
			else {
				if (!stack.empty() && s.charAt(stack.peek()) == '(')
					stack.pop();
				else
					stack.push(i);
			}
		}
		int a = s.length(), res = 0;
		while (!stack.empty()) {
			int b = stack.pop();
			res = Math.max(res, a - b - 1);
			a = b;
		}
		return Math.max(res, a);
	}

}
