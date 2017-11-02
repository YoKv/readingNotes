package com.UiltChes.stack;

/**
 * 链式栈
 */
public class LinkStack implements StackIntf {
	StackNode top;

	public LinkStack() {
		top = null;
	}

	@Override
	public void push(Object object) {
		StackNode s = null;
		s = new StackNode();// 生成新结点
		s.data = object;
		s.next = top;
		top = s;
	}

	@Override
	public Object pop() {
		StackNode p = null;
		Object object;
		if (top == null) {
			return 0;
		} else {
			object = top.data;
			p = top;
			top = p.next;
			p = null;
			return object;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object top() {
		// TODO Auto-generated method stub
		return null;
	}

}
