package com.javademo.ds.singlelinkedlist;


//
//Input : C (a pointer to C)
//Output : A-->B-->D-->E-->F
//
//Input : A (a pointer to A)
//Output : B-->D-->E-->F

public class DeletenodewithoutHead {
	Node ptr;
	static Node head;
	
	
	
	void printList(Node n) {
		if(n.next != null) {
			System.out.println(n.data +"->  ");
			n=n.next;
		}    
	}
	
	private void deleteNode(Node ptr) {
		if(ptr == null)
			return;
		else {
			if(ptr.next == null)
				return;
			
			ptr.next=ptr.next.next;
			ptr.data= ptr.next.data;
			System.gc();
			
		}}
	
	public static void main(String[] args) {
		DeletenodewithoutHead list = new DeletenodewithoutHead(); 
        list.head = new Node(1); 
        list.head.next = new Node(12); 
        list.head.next.next = new Node(1); 
        list.head.next.next.next = new Node(4); 
        list.head.next.next.next.next = new Node(1); 
  
        System.out.println("Before Deleting "); 
        list.printList(head); 
  
        /* I m deleting the head itself. 
         You can check for more cases */
        list.deleteNode(head); 
        System.out.println(""); 
        System.out.println("After deleting "); 
        list.printList(head); 
	}
	
		
	}


