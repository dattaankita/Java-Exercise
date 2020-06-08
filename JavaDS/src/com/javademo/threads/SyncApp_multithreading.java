package com.javademo.threads;


class Printer{
	
	//public void printDocs(int numofdocs, String docname) {
	synchronized void printDocs(int numofdocs, String docname) {
				
		for(int i=0;i<numofdocs;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
		}
			System.out.println("printing docs #"+i+" document: "+docname);
	}
  }
}

class MyThread extends Thread{
	Printer pRef;
	
	MyThread(Printer p){
		pRef = p;
	}
	
	@Override
	public void run() {
		synchronized(pRef) {
		pRef.printDocs(10, "Johnsprofile.pdf");
	}
	}
}

class YourThread extends Thread{
	Printer pRef;
	
	YourThread(Printer p){
		pRef = p;
	}
	
	@Override
	public void run() {
		pRef.printDocs(10, "Pionasprofile.pdf");
	}
}

public class SyncApp_multithreading {

	public static void main(String[] args) {
		//job 1
		System.out.println("Application started");
		
		//job2
		Printer prt= new Printer();
		//prt.printDocs(10, "thread statement.pdf");
		
		//job3
		MyThread mref= new MyThread(prt);
		YourThread yref= new YourThread(prt);
		
		mref.start();
//		try {
//			mref.join();
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//	}
//		
		yref.start();
		
		//job 5
		System.out.println("Application stopped");
				
				

	}

}
