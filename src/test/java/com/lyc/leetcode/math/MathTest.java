package com.lyc.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liaoyichen
 * @date 2019/4/15
 * @description
 */
public class MathTest {

	@Test
	public void testGetPrimesCount(){
		Assert.assertEquals(0,Math.getPrimesCount(2));
		Assert.assertEquals(1,Math.getPrimesCount(3));
		Assert.assertEquals(2,Math.getPrimesCount(4));
		Assert.assertEquals(2,Math.getPrimesCount(4));
	}

	@Test
	public void  testTrailingZeroes(){

		Assert.assertEquals(1,Math.trailingZeroes(5));
		Assert.assertEquals(2,Math.trailingZeroes(10));
	}
}
