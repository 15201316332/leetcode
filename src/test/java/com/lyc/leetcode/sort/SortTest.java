package com.lyc.leetcode.sort;

import java.util.Arrays;
import org.junit.Test;

/**
 * @author liaoyichen
 * @date 2019/4/10
 * @description
 */
public class SortTest {

	@Test
	public void testSort() {
		int[] d = {3, 2, 4, 1, 5, 6, 8, 9, 9};
		Sort.quickSort(d);
		System.out.println(Arrays.toString(d));
	}

}
