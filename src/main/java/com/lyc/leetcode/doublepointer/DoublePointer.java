package com.lyc.leetcode.doublepointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author liaoyichen
 * @date 2019/3/29
 * @description
 */
public class DoublePointer {

	/**
	 * @author liaoyichen
	 * @date 2019/3/29
	 * @description 找出排序数组里和为指定值的两个数； 直观想法 遍历；
	 */
	public static int[] getSumIndex1(int[] input, int sum) {
		int[] result = new int[2];
		if (input.length >= 2) {
			for (int i = 0; i < input.length - 1; i++) {
				for (int j = i + 1; j < input.length; j++) {
					if (input[i] + input[j] == sum) {
						return new int[]{i + 1, j + 1};
					}
				}
			}
		}
		return result;
	}

	/**
	 * @author liaoyichen
	 * @date 2019/3/29
	 * @description 标准方法:冲充分利用排序的特性，首位相加，相等则返回，大小往则头前进，大则尾后退； 收尾指针
	 */
	public static int[] getSumIndex2(int[] input, int sum) {
		int h = 0, t = input.length - 1;
		while (h < t) {
			if (input[h] + input[t] == sum) {
				return new int[]{h + 1, t + 1};
			}
			if (input[h] + input[t] < sum) {
				h++;
			} else {
				t--;
			}
		}
		return null;
	}


	/**
	 * @author liaoyichen
	 * @date 2019/3/29
	 * @description 反转字符串里的元音字母
	 */
	public static String reverseVowels(String input) {
		Set<Character> v = new HashSet<>(
			Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
		char[] r = new char[input.length()];
		int i = 0, j = input.length() - 1;
		while (i <= j) {
			char ci = input.charAt(i);
			char cj = input.charAt(j);
			if (v.contains(ci) && v.contains(cj)) {
				r[i] = cj;
				r[j] = ci;
				i++;
				j--;
			} else {
				if (!v.contains(ci)) {
					r[i] = ci;
					i++;
				}
				if (!v.contains(cj)) {
					r[j] = cj;
					j--;
				}
			}
		}
		return new String(r);
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/1
	 * @description 判断c是否是某两数a, b的平方和 最直观是（0，c）但是如果是c，c*c可能会溢出，而且会有多余运算 考虑（0，Math.sqrt(c))
	 */
	public static boolean judgeSquareSum(int c) {
		if (c < 0) {
			return false;
		}
		int h = 0, t = (int) Math.sqrt(c);
		while (h <= t) {
			int sum = h * h + t * t;
			if (sum == c) {
				return true;
			} else if (sum > c) {
				t--;
			} else {
				h++;
			}
		}
		return false;
	}


	/**
	 * @author liaoyichen
	 * @date 2019/4/1
	 * @description 判断是否是回文字符串：最多只删除一个字符（一次机会）,递归
	 */
	public static boolean isValidPalindrome(String s) {
		int l = 0, r = s.length() - 1;
		while (l < r) {
			if (s.charAt(l) != s.charAt(r)) {
				return isValidPalindrome(s, l, r - 1) || isValidPalindrome(s, l + 1, r);
			}
			l++;
			r--;
		}
		return true;

	}

	private static boolean isValidPalindrome(String s, int l, int r) {
		while (l < r) {
			if (s.charAt(l) != s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}
