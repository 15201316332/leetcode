package com.lyc.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liaoyichen
 * @date 2019/4/23
 * @description 插入时修改顺序
 */
public class MyStack {

	private Queue<Integer> queue;

	/**
	 * Initialize your data structure here.
	 */
	public MyStack() {
		this.queue = new LinkedList<>();
	}

	/**
	 * Push element x onto stack.
	 * 反转队列
	 */
	public void push(int x) {
		queue.add(x);
		for (int i = 1; i < queue.size(); i++) {
			queue.add(queue.remove());
		}
	}

	/**
	 * Removes the element on top of the stack and returns that element.
	 */
	public int pop() {
		return queue.remove();
	}

	/**
	 * Get the top element.
	 */
	public int top() {
		return queue.peek();
	}

	/**
	 * Returns whether the stack is empty.
	 */
	public boolean empty() {
		return queue.isEmpty();
	}

}
