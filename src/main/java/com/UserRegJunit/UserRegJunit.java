package com.UserRegJunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegJunit {
		public String validateInput(String s) {
		   	  String regex = "^[A-Z]*[A-Za-z]{3,25}$";
		      Pattern pattern = Pattern.compile(regex);
		   	  Matcher matcher = pattern.matcher(s);
		   	  if(matcher.find()) {
		   		   return "Valid";
		   	  }
		   	  else {
		   		  return "Invaild";
		     }
		     }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine();
		        UserRegJunit fnameobj = new UserRegJunit();	
				System.out.println("Inuput is:" +fnameobj.validateInput(input) );
			}        
	    }


