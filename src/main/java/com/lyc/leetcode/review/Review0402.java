package com.lyc.leetcode.review;

/**
 * @author liaoyichen
 * @date 2019/4/2
 * @description
 */
public class Review0402 {

	public static int binarySearch(int[] array, int key) {
		int l = 0, r = array.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (array[mid] == key) {
				return mid;
			} else if (array[mid] > key) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

	public static int sqrt(int n) {
		if (n < 1) {
			return n;
		}
		int l = 0, r = n;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (mid * mid == n) {
				return mid;
			} else if (mid * mid > n) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return r;
	}


	/**
	 * @author liaoyichen
	 * @date 2019/4/2
	 * @description 最后一行不算
	 */
	public static int arrangeCoins1(int n) {
		if (n < 1) {
			return 0;
		}
		int i = 1;
		while (n > 0) {
			n -= i;
			i++;
		}
		return n == 0 ? i - 1 : i - 2;
	}

	public static long arrangeCoins2(int n) {
		if (n < 1) {
			return 0;
		}
		long l = 0, r = n;
		while (l <= r) {
			long mid = l + (r - l) / 2;
			long sum = mid * (mid + 1) / 2;
			if (sum == n) {
				return mid;
			} else if (sum < n) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return r;
	}


	/**
	 * @author liaoyichen
	 * @date 2019/4/2
	 * @description 找出唯一不是一对的数据
	 */
	public static int singleNonDuplicate(int[] array){
		int i=0,j=array.length-1;
		while(i<j){
			int mid=i+(j-i)/2;
			if(mid%2==1){
				mid++;
			}
			if(array[mid]==array[mid-1]){
				j=mid-2;
			}else{
				i=mid;
			}
		}
		return array[j];
	}

}
