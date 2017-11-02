package com.UiltChes.queue;

/**
 * 顺序队列 队尾指针 指示队尾元素在一维数组的当前位置 队头指针 指示队头元素在一维数组的当前位置的前一个位置 空队列,rear=front=-1
 */
public class SqueueTp implements QueueIntf {
	public final int maxsize = 100;
	Object[] elem = new Object[maxsize];
	int front, rear;

	public SqueueTp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enQueue(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object delQueue() {
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
	public Object head() {
		// TODO Auto-generated method stub
		return null;
	}

}
