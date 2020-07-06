package com.javademo.interviewQuestions;
import java.util.*; 
//Approach:
//
//First create the K level balanced binary tree using level order traversal and give values starting from 1 and increasing from left to right.
//Now start to merge the level by summing up the two node at a time by using level order
//At the end, Print each level of the binary tree
public class diamondTree {
	// Java programm to create the diamond 
	// like structre of Binary Tree 
	// for a given value of K 
	

	

	// A Tree node 
	static class Node { 
		int data; 
		Node left; 
		Node right; 
	}; 

	// Utility function to create a new node 
	static Node createNewNode(int value) 
	{ 
		Node temp = null; 
		temp = new Node(); 
		temp.data = value; 
		temp.left = null; 
		temp.right = null; 
		return temp; 
	} 

	// Utility function to create the diamond 
	// like structre of Binary tree 
	static void createStructreUtil(Queue<Node> qu, 
							int k) 
	{ 
		int num = 1; 
		int level = k - 1; 

		// Run the outer while loop 
		// and create structre up to 
		// the k levels 
		while (level-- >0) { 

			int qsize = qu.size(); 

			// Run inner while loop to 
			// create current level 
			while (qsize-- > 0) { 

				Node temp = qu.peek(); 
				qu.remove(); 
				num += 1; 

				// Create left child 
				temp.left = createNewNode(num); 
				num += 1; 

				// Create right child 
				temp.right = createNewNode(num); 

				// Push the left child into 
				// the queue 
				qu.add(temp.left); 

				// Push the right child into 
				// the queue 
				qu.add(temp.right); 
			} 
		} 
		num += 1; 

		// Run the while loop 
		while (qu.size() > 1) { 

			// Pop first element from the queue 
			Node first = qu.peek(); 
			qu.remove(); 

			// Pop second element from the queue 
			Node second = qu.peek(); 
			qu.remove(); 

			// Create diamond structre 
			first.right 
				= createNewNode(first.data 
								+ second.data); 
			second.left = first.right; 

			// Push the node into the queue 
			qu.add(first.right); 
		} 
	} 

	// Function to print the Diamond 
	// Structre of Binary Tree 
	static void printLevelOrder(Node root, int k) 
	{ 
		// Base Case 
		if (root == null) 
			return; 

		// Create an empty queue 
		Queue<Node> qu = new LinkedList<>(); 

		// Enqueue Root and initialize height 
		qu.add(root); 
		int level = k - 1; 

		// while loop to print the element 
		// up to the (k - 1) levels 
		while (level-- > 0) { 

			int qsize = qu.size(); 
			while (qsize-- > 0) { 

				Node temp = qu.peek(); 
				qu.remove(); 
				System.out.print(temp.data+ " "); 

				// Enqueue left child 
				if (temp.left != null) 
					qu.add(temp.left); 

				// Enqueue right child 
				if (temp.right != null) 
					qu.add(temp.right); 
			} 
			System.out.println(); 
		} 

		// Loop to print the element 
		// rest all level except last 
		// level 
		while (qu.size() > 1) { 

			int qsize = qu.size(); 
			while (qsize > 0) { 

				Node first = qu.peek(); 
				qu.remove(); 
				Node second = qu.peek(); 
				qu.remove(); 
				System.out.print(first.data+ " "
					+ second.data+ " "); 
				qu.add(first.right); 
				qsize = qsize - 2; 
			} 
			System.out.println(); 
		} 

		// Print the last element 
		Node first = qu.peek(); 
		qu.remove(); 
		System.out.print(first.data +"\n"); 
	} 

	// Function to create the 
	// structre 
	static void createStructre(int k) 
	{ 
		Queue<Node> qu = new LinkedList<>(); 
		Node root = createNewNode(1); 
		qu.add(root); 

		// Utility Function call to 
		// create structre 
		createStructreUtil(qu, k); 
		printLevelOrder(root, k); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		int k = 4; 

		// Print Structre 
		createStructre(k); 
	} 
	}
