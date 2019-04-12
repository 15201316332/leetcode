package com.lyc.leetcode.math;

/**
 * @author liaoyichen
 * @date 2019/4/12
 * @description
 */
public class Math {

	/**
	 * @author liaoyichen
	 * @date 2019/4/12
	 * @description 计算一个数前面的素数个数
	 */
	public static int getPrimesCount(int n){
		boolean[] notPrimes = new boolean[n + 1];
		int count=0;
		for(int i=0;i<notPrimes.length;i++){
			if(notPrimes[i]){
				continue;
			}
			count++;
			for(int j=i*i;j<n;j+=i){
				notPrimes[j]=true;
			}
		}
		return count;
	}
}
