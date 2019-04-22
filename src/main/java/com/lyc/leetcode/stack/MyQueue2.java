package com.lyc.leetcode.stack;

import java.util.Stack;

/**
 * @author liaoyichen
 * @date 2019/4/22
 * @description
 * 取的时候处理顺序
 */
public class MyQueue2 {

	private Stack<Integer> in;
	private Stack<Integer> out;

	/** Initialize your data structure here. */
	public MyQueue2() {
		this.in=new Stack<>();
		this.out=new Stack<>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		in.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		if(out.isEmpty()){
			while(!in.isEmpty()){
				out.push(in.pop());
			}
		}
		return out.pop();
	}

	/** Get the front element. */
	public int peek() {
		if(out.isEmpty()){
			while(!in.isEmpty()){
				out.push(in.pop());
			}
		}
		return out.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return in.empty()&&out.empty();
	}

}
