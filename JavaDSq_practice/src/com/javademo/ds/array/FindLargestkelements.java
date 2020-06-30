package com.javademo.ds.array;

public class FindLargestkelements {

	public static void main(String[] args) {
		int arr[]= {1, 23, 12, 9, 30, 2, 50};
		int n=3;
		int l= arr.length;
		for(int i=0;i<l-1;i++) {
			for(int j=0;j<l-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		for(int i=0;i<l;i++)
			System.out.println(arr[i]);
		
		for(int i=n+1;i<l;i++)
			System.out.println(arr[i]);

	}

}
//public static void kLargest(Integer[] arr, int k) 
//{ 
//    // Sort the given array arr in reverse order 
//    // This method doesn't work with primitive data 
//    // types. So, instead of int, Integer type 
//    // array will be used 
//    Arrays.sort(arr, Collections.reverseOrder()); 
//
//    // Print the first kth largest elements 
//    for (int i = 0; i < k; i++) 
//        System.out.print(arr[i] + " "); 
//} 