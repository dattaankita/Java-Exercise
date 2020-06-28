package com.javademo.ds.binarytree;

public class CalculateExptree {

	public int evaluateExpressionTree(Node root) {
		
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null)
			return root.data;
		
		int left_sum = evaluateExpressionTree(root.left);
		int right_sum = evaluateExpressionTree(root.right);
		
		if(root.data == '+')
			return left_sum + right_sum;
		
		else if(root.data == '-')
			return left_sum - right_sum;
		
		else if(root.data == '*')
			return left_sum * right_sum;
		
		else
		    return left_sum / right_sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
