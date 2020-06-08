package Array2d;

import java.util.Scanner;


public class ArrayManipulateMain {

	public static void main(String[] args) {
		Array2dManipulate amt= new Array2dManipulate(5,5);
		
		amt.traverseArray();
		
		amt.insertArray(3,2, 50);
		
		amt.accessArray(2, 4);
		
		amt.deleteArray(3,1);
		
		amt.searchArray(50);
		
		
//		Scanner s = new Scanner(System.in);
//	      int m = s.nextInt();
//	      int n = s.nextInt();
//	      int [][] myArray = new int[m][n];
//	      
//	      for(int i=0; i<m; i++ ) {
//	    	  for(int j=0; j<n; j++) {
//	    		  myArray[i][j] = s.nextInt();
//	    	  }
//	      }
//	      
//	      for(int i=0; i<m; i++ ) {
//	    	  for(int j=0; j<n; j++) {
//	    		  System.out.println(myArray[i][j]);
//	    	  }
//	      }
//	      

	}

}
