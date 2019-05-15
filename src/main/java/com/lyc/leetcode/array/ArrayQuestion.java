package com.lyc.leetcode.array;

/**
 * @author liaoyichen
 * @date 2019/5/9
 * @description
 */
public class ArrayQuestion {

	/**
	 * @author liaoyichen
	 * @date 2019/5/9
	 * @description 把为0的元素移动到最后： 思路：把非零的放在最前面，后面的都补0就行
	 */
	public int[] moveZeroes(int[] nums) {
		int notZ = 0;
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			if (nums[i] != 0) {
				nums[notZ++] = nums[i];
			}
		}
		while (notZ < length) {
			nums[notZ++] = 0;
		}
		return nums;
	}


	/**
	 * @author liaoyichen
	 * @date 2019/5/9
	 * @description 一个数组包含0到n全部数字，有一个被另一个替换了，找出缺少的和重复的 例如:1,2,3,3,5  -----4,3
	 * 先把大部分数据按位置放好，有一个错的必定是重复的
	 */
	public int[] findErrorNums(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
				int j = nums[i] - 1;
				int tmp = nums[j];
				nums[i] = nums[j];
				nums[j] = tmp;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1) {
				return new int[]{nums[i], i + 1};
			}
		}
		return null;
	}



}
