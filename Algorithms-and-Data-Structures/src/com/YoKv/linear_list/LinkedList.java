package com.YoKv.linear_list;

/**
 * LinkedList 在JDK中实现是双向链表 头插法就是说插到第一个节点之前 尾插法 就是插入到链表最后一个节点之后
 */
public class LinkedList implements ListIntf {
	/*
	 * public static void main(String[] args) { LinkedList l1 = new
	 * LinkedList(0); LinkedList l2 = new LinkedList(); }
	 */

	Lnode h = null;// 头结点

	public void setH(Lnode _h) {// 设置头结点
		h = _h;
	}

	public LinkedList() {
		// 头插法建立单链表
		char ch;
		Lnode p;
		h = new Lnode();
		h.next = null;
		String str = "abcd";//
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			p = new Lnode();// 建立新结点p
			p.data = ch;// ch赋值给p的数据域
			p.next = h.next;// 改变指针状况
			h.next = p;// h的直接后继是p
		}

	}

	public LinkedList(int n) {
		// 尾插法
		Lnode p, t;
		char ch;
		h = new Lnode();
		h.next = null;
		t = h;
		String str = "abcd";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			p = new Lnode();
			p.data = ch;
			p.next = null;
			t.next = p;//
			t = p;// t始终指向最后一个元素
		}
		/**
		 * 过程:t,h为同一个实例，头结点 进入循环 新建结点，添加数据，关联借点为null 头结点指向新建的结点
		 * t与p引用相同，保证下一次循环修改指针域时，能使用t修改 进入第二次循环 新建结点，添加数据，关联借点为null
		 * 前一次循环新建的结点指向本次循环新建的结点 t与p引用相同，保证下一次循环修改指针域时，能使用t修改
		 * 进入第三次循环············
		 */
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
	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getPre(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getNext(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertElementAt(Object obj, int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
