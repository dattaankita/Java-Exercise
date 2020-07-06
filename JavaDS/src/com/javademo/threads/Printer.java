package com.javademo.threads;

public class Printer {

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
