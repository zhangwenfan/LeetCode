package com.zwf.LeetCode.one2twenty;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_3 {

	/*用双指针, 和一个map来记录arr的val和Index, 
	每当遇到重复的时候, 取重复的那个数的原来的Index的后一位和现在的left中大的那个
	作为left, 然后再比较.*/
	public int lengthOfLongestSubstring(String s) {
    if (null == s || 0 == s.length()) return 0;
    Map<Character, Integer> map = new HashMap<>();
    Integer max = Integer.MIN_VALUE, left = 0;
    for (int i=0; i<s.length(); i++) {
        if (map.containsKey(s.charAt(i))) {
            left = Math.max(left, map.get(s.charAt(i)) + 1);
        }
        max = Math.max(max, i - left + 1);
        map.put(s.charAt(i), i);
    }
    return max;
}

}
