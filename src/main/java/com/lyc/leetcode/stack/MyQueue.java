package com.lyc.leetcode.stack;

import java.util.Stack;

/**
 * @author liaoyichen
 * @date 2019/4/22
 * @description
 *  存的时候处理顺序
 */
public class MyQueue {

	private Stack<Integer> stack;

	/** Initialize your data structure here. */
	public MyQueue() {
		this.stack=new Stack<>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		Stack<Integer> temp=new Stack<>();
		while(!stack.empty()){
			temp.push(stack.pop());
		}
		temp.push(x);
		while(!temp.empty()){
			stack.push(temp.pop());
		}
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		return stack.pop();
	}

	/** Get the front element. */
	public int peek() {
		return stack.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return stack.empty();
	}
}
