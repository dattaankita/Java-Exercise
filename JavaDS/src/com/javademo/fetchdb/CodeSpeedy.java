package com.javademo.fetchdb;

import java.sql.*;

public class CodeSpeedy {

	public static void main(String[] args) {
		
		try 
		  {     
	       Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "dbusername", "dbpassword");
		   Statement mystatement = con.createStatement();
		   ResultSet codespeedy=mystatement.executeQuery("select * from data where username=\"ironman\"");
		   while(codespeedy.next())
		      {
		          System.out.println(codespeedy.getString("username")+"  "+codespeedy.getString("password")+"  "+codespeedy.getString("name")+" "+codespeedy.getString("email")+" "+codespeedy.getString("country")+" "+codespeedy.getString("age")+" "+codespeedy.getString("sex"));  
		          
		      }
	      
          }catch (Exception e){
     System.out.println(e);
    }
  }



	}


