package com.javademo.collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list1= new LinkedList<String>();
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			String st= sc.next();
			list1.add(st);
		}
		System.out.println(list1);
		for(int i = n-1 ; i >= 0 ;  i--)
			System.out.println(list1.get(i));
		

	}

}
