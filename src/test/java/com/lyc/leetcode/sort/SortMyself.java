package com.lyc.leetcode.sort;

/**
 * @author liaoyichen
 * @date 2019/4/11
 * @description
 */
public class SortMyself {

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tmp;
				}
			}
		}
	}

	public static void selectSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int tmp = a[min];
			a[min] = a[i];
			a[i] = tmp;
		}
	}

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

	public static void mergeSort(int[] a){
		mergeSort(a,0,a.length-1);
	}

	private static void mergeSort(int[] a,int low,int high){
		if(low<high){
			int mid=(high+low)/2;
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	private static void merge(int[] a,int low,int mid,int high){
		int[] tmp=new int[high-low+1];
		int i=low,j=mid+1;
		int k=0;
		while(i<=mid&&j<=high){
			if(a[i]>a[j]){
				tmp[k++]=a[j++];
			}else{
				tmp[k++]=a[i++];
			}
			while(i<=mid){
				tmp[k++]=a[i++];
			}
			while(j<=high){
				tmp[k++]=a[j++];
			}
		}
		for(int x=0;x<tmp.length;x++){
			a[low+x]=tmp[x];
		}
	}

}
