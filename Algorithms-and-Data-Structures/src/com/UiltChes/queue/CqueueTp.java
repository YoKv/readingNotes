package com.UiltChes.queue;

/**
 * 循环队列 入队： sq.rear=(sq.rear+1)%maxsize sq.elem[rear]=x; 出队:
 * sq.front=(sq.front+1)%maxsize 队满：(sq.rear+1)%maxsize=sq.front;
 * 队空：sq.front=sq.rear
 */
public class CqueueTp implements QueueIntf {
	public final int maxsize = 100;
	Object[] elem = new Object[maxsize];
	int front, rear;

	public CqueueTp() {
		front = 0;
		rear = 0;
	}

	@Override
	public void enQueue(Object object) {
		if ((rear + 1) % maxsize == front) {
			System.out.println("溢出");
		} else {
			rear = (rear + 1) % maxsize;
			elem[rear] = object;
		}

	}

	@Override
	public Object delQueue() {
		if (rear == front) {
			return true;
		} else {
			front = (front + 1) % maxsize;
			return elem[front];
		}
	}

	@Override
	public int size() {
		int n = (maxsize + rear - front) % maxsize;
		return n;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty() {
		if (rear == front) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object head() {
		if (rear == front) {
			return null;
		} else {
			return elem[(front + 1) % maxsize];
		}
	}

}
