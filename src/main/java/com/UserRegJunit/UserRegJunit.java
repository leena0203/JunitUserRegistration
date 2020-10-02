package com.UserRegJunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegJunit {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				UserRegJunit userregjunitobj = new UserRegJunit();	
				Scanner sc = new Scanner(System.in);
				String fname = sc.nextLine();
				System.out.println("First Name " +fname+" is: "+ userregjunitobj.validatefname(fname) );
				String lname = sc.nextLine();
				System.out.println("LastName "+lname+" is "+ userregjunitobj.validatelname(lname) );
			}   
			public String matchpattern(String regex, String input) {
		    	  Pattern pattern = Pattern.compile(regex);
		    	  Matcher matcher = pattern.matcher(input);
		    	  if(matcher.find()) {
		    		  return "Valid" ;
		    	  }
		    	  else {
		    	       return "Invalid";
		          }
		      }
			public String validatefname(String s) {
		    	  String regex = "(^[A-Z]{1})[a-z]{2,}$";
		    	  return matchpattern(regex, s);
		    }
			public String validatelname(String s) {
		    	  String regex = "(^[A-Z]{1})[a-z]{2,}$";
		    	  return matchpattern(regex, s);
			
		    }
			
}
