package com.javademo.hashing;

public class basic01 {

	public static void main(String[] args) {
		System.out.println(sascii("ABCDE", 16));
		System.out.println(smod(900, 16));
	}
	
	static int sascii(String x, int y) {
		char ch[];
		ch= x.toCharArray();
		int s=0;
		for(int i=0;i<x.length();i++) {
			s += ch[i];		}
		return s%y;
		
	}
	
	static int smod(int x, int y) {
		return x%y;
	}

}
