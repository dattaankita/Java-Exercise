package com.javademo.linkedlist;


public class CreateLinkedList {

		static Node head; 
		
		static class Node { 
			int data; 
			Node next; 
			Node(int d) 
			{ 
				data = d; 
				next = null; 
			} // Constructor 
		} 

		
		 /* This function prints contents of linked list starting from head */
	    public void printList() 
	    { 
	        Node n = head; 
	        while (n != null) { 
	            System.out.print(n.data + " "); 
	            n = n.next; 
	        } 
	        System.out.println("\n");
	    } 
	    
	    public void insertFront(int value) {
	    	
	    	Node new_node= new Node(value);
	    	
	    	new_node.next= head;
	    	
	    	head= new_node;
	    }
	    
	    
	    public void insertLast(int value) {
	    	
	    	Node new_node= new Node(value);
	    	
	    	if (head == null) {
	    		head= new Node(value);
	    		return;
	    	}
	    	
	    	new_node.next= null;
	    	
	    	Node last=head;
	    	
	    	while(last.next != null)
	    		last=last.next;
	    	
	    	last.next = new_node;
	    	
	    	return;
	    	
	    }
	    
	    public void insertRand(Node prev_node, int value) {
	    	
	    	Node new_node= new Node(value);
	    	
	    	new_node.next=prev_node.next;
	    	
	    	prev_node.next= new_node;
	    }
	    
	    
	    public void deleteRand(Node prev_node) {
	    	
	    	prev_node.next=prev_node.next.next;
	    }
	    
	    Node reverse(Node node) 
	    { 
	        Node prev = null; 
	        Node current = node; 
	        Node next = null; 
	        while (current != null) { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        node = prev; 
	        return node; 
	    } 
	  
	    
		/* method to create a simple linked list with 3 nodes*/
		public static void main(String[] args) 
		{ 
			/* Start with the empty list. */
			CreateLinkedList llist = new CreateLinkedList(); 

			llist.head = new Node(10); 
			Node second = new Node(20); 
			Node third = new Node(30); 

			llist.head.next = second; // Link first node with the second node 

			second.next = third; // Link second node with the third node 

			llist.printList();
			
			llist.insertFront(5);
			
			llist.insertLast(50);
			
			llist.insertRand(second, 80);
			
			llist.deleteRand(second);
			
			llist.printList();
			
			head = llist.reverse(head);
			
			llist.printList();
			
		} 
	} 



