package com.UiltChes.tree;

/**
 * 二叉链表
 * 
 */
public class Bnodept {
	Object data;
	Bnodept lchild, rchild;

	public Bnodept(Object data) {
		this.data=data;
		this.lchild=null;
		this.rchild=null;
	}
	public Bnodept(Object data,Bnodept lchild,Bnodept rchild) {
		this.data=data;
		this.lchild=lchild;
		this.rchild=rchild;
	}
	/**
	 * 先根遍历
	 * */
	void preorder(Bnodept bt){
		if(bt!=null){
			visit(bt.data);
			preorder(bt.lchild);
			preorder(bt.rchild);
		}
	}
	/**
	 * 中根遍历
	 * */
	void inorder(Bnodept bt){
		if(bt!=null){
			inorder(bt.lchild);
			visit(bt.data);
			inorder(bt.rchild);
		}
	}
	/**
	 * 后根遍历
	 * */
	void postorder(Bnodept bt){
		if(bt!=null){
			postorder(bt.lchild);
			postorder(bt.rchild);
			visit(bt.data);
		}
	}
	
	private void visit(Object data2) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 利用栈，使用非递归算法遍历
	 * */
	public final static int MAX=100;
	void preorder2(Bnodept bt){
		Bnodept stack[]=new Bnodept[MAX+1];//顺序栈
		int top=0;//栈顶指针
		do {
			while(bt!=null){
				visit(bt.data);//访问根节点
				if(top==MAX){
					System.out.println("STACK FULL!");
					return;
				}
				stack[++top]=bt;//根指针进栈
				bt=bt.lchild;//移向左子树
			}
			if(top!=0){//栈中还有根指针
				bt=stack[top--];//取出根指针
				bt=bt.rchild;//移向右子树
			}
		} while (top!=0||bt!=null);
	}
}
