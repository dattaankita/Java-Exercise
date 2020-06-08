package com.javademo.linkedlist;

import java.util.Scanner;

import com.javademo.linkedlist.Node;

public class Node {
	  Node previousNode, nextNode;
	  int value;

//	  public Node getLastNode() {
//		return nextNode;
//	    // traverse nextNode till it is null.. return the Node before.
//	  }
//	  
	  private int getUserInput() {
		  int result = -1;
		  Scanner userInput= new Scanner(System.in);
		  while ( result < 0) {
		    result = userInput.nextInt();
		  }
		  return result;
		}
		
}
