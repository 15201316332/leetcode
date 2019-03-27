package com.lyc.leetcode.greedy;

import java.util.Arrays;

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


}
