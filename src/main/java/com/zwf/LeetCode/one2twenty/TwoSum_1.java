package com.zwf.LeetCode.one2twenty;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

	/*用HashMap, key为val, 值为Index, 
	每遍历一个新的int的时候看target-这个int在不在map里面.*/
		public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      for (int i=0; i<nums.length; i++) {
          if (map.getOrDefault(target - nums[i], null) != null) 
              return new int[]{i, map.get(target - nums[i])};
          else
              map.put(nums[i], i);
      }
      return null;
  }
}
