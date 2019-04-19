package com.lyc.leetcode.math;

import java.util.Arrays;

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
	 * @description 阶乘包含0的个数；思想2*5=10 包含5的少
	 */
	public static int trailingZeroes(int n) {
		return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/19
	 * @description 阶乘二进制标识中第一个1的位置（0的个数）
	 */
	public static int trailingOnes(int n) {
		return n == 0 ? 0 : n >> 1 + trailingZeroes(n >> 1);
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/19
	 * @description 字符串二进制相加
	 */
	public static String addBinary(String a, String b) {
		String r = "";
		int i = a.length() - 1, j = b.length() - 1, c = 0;
		while (i > -1 || j > -1) {
			if (i > -1 && a.charAt(i) == '1') {
				c++;
			}
			if (j > -1 && b.charAt(j) == '1') {
				c++;
			}
			r = (c & 0b0001) + r;
			c = c >>> 1;
			i--;
			j--;
		}
		if (c == 1) {
			r = "1" + r;
		}
		return r;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/19
	 * @description 最小的移动次数使数组成员全相等
	 */
	public static int minMoves2(int[] nums) {
		Arrays.sort(nums);
		int ret = 0;
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			ret += nums[r] - nums[l];
			l++;
			r--;
		}
		return ret;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/19
	 * @description 查找过半元素：排序后中值元素必定是
	 * 摩尔投票法
	 */
	public static int majorityElement(int[] nums) {
		/*
		Arrays.sort(nums);
		return nums[nums.length/2];
		*/
		int m=0,c=0;
		for (int i=0;i<nums.length;i++){
			if(c==0){
				m=nums[i];
				c++;
			}else if(m==nums[i]){
				c++;
			}else{
				c--;
			}
		}
		return m;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/19
	 * @description
	 */
	public static boolean isPerfectSquare(int num) {
		/*long n=num;
		long l=0,r=n;
		while(l<=r){
			long mid=l+(r-l)/2;
			if(mid*mid==num){
				return true;
			}else if(mid*mid>num){
				r=mid-1;
			}else{
				l=mid+1;
			}
		}
		return false;*/
		int s=1;
		while(num>0){
			num-=s;
			s+=2;
		}
		return num==0;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/19
	 * @description 3 的 n 次方
	 */
	public static boolean isPowerOfThree(int n) {
		return n>0&&(1162261467%n==0);
	}

}
