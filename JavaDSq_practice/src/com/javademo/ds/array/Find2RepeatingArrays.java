package com.javademo.ds.array;
//
//Find the two repeating elements in a given array
//You are given an array of n+2 elements. All elements of the array are in range 1 to n. And all elements occur once except two numbers which occur twice. Find the two repeating numbers.
//For example, array = {4, 2, 4, 5, 2, 3, 1} and n = 5
//
//The above array has n + 2 = 7 elements with all elements occurring once except 2 and 4 which occur twice. So the output should be 4 2.

import java.util.Vector;

public class Find2RepeatingArrays {
	
	public void FindElement(int arr[]) {
		Vector<Integer> v= new Vector<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!v.contains(arr[i]))
				v.add(arr[i]);
			else
				System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		 	Find2RepeatingArrays repeat = new Find2RepeatingArrays(); 
	        int arr[] = {4, 2, 4, 5, 2, 3, 1};
	        repeat.FindElement(arr); 

	}

}
