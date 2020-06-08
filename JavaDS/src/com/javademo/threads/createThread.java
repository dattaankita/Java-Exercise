package com.javademo.threads;

public class createThread {

	public static void main(String args[]) {
		
		
		//job 1
		System.out.println("Application started");
		
		
		//job2- threads used here
//		MyTask task= new MyTask();
//		
//		//task.executeTask();
//		task.start();//used thread class
//		
		
		Runnable r= new MyTask();
		Thread task=new Thread(r);
		task.setDaemon(true);
		task.start();
		
		
		new Thread(new YourTask()).start();
		
		
		//job3
		for(int i=1;i<10;i++)
			System.out.println("1. print doc #"+i);
				
		//job 4
		System.out.println("Application stopped");
		
	}
	
}
