package com.lyc.leetcode.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liaoyichen
 * @date 2019/4/2
 * @description
 */
public class Review0402 {

	public static int binarySearch(int[] array, int key) {
		int l = 0, r = array.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (array[mid] == key) {
				return mid;
			} else if (array[mid] > key) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

	public static int sqrt(int n) {
		if (n < 1) {
			return n;
		}
		int l = 0, r = n;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (mid * mid == n) {
				return mid;
			} else if (mid * mid > n) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return r;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/2
	 * @description 最后一行不算
	 */
	public static int arrangeCoins1(int n) {
		if (n < 1) {
			return 0;
		}
		int i = 1;
		while (n > 0) {
			n -= i;
			i++;
		}
		return n == 0 ? i - 1 : i - 2;
	}

	public static long arrangeCoins2(int n) {
		if (n < 1) {
			return 0;
		}
		long l = 0, r = n;
		while (l <= r) {
			long mid = l + (r - l) / 2;
			long sum = mid * (mid + 1) / 2;
			if (sum == n) {
				return mid;
			} else if (sum < n) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return r;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/2
	 * @description 找出唯一不是一对的数据
	 */
	public static int singleNonDuplicate(int[] array) {
		int i = 0, j = array.length - 1;
		while (i < j) {
			int mid = i + (j - i) / 2;
			if (mid % 2 == 1) {
				mid++;
			}
			if (array[mid] == array[mid - 1]) {
				j = mid - 2;
			} else {
				i = mid;
			}
		}
		return array[j];
	}

	public static int findContentChildren(int[] g, int[] c) {
		Arrays.sort(g);
		Arrays.sort(c);
		int i = 0, j = 0;
		while (i < g.length && j < c.length) {
			if (c[j] >= g[i]) {
				j++;
				i++;
			} else {
				j++;
			}
		}
		return i;
	}

	public static int findMinArrowShots(int[][] points) {
		if (points.length == 0) {
			return 0;
		}
		Arrays.sort(points, (a, b) -> (a[1] - b[1]));
		int result = 1;
		int p = points[0][1];
		for (int i = 1; i < points.length; i++) {
			if (p >= points[i][0]) {
				continue;
			}
			result++;
			p = points[i][1];
		}
		return result;

	}

	public static int maxProfit(int[] prices) {
		int sum = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				sum += prices[i] - prices[i - 1];
			}
		}
		return sum;
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 1) {
				continue;
			}
			int pre = i == 0 ? 0 : flowerbed[i - 1];
			int next = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
			if (pre == 0 && next == 0) {
				count++;
				flowerbed[i] = 1;
			}
		}
		return count >= n;
	}

	public static boolean checkPossibility(int[] nums) {
		int count = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[i - 1]) {
				count++;
				if (i >= 2 && nums[i] < nums[i - 2]) {
					nums[i] = nums[i - 1];
				} else {
					nums[i - 1] = nums[i];
				}
			}
		}
		return count <= 1;
	}

	public static boolean isSubsequence(String s, String t) {
		for (int i = 0, p = 0; i < s.length(); i++, p++) {
			p = t.indexOf(s.charAt(i), p);
			if (p == -1) {
				return false;
			}
		}
		return true;
	}

	public static List<Integer> partitionLabels(String s) {
		List<Integer> r = new ArrayList<>();
		int[] lastIdx = new int[26];
		for (int i = 0; i < s.length(); i++) {
			lastIdx[s.charAt(i) - 'a'] = i;
		}
		int start = 0;
		while (start < s.length()) {
			int end = start;
			for (int i = start; i < s.length() && i <= end; i++) {
				int last = lastIdx[s.charAt(i) - 'a'];
				if (last > end) {
					end = last;
				}
			}
			r.add(end - start + 1);
			start = end + 1;
		}
		return r;
	}

	public static int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, (a, b) -> {
			if (a[0] == b[0]) {
				return a[1] - b[1];
			} else {
				return b[0] - a[0];
			}
		});
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < people.length; i++) {
			list.add(people[i][1], new int[]{people[i][0], people[i][1]});
		}
		int[][] r = new int[people.length][2];
		list.toArray(r);
		return r;
	}
}
