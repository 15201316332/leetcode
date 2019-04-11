package com.lyc.leetcode.sort;

/**
 * @author liaoyichen
 * @date 2019/4/10
 * @description:排序： 比较类排序：通过比较来决定元素间的相对次序，由于其时间复杂度不能突破O(nlogn)，因此也称为非线性时间比较类排序。
 * 非比较类排序：不通过比较来决定元素间的相对次序，它可以突破基于比较排序的时间下界，以线性时间运行，因此也称为线性时间非比较类排序。
 */
public class Sort {

	/**
	 * @author liaoyichen
	 * @date 2019/4/10
	 * @description 冒泡排序 o(n*n) o(1) 稳定
	 */
	public static void BubbleSortRight(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void BubbleSortLeft(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/10
	 * @description 选择排序 冒泡排序 o(n*n) o(1) 不稳定
	 */
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < a.length; i++) {
				if (a[j] < a[minIdx]) {
					minIdx = j;
				}
			}
			int tmp = a[i];
			a[i] = a[minIdx];
			a[minIdx] = tmp;
		}
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/11
	 * @description 插入排序 冒泡排序 o(n*n) o(1) 稳定
	 */
	public static void insertSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j = i;
			int tmp = a[j];
			while (j > 0 && a[j - 1] > tmp) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = tmp;
		}
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/11
	 * @description 希尔排序 冒泡排序 o(n*n) o(1) 不稳定
	 */
	public static void shellSort(int[] a) {
		for (int gap = a.length / 2; gap >= 1; gap = gap / 2) {
			for (int i = gap; i < a.length; i += gap) {
				int j = i;
				int tmp = a[j];
				while (j > 0 && a[j - gap] > tmp) {
					a[j] = a[j - gap];
					j -= gap;
				}
				a[j] = tmp;
			}
		}
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/11
	 * @description 归并排序
	 */
	public static void mergeSort(int[] a){
		mergeSort(a,0,a.length-1);
	}

	private static void mergeSort(int[] a,int low,int high){
		int mid = (low+high)/2;
		if(low<high){
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}

	private static void merge(int[] a,int low,int mid,int high){
		int[] temp = new int[high-low+1];
		int i= low;
		int j = mid+1;
		int k=0;
		while(i<=mid && j<=high){
			if(a[i]<a[j]){
				temp[k++] = a[i++];
			}else{
				temp[k++] = a[j++];
			}
		}
		while(i<=mid){
			temp[k++] = a[i++];
		}
		while(j<=high){
			temp[k++] = a[j++];
		}
		for(int x=0;x<temp.length;x++){
			a[x+low] = temp[x];
		}
	}
}
