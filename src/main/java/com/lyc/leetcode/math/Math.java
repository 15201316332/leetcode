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
	 * @description 计算一个数前面的素数个数 任何数都可以表示为素数的乘积 要得到自然数n以内的全部素数，必须把不大于  的所有素数的倍数剔除，剩下的就是素数
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

	/**
	 * @author liaoyichen
	 * @date 2019/4/17
	 * @description 最大公约约数
	 */
	int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/17
	 * @description 最小公倍数
	 */
	int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/17
	 * @description 转化为7进制的字符串
	 */
	public static String get7str(int n) {
		if (n < 0) {
			return "_" + get7str(-n);
		}
		if (n < 7) {
			return n + "";
		} else {
			return get7str(n / 7) + (n % 7);
		}
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/17
	 * @description 转化为16进制:负数补码处理
	 */
	public static String toHex(int n) {
		if (0 == n) {
			return "0";
		}
		String s = "";
		char[] cs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
			'f'};
		while (n != 0) {
			s = cs[n & 0b1111] + s;
			n >>>= 4;
		}
		return s;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/17
	 * @description 阶乘
	 */
	public static  int trailingZeroes(int n) {
     int count=0;
     return count;
	}
}
