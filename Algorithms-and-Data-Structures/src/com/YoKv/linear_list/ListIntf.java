package com.YoKv.linear_list;

/**
 * 线性表的抽象数据类型定义
 */
public interface ListIntf {
	public int size();

	public void clear();

	public boolean isEmpty();

	public Object get(int i);

	public int indexOf(Object obj);

	public Object getPre(Object obj);

	public Object getNext(Object obj);

	public void insertElementAt(Object obj, int i);

	public Object remove(int i);

	public Object remove(Object obj);
}
