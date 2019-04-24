package com.lyc.leetcode.sort;

/**
 * @author liaoyichen
 * @date 2019/4/23
 * @description
 */
public class Review0423 {

	// 交换排序：n*n 稳定  把最大的往边上移动
	public static void bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j + 1] < a[j]) {
					int tmp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tmp;
				}
			}
		}
	}

	// 选择排序 n*n 不稳定  每次找出余下端最小的和当前位置元素交换
	public static void selectionSort(int[] a){
		int n = a.length;
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(a[j]<a[min]){
					min=j;
				}
			}
			if(min!=i){
				int tmp=a[i];
				a[i]=a[min];
				a[min]=tmp;
			}
		}
	}

	//插入算法 n*n
	public static void insertSort(int[] a) {
		int n=a.length;
		for(int i=1;i<n;i++){
			int j=i;
			int tmp=a[j];
			while(j>=1&&a[j-1]>a[j]){
				a[j]=a[j-1];
				j--;
			}
			a[j]=tmp;
		}
	}

	//希尔排序 分组的插入排序：逐渐缩小步距为1  不稳定nlogn
	public static void shellSort(int[] a){
		for(int gap=a.length/2;gap>0;gap/=2){
			for(int i=gap;i<a.length;i+=gap){
				int j=i;
				int tmp=a[j];
				while(j>=gap&&a[j-gap]>a[j]){
					a[j]=a[j-gap];
					j-=gap;
				}
				a[j]=tmp;
			}
		}
	}

	//归并排序，对两个有序序列可以归并为一个有序序列  稳定nlogn
	private  static void merge(int[] a,int l,int mid,int r){
		int[] tmp=new int[r-l+1];
		int i=l,j=mid+1,k=0;
		while(i<=mid&&j<=r){
			if(a[j]<a[i]){
				a[k++]=a[j++];
			}else{
				a[k++]=a[i++];
			}
		}
		while(i<=mid){
			a[k++]=a[i++];
		}
		while(j<=r){
			a[k++]=a[j++];
		}
		for(int x=0;x<k;x++){
			a[x+l]=tmp[x];
		}
	}
    private  static void mergeSort(int[] a,int l,int r){
		if(l<r){
			int mid=l+(r-l)/2;
			mergeSort(a,l,mid);
			mergeSort(a,mid+1,r);
			merge(a,l,mid,r);
		}
	}
	public static  void mergeSort(int[] a){
		mergeSort(a,0,a.length-1);
	}


	//快速排序
	public static void quickSort(int[] a) {
		quickSort(a,0,a.length);
	}
	private static void quickSort(int[] a,int l,int r){
		if(l<r){
			int mid=getMid(a,l,r);
			quickSort(a,l,mid);
			quickSort(a,mid+1,r);
		}
	}

	private static int getMid(int[] a, int l, int r) {
		int tmp=a[l];
		while(l<r){
			while(l<r&&a[r]>=tmp){
				r--;
			}
			a[l]=a[r];
			while(l<r&&a[l]<=tmp){
				l++;
			}
			a[r]=a[l];
		}
		a[l]=tmp;
		return l;
	}
}
