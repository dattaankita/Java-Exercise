package com.javademo.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;



public class SetDemo {
	
	static void InsertionSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
  
    static void printArray(int arr[]) /* A utility function to print array of size n*/
   
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
	public static void main(String args[]) 
    { 
        int arr[] = { 12, 11, 13, 5, 6 }; 
  
        InsertionSort(arr); 
        printArray(arr); 
    }
}

//	public static void main(String[] args) {
//		
//		HashSet<String> list1= new HashSet<String>();
//		
//		//TreeSet<String> list1= new TreeSet<String>();
//		
//		
//		
//		
//		//1.add element
//		list1.add("abc");
//		list1.add("sde");
//		list1.add("abc");
//		list1.add("huy");
//		list1.add("vgf");
//		list1.add("nkg");
//		list1.add("koi");
//		list1.add("sde");
//		
//		//2.print elemrnts
//		
//		System.out.println(list1);
//		
//		
//		
//		
//		System.out.println("iterating the data using iterator");
//		
//		Iterator<String> itr= list1.iterator();
//		
//		while(itr.hasNext()) {
//			String str = itr.next();
//			System.out.println(str);
//			
//		}
//		
//		list1.remove("nkg");
//	}
//}
	
	
	    /*Function to sort array using insertion sort*/
	    
	    
