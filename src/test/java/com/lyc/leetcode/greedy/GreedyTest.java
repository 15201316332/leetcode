package com.lyc.leetcode.greedy;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author liaoyichen
 * @date 2019/3/27
 * @description
 */
public class GreedyTest {

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

		Assert.assertEquals(2, Greedy.findContentChildren(g1, c1));
		Assert.assertEquals(1, Greedy.findContentChildren(g2, c2));
		Assert.assertEquals(4, Greedy.findContentChildren(g3, c3));
		Assert.assertEquals(4, Greedy.findContentChildren(g4, c4));
	}

	@Test
	public void testFindMinArrowShots() {
		int[][] ps1 = {{1, 2}};
		int[][] ps2 = {{1, 2}, {1, 3}, {2, 3}};
		int[][] ps3 = {{1, 2}, {3, 4}, {7, 8}};

		Assert.assertEquals(1, Greedy.findMinArrowShots(ps1));
		Assert.assertEquals(1, Greedy.findMinArrowShots(ps2));
		Assert.assertEquals(3, Greedy.findMinArrowShots(ps3));
	}

	@Test
	public void testMaxProfit() {
		int[] p1 = {1, 2, 3};
		int[] p2 = {4, 2, 5, 7};
		int[] p3 = {3, 2, 1};
		int[] p4 = {4, 2, 5, 7, 5, 4, 9};

		Assert.assertEquals(2, Greedy.maxProfit(p1));
		Assert.assertEquals(5, Greedy.maxProfit(p2));
		Assert.assertEquals(0, Greedy.maxProfit(p3));
		Assert.assertEquals(10, Greedy.maxProfit(p4));
	}

	@Test
	public void testCanPlaceFlowers() {
		int[] p1 = {1};
		int[] p2 = {0, 0};
		int[] p3 = {0, 1, 0, 0};
		int[] p4 = {0, 0, 0, 0, 0};

		Assert.assertEquals(false, Greedy.canPlaceFlowers(p1, 1));
		Assert.assertEquals(true, Greedy.canPlaceFlowers(p2, 1));
		Assert.assertEquals(true, Greedy.canPlaceFlowers(p3, 1));
		Assert.assertEquals(true, Greedy.canPlaceFlowers(p4, 3));

	}

	@Test
	public void testCheckPossibility() {
		int[] nums1 = {1, 2, 3, 4};
		int[] nums2 = {4, 3, 2, 1};
		int[] nums3 = {1, 3, 2};
		int[] nums4 = {4, 5, 6, 4};

		Assert.assertEquals(true, Greedy.checkPossibility(nums1));
		Assert.assertEquals(false, Greedy.checkPossibility(nums2));
		Assert.assertEquals(true, Greedy.checkPossibility(nums3));
		Assert.assertEquals(true, Greedy.checkPossibility(nums4));
	}


	@Test
	public void testIsSubsequence() {
		String s1 = "abc";
		String t1 = "savbnc";

		String s2 = "cf";
		String t2 = "cfgh";

		String s3 = "cc";
		String t3 = "vdsccc";

		String s4 = "sfb";
		String t4 = "sfffxxz";

		Assert.assertEquals(true, Greedy.isSubsequence(s1, t1));
		Assert.assertEquals(true, Greedy.isSubsequence(s2, t2));
		Assert.assertEquals(true, Greedy.isSubsequence(s3, t3));
		Assert.assertEquals(false, Greedy.isSubsequence(s4, t4));
	}

	@Test
	public void testPartitionLabels() {
		System.out.println(Greedy.partitionLabels("ababcbacadefegdehijhklij"));
	}

	@Test
	public void testReconstructQueue() {
		int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
		int[][] sort = Greedy.reconstructQueue(people);
		for (int[] s : sort) {
			System.out.println(Arrays.toString(s));
		}
	}
}
