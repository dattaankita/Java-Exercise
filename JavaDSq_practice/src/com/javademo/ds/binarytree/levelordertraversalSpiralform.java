package com.javademo.ds.binarytree;

import java.util.Deque;
import java.util.LinkedList;

public class levelordertraversalSpiralform {

	//Node root;
	public static void spiralOrder(Node node) {
		Deque q= new LinkedList();
		q.addLast(node);
		
		int dir=0;
		while(q.size() > 0) {
			int size= q.size();
			if(size --> 0) {
				if(dir == 0) {
					Node temp= q.peekLast();
					q.pollLast();
					if(temp.left != null)
						q.addFirst(temp.left);
					if(temp.right != null)
						q.addFirst(temp.right);
					System.out.println(temp.data);
				}
				else
					{
						Node temp= q.peekFirst();
						q.pollFirst();
						if(temp.left != null)
							q.addLast(temp.left);
						if(temp.right != null)
							q.addLast(temp.right);
						System.out.println(temp.data);
					}
			}
			System.out.println();
			dir = 1 - dir;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);

		root.left= new Node(2);
		root.right= new Node(3);
		root.left.left= new Node(4);
		
		spiralOrder(root);
	}

}
