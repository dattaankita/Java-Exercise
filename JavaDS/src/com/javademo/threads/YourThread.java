package com.javademo.threads;

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

