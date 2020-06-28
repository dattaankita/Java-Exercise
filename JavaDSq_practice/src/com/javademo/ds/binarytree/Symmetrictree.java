package com.javademo.ds.binarytree;

public class Symmetrictree {
	
	Node root;
	
	boolean isSymmeric(Node node) {
		return isMirror(root,root);
	}

	private boolean isMirror(Node root1, Node root2) {
		// TODO Auto-generated method stub
		if(root1 == null && root2 == null)
			return true;
		if(root1 != null && root2 != null && root1.data == root2.data)
			return (isMirror(root1.left,root2.right) && isMirror(root1.right,root2.left));
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
