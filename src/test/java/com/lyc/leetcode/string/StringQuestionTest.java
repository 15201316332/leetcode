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

	@Test
	public void testExtendSubstrings() {
		String s = "abc";
		int cnt = 3;
		String s1 = "aaa";
		int cnt1 = 6;
		StringQuestion stringQuestion=new StringQuestion();
		Assert.assertEquals(cnt, stringQuestion.countSubstrings(s));
		Assert.assertEquals(cnt1, stringQuestion.countSubstrings(s1));
	}

	@Test
	public void testCountBinarySubstrings(){
		String s = "00110011";
		int cnt = 6;
		Assert.assertEquals(cnt, StringQuestion.countBinarySubstrings(s));
	}

	@Test
	public void testIsShiftBe(){
		String s1 = "ADCD";
		String s2 = "DADC";
		Assert.assertEquals(true, StringQuestion.isShiftBe(s1,s2));
	}

	@Test
	public void rightShiftK(){
		String s1 = "123abc";
		int k=3;
		String s2 = "abc123";
		Assert.assertEquals(s2, StringQuestion.rightShiftK(s1,k));
	}


}
