package com.lyc.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liaoyichen
 * @date 2019/5/6
 * @description
 */
public class StringQuestionTest {

	@Test
	public void testIsAnagram() {
		String s = "anagram", t = "nagaram";
		String s1 = "rat", t1 = "car";
		String s2 = "raa", t2 = "ra";
		Assert.assertEquals(true, StringQuestion.isAnagram(s, t));
		Assert.assertEquals(false, StringQuestion.isAnagram(s1, t1));
		Assert.assertEquals(false, StringQuestion.isAnagram(s2, t2));
	}

	@Test
	public void testIsIsomorphic() {
		String s = "AAB", t = "bbc";
		String s1 = "rat", t1 = "car";
		String s2 = "-d-", t2 = "d--";
		Assert.assertEquals(true, StringQuestion.isIsomorphic(s, t));
		Assert.assertEquals(true, StringQuestion.isIsomorphic(s1, t1));
		Assert.assertEquals(false, StringQuestion.isIsomorphic(s2, t2));
	}

	@Test
	public void testLongestPalindrome() {
		String s = "AAB";
		int l = 3;
		String s1 = "abccccdd";
		int l1 = 7;

		Assert.assertEquals(l, StringQuestion.longestPalindrome(s));
		Assert.assertEquals(l1, StringQuestion.longestPalindrome(s1));
	}

	@Test
	public void testIsPalindrome() {
		int i = 121;
		int i1 = 123;
		int i2 = 11;
		Assert.assertEquals(true, StringQuestion.isPalindrome(i));
		Assert.assertEquals(false, StringQuestion.isPalindrome(i1));
		Assert.assertEquals(true, StringQuestion.isPalindrome(i2));
	}

}
