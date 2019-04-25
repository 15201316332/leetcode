package com.lyc.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liaoyichen
 * @date 2019/4/24
 * @description
 */
public class HashTableUse {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[]{map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
