package com.javademo.threads;

public class YourTask implements Runnable {

	@Override
	public void run() {

		for(int i=1;i<10;i++)
			System.out.println("3. print doc #"+i);
		
		
	}

}
