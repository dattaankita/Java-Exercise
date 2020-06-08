package com.javademo.threads;


//public class MyTask{
//
//	public void executeTask() {
//		
//		for(int i=1;i<10;i++)
//			System.out.println("2. print doc #"+i);
//		
//		
//	}
	
//mytask IS_A thread
//public class MyTask extends Thread{
//        @Override
//		public void run() {
//			
//			for(int i=1;i<10;i++)
//				System.out.println("2. print doc #"+i);
//			
//			
//		}
//	
        
public class MyTask extends CA implements Runnable{
    @Override
	public void run() {
		
		for(int i=1;i<10;i++)
			System.out.println("2. print doc #"+i);
		
		
	}

}
