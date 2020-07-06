package com.javademo.binarytree;


class Node2{
	int data;
	Node2 left, right;
	
	Node2(int d){
		data = d;
		left=right = null;
	}
}
public class RightViewofTree {
	static Node2 root;
	int max_level = 0;
	
	
	void leftView(Node2 root, int level) {
		
		if(root == null)
			return;
		
		if(max_level < level) {
			System.out.print(" "+ root.data);
			max_level = level;
		}
		
		
		leftView(root.left, level - 1);
		leftView(root.right, level + 1);
	}

	 
	public static void main(String args[]) 
    { 
        /* creating a binary tree and entering the nodes */
		RightViewofTree tree = new RightViewofTree(); 
        tree.root = new Node2(12); 
        tree.root.left = new Node2(10); 
        tree.root.right = new Node2(30); 
        tree.root.right.left = new Node2(25); 
        tree.root.right.right = new Node2(40); 
  
        tree.leftView(root,1); 
    } 

}
