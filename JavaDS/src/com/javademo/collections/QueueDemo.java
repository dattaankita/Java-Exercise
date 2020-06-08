package com.javademo.collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		
		for(int i = 10; i > 0; i--) {
			que.add(i);
		}
		
		System.out.println(que);
		
		//expected o/p:(front)10,9,8,7,6,5,4,3,2,1(rear)
		
		//actual o/p:(front)1,2,3,4,5,6,7,8,9,10(rear)
		
		System.out.println(que.peek());
		System.out.println(que.size());
		que.poll();
		
		System.out.println(que.peek());
		System.out.println(que.size());
		
		
	}
}
