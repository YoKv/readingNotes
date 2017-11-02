package com.UiltChes.tree;

/**
 * 二叉树
 * 
 * 存储结构： 顺序存储 用一组连续的存储单元，将二叉树中编号为i的结点数据存储在数组tree[i-1] 链式存储
 * 链表中的结点必须包含3个域，数据域，左子树，右子树（二叉链表） 有时为了便于找到结点的双亲，还增加一个域指向双亲（三叉链表）
 */
public interface Tree {
	/**
	 * 初始化
	 */
public void initate();
}
