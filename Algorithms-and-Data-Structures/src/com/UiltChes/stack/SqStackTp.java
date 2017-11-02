package com.UiltChes.stack;

/**
 * 顺序栈sequential stack 利用地址连续的存储单元存储 top指示栈顶元素的当前位置，空栈为0
 */
public class SqStackTp implements StackIntf {
	final int maxsize = 100;
	Object[] elem = new Object[maxsize];
	int top;

	public SqStackTp() {
		top = 0;
	}

	@Override
	public void push(Object object) {
		if (top == maxsize) {
			System.out.println("OverFlow");
		} else {
			elem[top++] = object;
		}
	}

	@Override
	public Object pop() {
		if (top == 0) {
			return 0;
		} else {
			top--;
			return elem[top];
		}
	}

	@Override
	public int size() {
		return top;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isEmpty() {
		if (top > 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object top() {
		if (top == 0) {
			return 0;
		} else {
			return elem[top - 1];
		}
	}

}
