package com.javademo.ds.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertdataInLevelordertraversal {
	
	static Node root;
	static Node temp = root;
	
	public static void inorder(Node temp) {
		if(temp==null) {
			return;
		}
		inorder(root.left);
		System.out.println(temp.data+ "->");
		inorder(root.right);
	}
	
	public static void insert(Node temp, int value) {
		
		Queue<Node> q= new LinkedList<Node>();
		q.add(temp);
		
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			
			
			if(temp.left == null) {
				temp= new Node(value);
				break;
			}else
				q.add(temp);
			
			if(temp.right == null) {
				temp= new Node(value);
				break;
			}else
				q.add(temp);
		}
	}

	public static void main(String[] args) {
		
		root= new Node(1);

		root.left= new Node(2);
		root.right= new Node(3);
		root.left.left= new Node(4);
		
		inorder(root);
		insert(root, 15);
		inorder(root);
	}

}
