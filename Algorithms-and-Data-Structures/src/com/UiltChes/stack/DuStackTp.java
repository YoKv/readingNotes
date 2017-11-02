package com.UiltChes.stack;

/**
 * 提高空间的使用效率 一个数组两端作为栈底，栈顶向中间延伸
 */
public class DuStackTp implements StackIntf {
	final int maxsize = 100;
	Object[] elem = new Object[maxsize];
	int[] top = new int[2];

	public DuStackTp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void push(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
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
