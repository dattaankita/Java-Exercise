package com.javademo.ds.binarytree;

//In the following implementation, we traverse the tree in inorder fashion. We add nodes at the beginning of current linked list and
//update head of the list using pointer to head pointer. Since we insert at the beginning, we need to process leaves in reverse order. For reverse order, we first traverse the right subtree before the left subtree. i.e. do a reverse inorder traversal.

public class ConvertBinarytreeintoDLL {
	
	static Node head;
	static Node root;
	
	static void BtoDLL(Node root) {
		if(root == null)
			return;
		BtoDLL(root.right);
		
		if(head != null)
			(head).left= root;
		
		head = root;
		BtoDLL(root.left);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertBinarytreeintoDLL  t= new ConvertBinarytreeintoDLL ();
		BtoDLL(t.root);
	}

}
