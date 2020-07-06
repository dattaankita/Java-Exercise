package com.javademo.interviewQuestions;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class TimeFormat {

	public static void main(String args[]) throws ParseException{
			 Scanner input = new Scanner(System.in);
			 System.out.print("Enter first time (hh:mm:ss): ");
			 String time = input.nextLine();
			 System.out.println();
			 System.out.print("Enter second time (hh:mm:ss): ");
			 String time2 = input.nextLine();
			 System.out.println();
			 DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			 Date d1 = sdf.parse(time);
			 Date d2 = sdf.parse(time2);

			 System.out.println("Time: " + sdf.format(d1));
			 System.out.println("Time: " + sdf.format(d2));
			    if(d1.after(d2)){
			     long diffMs = d1.getTime() - d2.getTime();
			     long diffSec = diffMs / 1000;
			     long hr= diffSec/3600;
			     long sec=diffSec%3600;
			     long min= sec/60;
			     sec= sec%60;
			     System.out.println("The difference is "+hr+" hours "+min+" minutes and "+sec+" seconds.");
			    }

			    
			 }
			}