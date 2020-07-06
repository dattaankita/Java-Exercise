package com.javademo.interviewQuestions;

public class SearchInMatrix {

	public static void main(String[] args) {
		int n = 4, m = 5, x = 8; 
        int mat[][] = {{20, 22, 28, 29, 31},
        		       {0, 6, 8, 9, 11}, 
                       {64, 66, 100, 122, 128},
                       {36, 38, 50, 61, 63}}; 
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(mat[i][j] == x) {
					System.out.println("found ");
					return;
				}
			}
		}
		System.out.println("Not Found");
		
	}
}
