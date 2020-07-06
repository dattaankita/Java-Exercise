package com.javademo.interviewQuestions;

//Input:
//List1: 5->6->3 // represents number 365
//List2: 8->4->2 // represents number 248
//Output:
//Resultant list: 3->1->6 // represents number 613
//Explanation: 365 + 248 = 613
public class Add2numbersofLL {
	
	Node head1, head2;
	
	Node AddLL(Node first, Node second) {
		
		Node res=null;
		Node prev = null;
		Node temp= null;
		int carry =0, sum;
		
		while(first!= null||second != null) {
			sum = carry + (first.data != 0? first.data : 0) + (second.data != 0? second.data : 0);
			carry = (sum >= 10? 1: 0);
			sum= sum % 10;
			temp= new Node(sum);
			
			if(res == null)
				res=temp;
			else
				prev.next=temp;
		}
		prev=temp;
		
		if(first != null)
			first= first.next;
		if(second != null)
			second= second.next;
		
		temp= new Node(carry);
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
