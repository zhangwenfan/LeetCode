package com.zwf.LeetCode.fourty2sixty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 先按start的时间进行排序, 然后遍历, 后一个的start时间再上一个之间的话就叠加,
 * 下一个的start大于上一个的end的话就从新设置cur
 */

public class MergeIntervals_56 {

	public class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> res = new ArrayList<>();
		if (null == intervals || 0 == intervals.size())
			return res;
		Collections.sort(intervals, (a, b) -> {
			return Integer.compare(a.start, b.start);
		});
		Interval cur = intervals.get(0);
		for (Interval i : intervals) {
			if (i.start > cur.end) {
				res.add(cur);
				cur = i;
			} else if (i.end >= cur.end)
				cur.end = i.end;
		}
		res.add(cur);
		return res;
	}

}
