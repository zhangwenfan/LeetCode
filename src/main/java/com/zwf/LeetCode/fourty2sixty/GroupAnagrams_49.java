package com.zwf.LeetCode.fourty2sixty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 把每个String内部排序作为key, 后面只要检查是否原来已经有这个Ana就好了
 */
public class GroupAnagrams_49 {

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String key = String.valueOf(ch);
			if (!map.containsKey(key))
				map.put(key, new ArrayList<String>());
			map.get(key).add(s);
		}
		return new ArrayList<>(map.values());
	}

}
