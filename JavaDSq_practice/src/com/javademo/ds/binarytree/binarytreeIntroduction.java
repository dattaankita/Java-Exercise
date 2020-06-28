package com.javademo.ds.binarytree;




public class binarytreeIntroduction {
	
	Node root;

	binarytreeIntroduction(int key){
		root= new Node(key);
	}
	
	binarytreeIntroduction(){
		root=null;
	}
		
	public static void main(String[] args) {
		
		binarytreeIntroduction tree= new binarytreeIntroduction();
		tree.root= new Node(1);

		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left= new Node(4);

	}

}
