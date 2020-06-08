package com.javademo.array;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
	
	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
    int length = s.nextInt();
    int [] myArray = new int[length];
    
    for(int i=0; i<length; i++ ) {
       myArray[i] = s.nextInt();
    }
    
    System.out.println(Arrays.toString(myArray));
    
    
//    Scanner s = new Scanner(System.in);
//    int m = s.nextInt();
//    int n = s.nextInt();
//    int [][] myArray = new int[m][n];
//    
//    for(int i=0; i<m; i++ ) {
//  	  for(int j=0; j<n; j++) {
//  		  myArray[i][j] = s.nextInt();
//  	  }
//    }
//    
//    for(int i=0; i<m; i++ ) {
//  	  for(int j=0; j<n; j++) {
//  		  System.out.println(myArray[i][j]);
//  	  }
//    }
//    
	}
} 


