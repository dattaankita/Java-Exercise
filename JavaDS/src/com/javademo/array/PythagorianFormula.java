package com.javademo.array;

import java.util.Arrays;

public class PythagorianFormula {
	
	public static boolean PythagorianResult(int arr[]) {
		
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			arr[i] = arr[i] * arr[i];
		}
		Arrays.sort(arr);
		
		for (int i = n-1; i > 2; i--) {
			int l=0;
			int r= i-1;
			if(arr[l] + arr[r] == arr[i])
				return true;
			
			if(arr[l] + arr[r] < arr[i])
				l++;
			else
				r--;
		}
		return false;
	}

	
	
	public static void main(String[] args) {
		
		int arr[] = { 3, 1, 4, 6, 5 }; 
        
        if (PythagorianResult(arr) == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
	}


