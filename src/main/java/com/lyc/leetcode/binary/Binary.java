package com.lyc.leetcode.binary;

/**
 * @author liaoyichen
 * @date 2019/3/26
 * @description
 */
public class Binary {

	/**
	 * @author liaoyichen
	 * @date 2019/3/26
	 * @description 二分查找，排序数组中找到指定值的位置，找不到返回-1 要点：中间位置 l+(r-l)/2 找不到-1
	 */
	public static int binarySearch(int[] array, int key) {
		int l = 0, r = array.length - 1, i = 0;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (array[mid] == key) {
				return mid;
			}
			if (array[mid] > key) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/3/26
	 * @description 求正整数开方，取整 要点：二分思想取值（1，x）（去掉0,1）,取整的话是取小的值，l总是-1，故选l为结果
	 */
	public static int sqrt(int x) {
		if (x <= 1) {
			return x;
		}
		int l = 1, r = x, i = 0;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			int sqrt = x / mid;
			if (sqrt == mid) {
				return mid;
			}
			if (sqrt > mid) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return r;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/3/26
	 * @description 第 i 行摆 i 个，统计能够摆的行数。 直观表达,算法复杂度n,支持最大值Integer.MAX_VALUE 注意自增的一次
	 */
	public static int arrangeCoins1(int n) {
		long t1 = System.currentTimeMillis();
		int level = 1, i = 1;
		while (n > 0) {
			n -= level;
			level++;
			i++;
		}
		long t2 = System.currentTimeMillis();
		System.out.println("执行" + i + "次" + (t2 - t1));
		return n == 0 ? level - 1 : level - 2;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/3/26
	 * @description 二分思想 上下限，有舍弃值取上限，注意有乘法运算注意最大值超出Integer.MAX_VALUE
	 */
	public static long arrangeCoins2(int n) {
		long t1 = System.currentTimeMillis();
		long l = 0, r = n, i = 1;
		while (l <= r) {
			i++;
			long mid = l + (r - l) / 2;
			long sum = mid * (mid + 1) / 2;
			if (sum == n) {
				return mid;
			}
			if (sum > n) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		long t2 = System.currentTimeMillis();
		System.out.println("执行" + i + "次" + (t2 - t1));
		return r;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/3/26
	 * @description 一个有序数组只有一个数不出现两次，找出这个数 注意隐含条件：除了要找的数，其他数均出现两次，故这个数的下标必然是一个偶数
	 * 二分查找：从中间数开始，排除奇数位，如果此数与后面值相等则前段必是没有要找值，若不等则一定出现在前段，当上下限相等时取得此值；
	 */
	public static int singleNonDuplicate(int[] array) {
		int l = 0, r = array.length - 1;
		while (l < r) {
			int mid = l + (r - l) / 2;
			if (mid % 2 == 1) {
				mid--;
			}
			if (array[mid] == array[mid + 1]) {
				l = mid + 2;
			} else {
				r = mid;
			}
		}
		return array[l];
	}

}
