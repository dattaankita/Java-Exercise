package com.javademo.ds.array;

//ab: Number of insertions required is 1 i.e. bab
//aa: Number of insertions required is 0 i.e. aa
//abcd: Number of insertions required is 3 i.e. dcbabcd
//abcda: Number of insertions required is 2 i.e. adcbcda which is same as number of insertions in the substring bcd(Why?).
//abcde: Number of insertions required is 4 i.e. edcbabcde
public class FindNoOfInsertionTomakePalindrome {

	public static void main(String[] args) {
		String s= "geeks";
		System.out.println(NoOfInsertion(s.toCharArray(), 0, s.length() - 1));

	}

	public static int NoOfInsertion(char[] arr, int i, int j) {
		if(i>j)
			return Integer.MAX_VALUE;
		if(i == j)
			return 0;
		if(i == j-1)
			return(arr[i] == arr[j] ? 0 : 1);
		
		return (arr[i] == arr[j]?NoOfInsertion(arr,i+1,j-1):Integer.min(NoOfInsertion(arr,i,j-1), NoOfInsertion(arr,i+1,j))+ 1);
	}

}
