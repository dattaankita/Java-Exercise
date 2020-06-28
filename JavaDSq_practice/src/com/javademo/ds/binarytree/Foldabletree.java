package com.javademo.ds.binarytree;

public class Foldabletree {

	Node root;
	
	boolean IsFoldable(Node node) {
		if(node== null)
			return true;
		
		return FoladableUtil(node.left, node.right);
	}
	
	boolean FoladableUtil(Node n1, Node n2) {
		if(n1 ==null && n2==null)
			return true;
		
		if(n1 ==null || n2==null)
			return false;
		
		return FoladableUtil(n1.left, n1.right) && FoladableUtil(n2.left, n2.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
