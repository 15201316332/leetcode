package com.lyc.leetcode.string;

/**
 * 英文字母不分大小写有26个 ASCII码总共有256个，128个标准，128个扩展 *
 */


/**
 * @author liaoyichen
 * @date 2019/5/6
 * @description
 */
public class StringQuestion {

	/**
	 * @author liaoyichen
	 * @date 2019/5/6
	 * @description 判断两个字符串是否包含相同数量的字符：限定:字符串只包含小写字母； 原理：字符串包含的字符类型(小写字符)有限是26个，一个字符串的字符++，一个--，只有包含一样的才能使26个都为0；
	 */
	public static Boolean isAnagram(String s, String t) {
		int[] array = new int[26];
		for (int i = 0; i < s.length(); i++) {
			array[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			array[t.charAt(i) - 'a']--;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				return false;
			}
		}
		return true;
	}


	/**
	 * @author liaoyichen
	 * @date 2019/5/6
	 * @description 判断同构字符串，限定:字符串长度是相同的 原理：同构的本质是出现重复的位置相同，但是要注意的是数组初始化值为0，要避免与0相比，所以要都+1
	 */
	public static boolean isIsomorphic(String s, String t) {
		int[] m1 = new int[256];
		int[] m2 = new int[256];
		for (int i = 0; i < s.length(); i++) {
			if (m1[s.charAt(i)] != m2[t.charAt(i)]) {
				return false;
			}
			m1[s.charAt(i)] = i + 1;
			m2[t.charAt(i)] = i + 1;
		}
		return true;
	}


	/**
	 * @author liaoyichen
	 * @date 2019/5/6
	 * @description 一个字符串中字符可以组成回文的最大长度 原理：偶数个重复字符可以组成回文，有一个单的可以放到最中间
	 */
	public static int longestPalindrome(String s) {
		int r = 0;
		int[] cs = new int[256];
		for (char c : s.toCharArray()) {
			cs[c]++;
		}
		for (int c : cs) {
			r += (c / 2) * 2;
		}
		if (r < s.length()) {
			r++;
		}
		return r;
	}


	/**
	 * @author liaoyichen
	 * @date 2019/5/6
	 * @description 判断一个整数（b包含负数）是否为回文字符串，要求不能使用额外空间，也就不能将整数转换为字符串进行判断
	 * 原理：去掉负数，0，结尾为0的正数，分为左右两部分，右侧转置，左右比较，等于右（完全回文）或者右/10 （最中间元素不同）
	 */
	public static boolean isPalindrome(int x) {
		if (x == 0) {
			return true;
		}
		if (x < 0) {
			return false;
		}
		if (x % 10 == 0) {
			return false;
		}
		int right = 0;
		while (x > right) {
			right = right * 10 + x % 10;
			x /= 10;
		}
		return x == right || x == right / 10;
	}


	/**
	 * @author liaoyichen
	 * @date 2019/5/7
	 * @description 计算一个字符串的所有回文子串的数量 从每个字符开始计算，奇数型（以自己为中心）,偶数型自己和后一个
	 */
	Integer count = 0;

	public int countSubstrings(String s) {
		for (int i = 0; i < s.length(); i++) {
			// 奇数长度
			extendSubstrings(s, i, i);
			// 偶数长度
			extendSubstrings(s, i, i + 1);
		}
		return count;
	}

	private void extendSubstrings(String s, int start, int end) {
		while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
			count++;
		}

	}


	/**
	 * @author liaoyichen
	 * @date 2019/5/7
	 * @description 找出字符串中连续0和1数量相同的子串个数，限定：字符串只包含0,1 原理：计数分为当前和前面的两个，遍历字符串每个字符，如果与前一个相同则当前+1,如果不同则前记为当前，当前+1,如果前面的大于等于当前则结果计数+1
	 */
	public static int countBinarySubstrings(String s) {
		int pre = 0, curr = 1, ret = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				curr++;
			} else {
				pre = curr;
				curr = 1;
			}
			if (pre >= curr) {
				ret++;
			}
		}
		return ret;
	}


	/**
	 * @author liaoyichen
	 * @date 2019/5/7
	 * @description 判断s2能否用s1循环移位得到:s1s1即可得到所有的组合形式，判断是否包含即可
	 */
	public static boolean isShiftBe(String s1, String s2) {
		String s3 = s1 + s1;
		return s3.contains(s2);
	}

	/**
	 * @author liaoyichen
	 * @date 2019/5/7
	 * @description 字符串向右循环移动k位
	 */
	public static String rightShiftK(String s, int k) {
		int k1 = k % s.length();
		String left = s.substring(0, s.length() - k);
		String right = s.substring(s.length() - k, s.length());
		return reverse(reverse(left) + reverse(right));
	}

	public static String rightShiftK2(String s, int k) {
		int k1 = k % s.length();
		char[] cs = s.toCharArray();
		char[] cs2 = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			cs2[i] = cs[(i + k1) % s.length()];
		}
		return new String(cs2);
	}

	private static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(s.length() - 1 - i));
		}
		return sb.toString();
	}

	/**
	 * @author liaoyichen
	 * @date 2019/5/9
	 * @description 单词逆序
	 */
	public static String reverseWord(String s) {
		String[] ss = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ss.length; i++) {
			sb.append(ss[ss.length - 1 - i]);
			if (i != ss.length - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}


}


