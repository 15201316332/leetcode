package com.lyc.leetcode.review;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liaoyichen
 * @date 2019/4/2
 * @description
 */
public class ReviewTest {

	@Test
	public void testBinarySearch() {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key = 7;
		Assert.assertEquals(6, Review0402.binarySearch(array, key));
	}

	@Test
	public void testSqrt() {
		Assert.assertEquals(2, Review0402.sqrt(4));
		Assert.assertEquals(2, Review0402.sqrt(5));
		Assert.assertEquals(2, Review0402.sqrt(6));
		Assert.assertEquals(2, Review0402.sqrt(7));
		Assert.assertEquals(2, Review0402.sqrt(8));
		Assert.assertEquals(3, Review0402.sqrt(9));
	}

	@Test
	public void testArrangeCoins1() {
		Assert.assertEquals(65535, Review0402.arrangeCoins1(Integer.MAX_VALUE));
		Assert.assertEquals(2, Review0402.arrangeCoins1(5));
	}

	@Test
	public void testArrangeCoins2() {
		Assert.assertEquals(2, Review0402.arrangeCoins2(5));
		Assert.assertEquals(65535, Review0402.arrangeCoins2(Integer.MAX_VALUE));
	}

	@Test
	public void testSingleNonDuplicate() {
		int[] array1 = {1, 2, 2, 3, 3};
		int[] array2 = {1, 1, 2, 2, 3};
		int[] array3 = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
		int[] array4 = {1};
		Assert.assertEquals(1, Review0402.singleNonDuplicate(array1));
		Assert.assertEquals(3, Review0402.singleNonDuplicate(array2));
		Assert.assertEquals(4, Review0402.singleNonDuplicate(array3));
		Assert.assertEquals(1, Review0402.singleNonDuplicate(array4));
	}

	@Test
	public void testFindContentChildren() {
		int[] g1 = {1, 2};
		int[] c1 = {1, 2, 3};

		int[] g2 = {4, 5, 6};
		int[] c2 = {1, 2, 3, 4};

		int[] g3 = {1, 2, 3, 4};
		int[] c3 = {4, 5, 6, 7};

		int[] g4 = {1, 4, 3, 2};
		int[] c4 = {4, 7, 6, 5};

		Assert.assertEquals(2, Review0402.findContentChildren(g1, c1));
		Assert.assertEquals(1, Review0402.findContentChildren(g2, c2));
		Assert.assertEquals(4, Review0402.findContentChildren(g3, c3));
		Assert.assertEquals(4, Review0402.findContentChildren(g4, c4));
	}

	@Test
	public void testFindMinArrowShots() {
		int[][] ps1 = {{1, 2}};
		int[][] ps2 = {{1, 2}, {1, 3}, {2, 3}};
		int[][] ps3 = {{1, 2}, {3, 4}, {7, 8}};

		Assert.assertEquals(1, Review0402.findMinArrowShots(ps1));
		Assert.assertEquals(1, Review0402.findMinArrowShots(ps2));
		Assert.assertEquals(3, Review0402.findMinArrowShots(ps3));
	}
}
