package com.javademo.binarytree;

import java.util.Queue; 
import java.util.TreeMap; 
import java.util.LinkedList; 
import java.util.Map; 
import java.util.Map.Entry; 

// class to create a Node11 
class Node11 { 
	int data; 
	Node11 left, right; 

	public Node11(int data) { 
		this.data = data; 
		left = right = null; 
	} 
} 

// class of binary tree 
class TopViewofTree { 
	Node11 root; 

	public TopViewofTree() { 
		root = null; 
	} 
	
	// function should print the topView of 
	// the binary tree 
	private void TopView(Node11 root) { 
		class QueueObj { 
			Node11 Node11; 
			int hd; 

			QueueObj(Node11 Node11, int hd) { 
				this.Node11 = Node11; 
				this.hd = hd; 
			} 
		} 
		Queue<QueueObj> q = new LinkedList<QueueObj>(); 
		Map<Integer, Node11> topViewMap = new TreeMap<Integer, Node11>(); 

		if (root == null) { 
			return; 
		} else { 
			q.add(new QueueObj(root, 0)); 
		} 

		System.out.println("The top view of the tree is : "); 
		
		// count function returns 1 if the container 
		// contains an element whose key is equivalent 
		// to hd, or returns zero otherwise. 
		while (!q.isEmpty()) { 
			QueueObj tmpNode11 = q.poll(); 
			if (!topViewMap.containsKey(tmpNode11.hd)) { 
				topViewMap.put(tmpNode11.hd, tmpNode11.Node11); 
			} 

			if (tmpNode11.Node11.left != null) { 
				q.add(new QueueObj(tmpNode11.Node11.left, tmpNode11.hd - 1)); 
			} 
			if (tmpNode11.Node11.right != null) { 
				q.add(new QueueObj(tmpNode11.Node11.right, tmpNode11.hd + 1)); 
			} 

		} 
		for (Entry<Integer, Node11> entry : topViewMap.entrySet()) { 
			System.out.print(entry.getValue().data+" "); 
		} 
	} 
	
	// Driver Program to test above functions 
	public static void main(String[] args) 
	{ 
		/* Create following Binary Tree 
			1 
		/ \ 
		2 3 
		\ 
			4 
			\ 
			5 
			\ 
				6*/
		TopViewofTree tree = new TopViewofTree(); 
		tree.root = new Node11(1); 
		tree.root.left = new Node11(2); 
		tree.root.right = new Node11(3); 
		tree.root.left.right = new Node11(4); 
		tree.root.left.right.right = new Node11(5); 
		tree.root.left.right.right.right = new Node11(6); 
		System.out.println("Following are Node11s in top view of Binary Tree"); 
		tree.TopView(tree.root); 
	} 
	
} 
