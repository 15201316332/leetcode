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

	String s = "aeiouAEIOU";

	private boolean isv(char c) {
		return s.indexOf(c) == -1;
	}

	public static String reverseVowels(String input) {
		Set<Character> v = new HashSet<>(
			Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
		char[] r = new char[input.length()];
		int i = 0, j = input.length() - 1;
		while (i <= j) {
			char ci = input.charAt(i);
			char cj = input.charAt(i);
			if (v.contains(ci) && v.contains(cj)) {
				r[i] = cj;
				r[j] = ci;
				i++;
				j--;
			} else {
				if (!v.contains(ci)) {
					r[i] = ci;
					i++;
				} else if (!v.contains(cj)) {
					r[j] = cj;
					j--;
				}
			}
		}
		return new String(r);
	}

}
