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
}
