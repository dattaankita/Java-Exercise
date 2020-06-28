package com.javademo.ds.array;

//Input : arr[] = {7, 4, 8, 2, 9}
//Output: 3
//Explanation: As 7 is the first element, it can 
//see the sunset.
//4 can't see the sunset as 7 is hiding it. 
//8 can see.
//2 can't see the sunset.
//9 also can see the sunset.
//
//Input : arr[] = {2, 3, 4, 5}
//Output : 4
public class SunfacingBuildingno {

	public static void main(String[] args) {
		int arr[] = {5, 2, 3, 4, 7};
		System.out.println(NoofBuilding(arr));
	}

	public static int NoofBuilding(int[] arr) {
		// TODO Auto-generated method stub
		int n= arr.length;
		int max=arr[0];
		int c=1;
		for(int i=1;i<n;i++) {
			if(max<arr[i]) {
				max=arr[i];
				c++;
			}
		}
		return c;
	}

}
