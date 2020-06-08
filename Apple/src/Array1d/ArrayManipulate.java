package Array1d;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulate {
	
	int arr[] = null;

	public ArrayManipulate(int sizeofarr) {
		
		arr = new int[sizeofarr];
		for(int i=0;i< arr.length;i++) {
			arr[i] = Integer.MIN_VALUE;
		}
		
	}
	
	public void traverseArray() {
		try {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("\n");
		}
		catch(Exception e) {
			System.out.println("Array not found");
		}
	}
	
	public void insertArray(int loc, int value) {
		try {
			if(arr[loc] == Integer.MIN_VALUE) {
				arr[loc] = value;
				System.out.println(Arrays.toString(arr));
			}
			else
				System.out.println("value is there");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid inddex");
		}
		
	}
	
	public void searchArray(int value) {
		for (int i=0;i<arr.length;i++) {
			if(arr[i] == value) {
				System.out.println(i);
				return;
			}
			System.out.println("value not found");
		}
	}
	
	public void deleteArray(int value) {
		try {
			arr[value] = Integer.MIN_VALUE;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Invalid index");
		}
		
	}
}
