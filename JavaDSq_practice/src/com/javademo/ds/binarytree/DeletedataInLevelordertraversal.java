package com.javademo.ds.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class DeletedataInLevelordertraversal {
	
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
	
	public static void deletedeep(Node root, Node d_node) {
		
		Queue<Node> q= new LinkedList<Node>();
		q.add(root);
		Node temp;
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			
			if(temp == d_node) {
				temp= null;
				delete(d_node);
				return;
			}
			
			if(temp.left == d_node) {
				temp= null;
				delete(d_node);
				return;
			}else
				q.add(temp.left);
			
			if(temp.right == d_node) {
				temp= null;
				delete(d_node);
				return;
			}else
				q.add(temp.right);
		}
	}

	
	private static void delete(Node d_node) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		root= new Node(1);

		root.left= new Node(2);
		root.right= new Node(3);
		root.left.left= new Node(4);
		
		inorder(root);
		delete(root, 15);
		inorder(root);
	}

	private static void delete(Node root2, int i) {
		// TODO Auto-generated method stub
		
	}

}
