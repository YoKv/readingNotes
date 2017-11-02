package com.UiltChes.queue;

/**
 * 链队列
 * 
 */
public class LqueueTp implements QueueIntf {
	public Nodetype front;
	public Nodetype rear;

	public LqueueTp() {
		front = new Nodetype();
		front.next = null;
		rear = front;
	}

	@Override
	public void enQueue(Object object) {
		Nodetype s;
		s = new Nodetype();
		s.data = object;
		s.next = null;
		rear.next = s;
		rear = s;
	}

	@Override
	public Object delQueue() {
		Object x;
		Nodetype p;
		if (front == rear) {
			return 0;
		} else {
			p = front.next;
			front.next = p.next;
			if (p.next == null) {
				rear = front;
			}
			x = p.data;
			p = null;
			return x;
		}
	}

	@Override
	public int size() {
		int i = 0;
		Nodetype p = front.next;
		while (p != null) {
			i++;
			p = p.next;
		}
		return i;
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
		if (front == rear) {
			return 0;
		} else {
			return (front.next.data);
		}
	}

}
