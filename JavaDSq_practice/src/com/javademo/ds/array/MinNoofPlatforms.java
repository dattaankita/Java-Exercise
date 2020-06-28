package com.javademo.ds.array;

import java.sql.Time;

//Minimum Number of Platforms Required for a Railway/Bus Station
//Given arrival and departure times of all trains that reach a railway station, the task is to find the minimum number of platforms required for the railway station so that no train waits.
//We are given two arrays which represent arrival and departure times of trains that stop.
//
//Examples:
//
//Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
//dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
//Output: 3
//Algorithm:
//Run two nested loops the outer loop from start to end and inner loop from i+1 to end.
//For every iteration of outer loop find the count of intervals that intersect with the current interval.
//Update the answer with maximum count of overlap in each iteration of outer loop.
//Print the answer.
public class MinNoofPlatforms {

	public static void main(String[] args) {
//		int arv[] = {900, 940, 950, 1100, 1500, 1800};
//		int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
		int arv[]={900, 940};
		int dep[] = {910, 1200};
		int n= arv.length/dep.length;
		System.out.println(Minplatform(arv,dep,n));
	}

	public static int Minplatform(int[] arv, int[] dep, int n) {
		int plat_need= 1, res=1;
		int i=1, j=0;
		while(i < arv.length) {
			if(arv[i] < dep[j]) {
				plat_need++;
				i++;
				if(res < plat_need)
					res=plat_need;
			}else {
				plat_need--;
				j++;
			}
		}
		return res;
	 }
	}		
