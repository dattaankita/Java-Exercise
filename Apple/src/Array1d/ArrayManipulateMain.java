package Array1d;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulateMain {

	public static void main(String[] args) {
		
		ArrayManipulate amt= new ArrayManipulate(10);
		
		amt.traverseArray();
		
		amt.insertArray(3, 50);
		
		amt.deleteArray(6);
		
		amt.searchArray(50);
		
//		Scanner s = new Scanner(System.in);
//	      int length = s.nextInt();
//	      int [] myArray = new int[length];
//	      
//	      for(int i=0; i<length; i++ ) {
//	         myArray[i] = s.nextInt();
//	      }
//	      
//	      System.out.println(Arrays.toString(myArray));
	      
	}

}
