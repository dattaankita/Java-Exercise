package Array2d;

import java.util.Arrays;
import java.util.Scanner;

public class Array2dManipulate {
	
	int arr[][]= null;

	public Array2dManipulate(int row, int col) {
		
		arr = new int[row][col];
		for(int row1=0;row1<arr.length;row1++) {
			for(int col1=0;col1<arr.length;col1++) {
				arr[row1][col1]= Integer.MIN_VALUE;
			}}
		}
		
	

	public void traverseArray() {
		try {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					System.out.println(arr[i][j]);
				}
				System.out.println();
			}System.out.println("\n");
		}catch(Exception e) {
			System.out.println("array does not exixt");
		}
		
	}



	public void insertArray(int i, int j,int value) {
		try {
		if(arr[i][j]==Integer.MIN_VALUE) {
			arr[i][j]=value;
			
		}else {
			System.out.println("occupied");
		}
		
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index");
	}
	}



	public void accessArray(int i,int j) {
		try {
			System.out.println(arr[i][j]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
		System.out.println();
	}



	public void searchArray(int val) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j] == val) {
					System.out.println("value found");
					return;
				}
			}
		}
		System.out.println("value not found");
	}



	public void deleteArray(int i, int j) {
		try {
			arr[i][j]= Integer.MIN_VALUE;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("invalid input");
		}
	}
	
	
}
