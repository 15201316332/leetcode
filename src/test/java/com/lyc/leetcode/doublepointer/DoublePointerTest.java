package com.lyc.leetcode.doublepointer;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author liaoyichen
 * @date 2019/3/29
 * @description
 */
public class DoublePointerTest {

	@Test
	public void testGetSumIndex1() {
		int[] input1 = {1, 2, 3, 4, 5};
		int sum1 = 6;
		int[] out1 = {1, 5};

		int[] input2 = {2, 3, 4, 5, 7};
		int sum2 = 7;
		int[] out2 = {1, 4};

		Assert.assertEquals(true, Arrays.equals(out1, DoublePointer.getSumIndex1(input1, sum1)));
		Assert.assertEquals(true, Arrays.equals(out2, DoublePointer.getSumIndex1(input2, sum2)));

		Assert.assertEquals(true, Arrays.equals(out1, DoublePointer.getSumIndex2(input1, sum1)));
		Assert.assertEquals(true, Arrays.equals(out2, DoublePointer.getSumIndex2(input2, sum2)));
	}

	@Test
	public void testReverseVowels() {
		String in1 = "";
		String out1 = "";
		String in2 = "axcde";
		String out2 = "excda";
		String in3 = "dfggi";
		String out3 = "dfggi";
		Assert.assertEquals(out1, DoublePointer.reverseVowels(in1));
		Assert.assertEquals(out2, DoublePointer.reverseVowels(in2));
		Assert.assertEquals(out3, DoublePointer.reverseVowels(in3));
	}

	@Test
	public void testJudgeSquareSum() {
		int in1 = -1;
		int in2 = 0;
		int in3 = 1;
		int in4 = 7;
		int in5 = 9;
		int in6 = 10;
		Assert.assertEquals(false, DoublePointer.judgeSquareSum(in1));
		Assert.assertEquals(true, DoublePointer.judgeSquareSum(in2));
		Assert.assertEquals(true, DoublePointer.judgeSquareSum(in3));
		Assert.assertEquals(false, DoublePointer.judgeSquareSum(in4));
		Assert.assertEquals(true, DoublePointer.judgeSquareSum(in5));
		Assert.assertEquals(true, DoublePointer.judgeSquareSum(in6));
	}

	@Test
	public void testIsValidPalindrome() {
		String s1 = "a";
		String s2 = "abc";
		String s3 = "aba";
		String s4 = "aavcaa";
		Assert.assertEquals(true, DoublePointer.isValidPalindrome(s1));
		Assert.assertEquals(false, DoublePointer.isValidPalindrome(s2));
		Assert.assertEquals(true, DoublePointer.isValidPalindrome(s3));
		Assert.assertEquals(true, DoublePointer.isValidPalindrome(s4));
	}

	@Test
	public void testMerge() {
		int[] n1 = {1, 2, 3, 0, 0, 0};
		int m = 3;
		int[] n2 = {2, 5, 6};
		int n = 3;
		DoublePointer.merge(n1, m, n2, n);
		System.out.println(Arrays.toString(n1));
	}

	@Test
	public void testHasCycle() {
		Assert.assertEquals(false, DoublePointer.hasCycle(null));
	}

	@Test
	public void testFindLongestWord() {
		String s = "abpcplea";
		String[] d = {"ale", "apple", "monkey", "plea"};
		Assert.assertEquals("apple", DoublePointer.findLongestWord(s, Arrays.asList(d)));
	}
}
