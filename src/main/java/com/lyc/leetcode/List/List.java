package com.lyc.leetcode.List;

/**
 * @author liaoyichen
 * @date 2019/4/23
 * @description
 */
public class List {

	/**
	 * @author liaoyichen
	 * @date 2019/4/23
	 * @description 反转链表 当前节点的next和pre调换一下就行，pre,curr向后移动，直到curr=null,这时的pre就是头节点
	 */
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode curr = head;
		while (null != curr) {
			ListNode tmp = curr.next;
			curr.next = pre;
			pre = curr;
			curr = tmp;
		}
		return pre;
	}
}
