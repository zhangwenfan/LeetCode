package com.zwf.LeetCode.one2twenty;

import java.util.Stack;

//判断括号是不是完整
/*
 * 如果是左半边的括号, 就放进stack里面, 右边的就看stack是不是空, 或者里面pop()出来的匹不匹配
 */
public class ValidParentheses_20 {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[')
				stack.push(c);
			else if (stack.size() == 0)
				return false;
			else if (c == ')') {
				if (stack.pop() != '(')
					return false;
			} else if (c == '}') {
				if (stack.pop() != '{')
					return false;
			} else if (c == ']') {
				if (stack.pop() != '[')
					return false;
			}
		}
		return stack.size() == 0;
	}

}
