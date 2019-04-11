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
		/*int[] a = {4, 3, 2, 1};
		Sort.BubbleSortRight(a);
		System.out.println(Arrays.toString(a));
		int[] b = {3, 2, 4, 1};
		Sort.BubbleSortLeft(b);
		System.out.println(Arrays.toString(b));

		int[] c = {3, 2, 4, 1};
		Sort.selectionSort(c);
		System.out.println(Arrays.toString(c));*/

		int[] d = {3, 2, 4, 1,5,6,8,9,9};
		Sort.mergeSort(d);
		System.out.println(Arrays.toString(d));

	}

}
