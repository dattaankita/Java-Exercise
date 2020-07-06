package com.javademo.binarytree;


class Node3 { 
	int data; 
	Node3 left, right; 

	public Node3(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
}

public class LeftViewofTree {
	// Java program to print left view of binary tree 

	/* Class containing left and right child of current 
	Node3 and key value*/
	 

	/* Class to print the left view */
	 
		Node3 root; 
		static int max_level = 0; 

		// recursive function to print left view 
		void leftViewUtil(Node3 Node3, int level) 
		{ 
			// Base Case 
			if (Node3 == null) 
				return; 

			// If this is the first Node3 of its level 
			if (max_level < level) { 
				System.out.print(" " + Node3.data); 
				max_level = level; 
			} 

			// Recur for left and right subtrees 
			leftViewUtil(Node3.left, level + 1); 
			leftViewUtil(Node3.right, level + 1); 
		} 

		// A wrapper over leftViewUtil() 
		void leftView() 
		{ 
			leftViewUtil(root, 1); 
		} 

		/* testing for example Node3s */
		public static void main(String args[]) 
		{ 
			/* creating a binary tree and entering the Node3s */
			LeftViewofTree tree = new LeftViewofTree(); 
			tree.root = new Node3(12); 
			tree.root.left = new Node3(10); 
			tree.root.right = new Node3(30); 
			tree.root.right.left = new Node3(25); 
			tree.root.right.right = new Node3(40); 

			tree.leftView(); 
		} 
	} 


