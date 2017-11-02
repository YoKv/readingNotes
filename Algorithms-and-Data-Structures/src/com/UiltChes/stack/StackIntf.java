package com.UiltChes.stack;

/**
 * 栈的抽象数据描述
 */
public interface StackIntf {
	/**
	 * 入栈
	 */
	public void push(Object object);

	/**
	 * 出栈
	 * 
	 * @return object
	 */
	public Object pop();

	/**
	 * 返回栈中元素个数
	 */
	public int size();

	/**
	 * 清空栈
	 */
	public void clear();

	/**
	 * 判断是否为空，空true，非空false
	 */
	public boolean isEmpty();

	/**
	 * 读取栈顶元素
	 */
	public Object top();
}
