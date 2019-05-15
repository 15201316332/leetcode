package com.lyc.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liaoyichen
 * @date 2019/5/9
 * @description
 */
public class ArrayQuestionTest {

	ArrayQuestion arrayQuestion=new ArrayQuestion();

	@Test
	public void testMoveZeroes() {
		int[] i1 = {1, 0, 3, 0, 6, 7};
		int[] i2 = {1, 3, 6, 7, 0, 0};
		Assert.assertArrayEquals(i2, arrayQuestion.moveZeroes(i1));
	}

	@Test
	public void testfindErrorNums() {
		int[] i1 = {3,2,2};
		int[] i2 = {2,1};

		Assert.assertArrayEquals(i2, arrayQuestion.findErrorNums(i1));
	}

}
