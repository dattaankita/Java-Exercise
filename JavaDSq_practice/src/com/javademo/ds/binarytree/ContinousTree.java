package com.javademo.ds.binarytree;

public class ContinousTree {
	
	public boolean isContinous(Node root){
		if(root == null)
			return true;
		else if(root.left ==null && root.right ==null) {
			return true;
		}
		else if(root.left ==null) {
			return (Math.abs(root.data - root.right.data)==1 && isContinous(root.right));
		}
		else if(root.right ==null) {
			return (Math.abs(root.data - root.left.data)==1 && isContinous(root.left));
		}
		else
			return (Math.abs(root.data - root.left.data)==1 && isContinous(root.left) && Math.abs(root.data - root.right.data)==1 && isContinous(root.right));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
