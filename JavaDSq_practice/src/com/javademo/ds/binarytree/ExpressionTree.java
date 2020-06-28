package com.javademo.ds.binarytree;

import java.util.Stack;

public class ExpressionTree {
	
	boolean IsOperator(char c) {
		if(c == '+' || c == '-'|| c=='*'||c=='^'||c=='/')
			return true;
		return false;
	}

	
	Node constructTree(char postfix[]) {
		Stack<Node> st= new Stack();
		Node t, t1,t2;
		
		for(int i=0;i<postfix.length;i++) {
			if(!IsOperator(postfix[i])) {
				t= new Node(postfix[i]);
				st.push(t);
			}
			else {
				t=new Node(postfix[i]);
				t1=st.pop();
				t2=st.pop();
				
				t.left=t2;
				t.right=t1;
				 
				st.push(t);
			}
		}
		t=st.peek();
		st.pop();
		return t;
		
	}
	public static void main(String[] args) {
		ExpressionTree et= new ExpressionTree();
		String s= "ab+cd*bhcj/G^";
		char[] arr= s.toCharArray();
		Node root=et.constructTree(arr);
		//inorder(root);
	}

}
