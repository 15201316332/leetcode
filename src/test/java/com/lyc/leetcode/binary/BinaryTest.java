package com.lyc.leetcode.binary;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liaoyichen
 * @date 2019/3/26
 * @description
 */
public class BinaryTest {

	@Test
	public void testBinarySearch() {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key = 6;
		Assert.assertEquals(5, Binary.binarySearch(array, key));
	}

	@Test
	public void testSqrt() {
		Assert.assertEquals(2, Binary.sqrt(4));
		Assert.assertEquals(2, Binary.sqrt(5));
		Assert.assertEquals(2, Binary.sqrt(6));
		Assert.assertEquals(2, Binary.sqrt(7));
		Assert.assertEquals(2, Binary.sqrt(8));
		Assert.assertEquals(3, Binary.sqrt(9));
	}

	@Test
	public void testArrangeCoins1() {
		Assert.assertEquals(3, Binary.arrangeCoins1(5));
	}

	@Test
	public void testArrangeCoins2() {
		Assert.assertEquals(65535, Binary.arrangeCoins2(Integer.MAX_VALUE));
	}

	@Test
	public void testSingleNonDuplicate() {
		int[] array1 = {1, 2, 2, 3, 3};
		int[] array2 = {1, 1, 2, 2, 3};
		int[] array3 = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
		int[] array4 = {1};
		Assert.assertEquals(1, Binary.singleNonDuplicate(array1));
		Assert.assertEquals(3, Binary.singleNonDuplicate(array2));
		Assert.assertEquals(4, Binary.singleNonDuplicate(array3));
		Assert.assertEquals(1, Binary.singleNonDuplicate(array4));
	}
}
