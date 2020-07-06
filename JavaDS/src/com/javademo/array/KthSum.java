package com.javademo.array;

public class KthSum {
	 

	//Write a program to find sum of first largest k elements from a given array of integers.

	public static void main(String[] args) {
		
		int arr[]= {1, 23, 12, 9, 30, 2, 50};
		int n=arr.length;
		int k=3;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		int sum=0;
		for(int i=n-1;i>k;i--) {
			sum += arr[i];
		}
			System.out.println(sum);

	}
//	Arrays.sort(arr, Collections.reverseOrder()); 
//	  
//    // Print the first kth largest elements 
//    for (int i = 0; i < k; i++) 
//        System.out.print(arr[i] + " "); 
} 


