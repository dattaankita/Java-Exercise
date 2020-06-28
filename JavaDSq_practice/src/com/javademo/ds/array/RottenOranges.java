package com.javademo.ds.array;

//Algorithm:
//Create a variable no = 2 and changed = false
//Run a loop until there is no cell of the matrix which is changed in a iteration.
//Run a nested loop and traverse the matrix. If the element of the matrix is equal to no then assign the adjacent elements to no + 1 if the adjacent elements value is equal to 1, i.e. not rotten and update changed to true.
//Traverse the matrix and check if there are any cell which is 1. If 1 is present return -1
//Else return no – 2
public class RottenOranges {
	

	static boolean issafe(int i, int j) 
	{ 
	    if (i >= 0 && i < 3 && j >= 0 && j < 5) 
	        return true; 
	    return false; 
	}
	
	public static int rotorange(int arr[][]) {
		boolean changed = false;
		int no=2;
		while(true){
			for(int i=0;i<3;i++) {
				for(int j=0;j<5;j++) {
					if(arr[i][j] == no ) {
						if(arr[i][j+1] == 1 && issafe(i,j+1)) {
							arr[i][j+1]= 2;
							changed = true;
						}
						if(arr[i][j-1] == 1 && issafe(i,j-1)) {
							arr[i][j-1]= 2;
							changed = true;
						}
						if(arr[i+1][j] == 1 && issafe(i+1,j)) {
							arr[i+1][j]= 2;
							changed = true;
						}
						if(arr[i-1][j] == 1 && issafe(i-1,j)) {
							arr[i-1][j]= 2;
							changed = true;
						}
					}
				}
			}
			if(!changed)
				break;
			changed = false;
			no++;
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(arr[i][j] == 1)
					return -1;
			}
       }
		return no-2;

	}

	public static void main(String[] args) {
		int arr[][] = { { 2, 1, 0, 2, 1 }, 
                		{ 1, 0, 1, 2, 1 }, 
                		{ 1, 0, 0, 2, 1 } };
		if(rotorange(arr) == -1)
			System.out.println("not all rotten");
		else
			System.out.println("all rotten");
		
	}
}
