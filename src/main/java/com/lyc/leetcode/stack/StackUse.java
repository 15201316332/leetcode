package com.lyc.leetcode.stack;

import java.util.Stack;

/**
 * @author liaoyichen
 * @date 2019/4/23
 * @description
 */
public class StackUse {

	/**
	 * @author liaoyichen
	 * @date 2019/4/23
	 * @description 判断一个只由括号（）{} [] 组成的字符串是否合法；
	 */
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ci = s.charAt(i);
			if ('(' == ci || '{' == ci || '[' == ci) {
				stack.push(ci);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char cs = stack.pop();
				if (')' == ci && '(' != cs ||
					'}' == ci && '{' != cs ||
					']' == ci && '[' != cs) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	/**
	 * @author liaoyichen
	 * @date 2019/4/23
	 * @description 输入一组温度，判断隔几天会变热 使用循环：时间复杂度o(n*n)
	 */
	public int[] dailyTemperatures1(int[] T) {
		int[] r = new int[T.length];
		for (int i = 0; i < T.length-1; i++) {
			for (int j = i + 1; j < T.length; j++) {
				if (T[j] > T[i]) {
					r[i] = j - i;
					break;
				}
			}
		}
		return r;
	}

	/***  使用栈来解决：
	 *  未获得结果的存在栈里，与当前比较
	 *
	 * ***/
	public int[] dailyTemperatures(int[] t) {
		int n=t.length;
		int[] r=new int[n];
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<n;i++){
			while(!stack.isEmpty()&&t[i]>t[stack.peek()]){
				int idx=stack.pop();
				r[idx]=i-idx;
			}
			stack.push(i);
		}
		return r;
	}

}


