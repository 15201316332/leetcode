package com.lyc.leetcode.math;

/**
 * @author liaoyichen
 * @date 2019/4/12
 * @description
 */
public class Math {

	/**
	 * @author liaoyichen
	 * @date 2019/4/12
	 * @description 计算一个数前面的素数个数
	 */
	public static int getPrimesCount(int n) {
		boolean[] notPrimes = new boolean[n + 1];
		int cnt = 0;
		for (int i = 2; i < n; i++) {
			if (notPrimes[i]) {
				continue;
			}
			cnt++;
			for (long j = (long) i * i; j < n; j += i) {
				notPrimes[(int) j] = true;
			}
		}
		return cnt;
	}

	private Math() {}
}
