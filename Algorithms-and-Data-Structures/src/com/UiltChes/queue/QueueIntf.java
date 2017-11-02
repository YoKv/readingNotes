package com.UiltChes.queue;

/**
 * @author Yo
 * 
 */
public interface QueueIntf {
	/**
	 * 入队列
	 */
	public void enQueue(Object object);

	/**
	 * 出队列
	 */
	public Object delQueue();

	/**
	 * 返回队列元素个数
	 */
	public int size();

	/**
	 * 清空队列
	 */
	public void clear();

	/**
	 * 是否为空，是 true 否false
	 */
	public boolean isEmpty();

	/**
	 * 取队首元素
	 */
	public Object head();
}
