package com.lyc.leetcode.stack;

import java.util.Stack;

/**
 * @author liaoyichen
 * @date 2019/4/23
 * @description o(1)时间获取最小值的栈 min最小值。minStack记录最小值栈；
 */
public class MinStack {

	private Stack<Integer> dataStack;
	private Stack<Integer> minStack;
	int min;

	public MinStack() {
		dataStack = new Stack<>();
		minStack = new Stack<>();
		min = Integer.MAX_VALUE;
	}

	public void push(int x) {
		dataStack.push(x);
		if (x < min) {
			min = x;
		}
		minStack.push(min);
	}

	public void pop() {
		dataStack.pop();
		minStack.pop();
		if (minStack.isEmpty()) {
			min = Integer.MAX_VALUE;
		} else {
			min = minStack.peek();
		}
	}

	public int top() {
		return dataStack.peek();
	}

	public int getMin() {
		return min;
	}
}
