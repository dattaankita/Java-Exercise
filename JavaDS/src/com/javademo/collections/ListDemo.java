package com.javademo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;



public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list1= new ArrayList<String>();//type specific
		
		ArrayList list2= new ArrayList();
		
		//same for linkedlist & Vector
		
		//1.add element
		list1.add("abc");
		list1.add("sde");
		list1.add("qwe");
		list1.add("zxc");
		list1.add("ASD");
		
//		Student s= new Student();
//		s.roll= 21;
//		s.name= "Mickey";

		list2.add("abc");
		list2.add(22);
		list2.add(3.5);
		list2.add("ABC");
		//list2.add(s);
		
		//2.print elemrnts
		
		System.out.println(list1);
		System.out.println(list2);
		
		//3.Get elemrnts
		String name= list1.get(2);
		System.out.println("data is" +name);
		
		Object o=list2.get(2);
		System.out.println("o is" +o);  
		
		//4. Update elemrnts
		list1.set(2, "piona");
		System.out.println(list1);
		
		//5. Remove elemrnts
		list1.remove(2);
		System.out.println(list1);
		
		
		//6.Remove all elemrnts
		//list1.clear();
		
		//7. check elemrnts
		if(list1.contains("abc")) {
			System.out.println("present in array");
		}
		
		//iterate in arraylist
		System.out.println("iterating the data");
		
		for(String str : list1)
			System.out.println(str);
	
	
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("iterating the data using iterator");
		
		Iterator<String> itr= list1.iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			if(str.equals("Jack")) {
				itr.remove();
			}
		}
		
//		LinkedList<String> list=new LinkedList<String>();
//        Scanner input=new Scanner(System.in);
//        System.out.print("how many elemenst do you want to add: ");
//        int num=input.nextInt();
//        for(int i=0;i<num;i++){
//            System.out.print("Add Element: ");
//            String element=input.next();
//            list.add(element);
//        }
//        System.out.println();
//        System.out.println("LinkedList elements are: ");
//        for(int i=0;i<list.size();i++){
//         System.out.println(list.get(i));
//        }
	}
}
