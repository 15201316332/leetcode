package com.lyc.leetcode.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liaoyichen
 * @date 2019/3/27
 * @description
 */
public class Greedy {

	/**
	 * @author liaoyichen
	 * @date 2019/3/27
	 * @description 贪心算法分饼干的描述：一组贪心度，一组饼干大小，大小满足才满足，计算能满足的人数
	 */
	public static int findContentChildren(int[] g, int[] c) {
		Arrays.sort(g);
		Arrays.sort(c);
		int j = 0;
		for (int i = 0; i < c.length && j < g.length; i++) {
			if (c[i] >= g[j]) {
				j++;
			}
		}
		return j;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/3/27
	 * @description 刺气球：按照右端位置排序起始位置必然是最前端的右端，最多使用气球数量的飞镖，当前飞镖位置可以从气球的右端开始，记一次，如果大于下一个气球的开端，则跳过下个，直到遍历完所有
	 */
	public static int findMinArrowShots(int[][] points) {
		if (points.length == 0) {
			return 0;
		}
		Arrays.sort(points, (a, b) -> (a[1] - b[1]));
		int result = 1;
		int c = points[0][1];
		for (int i = 1; i < points.length; i++) {
			if (c >= points[i][0]) {
				continue;
			}
			c = points[i][1];
			result++;
		}
		return result;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/3/27
	 * @description 股票的最大利润：上升到最高点卖出=上升一点就卖出的累计 输入股票价格数组 a <= b <= c <= d ，那么最大收益为 d - a。而 d - a =
	 * (d - c) + (c - b) + (b - a) 局部最优累加为整体最优 注意数组下标不要越界
	 */
	public static int maxProfit(int[] prices) {
		int p = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			int add = prices[i + 1] - prices[i];
			if (add > 0) {
				p += add;
			}
		}
		return p;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/3/27
	 * @description 不相邻种花:检查前后是否为0，加1之后，要置1
	 */
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0, length = flowerbed.length;
		for (int i = 0; i < length; i++) {
			if (flowerbed[i] == 1) {
				continue;
			}
			int pre = i == 0 ? 0 : flowerbed[i - 1];
			int next = i == length - 1 ? 0 : flowerbed[i + 1];
			if (pre == 0 && next == 0) {
				count++;
				flowerbed[i] = 1;
			}
		}
		return n <= count;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/3/28
	 * @description 最多修改一个元素是否能成为非递减数组, 不影响前面的排序也要避免后续变大,当前元素，和以前元素，不能使用未来元素
	 */
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

	/**
	 * @author liaoyichen
	 * @date 2019/3/28
	 * @description 判断是否子序列：(abc,aebc)=true (afc,aebc)=false t很长很短 String indexOf(c,i)
	 * 从i后寻找位置，无则返回-1
	 */
	public static boolean isSubsequence(String s, String t) {
		for (int i = 0, p = 0; i < s.length(); i++, p++) {
			p = t.indexOf(s.charAt(i), p);
			if (p == -1) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/3/28
	 * @description 按照每个字符只出现在一段的规则分割字符，并返回各段长度 查出每个字母的最大位置；循环每段找出最大位置 找出每个字符出现的最大序号
	 * 首先找到第一个字母的最大长度，再找到这段长度里字母的最大序号，取到值
	 */
	public static List<Integer> partitionLabels(String S) {
		List<Integer> result = new ArrayList<>();
		int[] lastIdxs = new int[26];
		for (int i = 0; i < S.length(); i++) {
			lastIdxs[S.charAt(i) - 'a'] = i;
		}
		int start = 0;
		while (start < S.length()) {
			int end = start;
			for (int i = start; i < S.length() && i <= end; i++) {
				int last = lastIdxs[S.charAt(i) - 'a'];
				if (last > end) {
					end = last;
				}
			}
			result.add(end - start + 1);
			start = end + 1;
		}
		return result;
	}


	/**
	 * @author liaoyichen
	 * @date 2019/3/28
	 * @description 根据身高和序号重建队列
	 */
	public static int[][] reconstructQueue(int[][] people) {
		if (null == people || people.length == 0 || people[0].length == 0) {
			return new int[0][0];
		}
		Arrays.sort(people, (a, b) -> {
			if (a[0] == b[0]) {
				return a[1] - b[1];
			} else {
				return b[0] - a[0];
			}
		});
		List<int[]> tmp = new ArrayList<>();
		int length = people.length;
		for (int i = 0; i < length; i++) {
			tmp.add(people[i][1], new int[]{people[i][0], people[i][1]});
		}
		int[][] result = new int[length][2];
		for (int i = 0; i < length; i++) {
			result[i][0] = tmp.get(i)[0];
			result[i][1] = tmp.get(i)[01];
		}
		return result;
	}

}
