package com.javademo.threads;

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

