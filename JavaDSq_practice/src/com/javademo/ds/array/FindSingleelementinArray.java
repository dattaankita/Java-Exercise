package com.javademo.ds.array;

//Let us consider the above example.  
//Let ^ be xor operator as in C and C++.
//
//res = 7 ^ 3 ^ 5 ^ 4 ^ 5 ^ 3 ^ 4
//
//Since XOR is associative and commutative, above 
//expression can be written as:
//res = 7 ^ (3 ^ 3) ^ (4 ^ 4) ^ (5 ^ 5)  
//    = 7 ^ 0 ^ 0 ^ 0
//    = 7 ^ 0
//    = 7

public class FindSingleelementinArray {

	public static void main(String[] args) {
		int arr[] = {7 , 3 , 5 , 4,  5 , 3 ,4};
		int res=arr[0];
		for (int i=1  ;i<arr.length;i++) {
			 res= (res ^ arr[i]);
		}
		System.out.println(res);
	}

}
