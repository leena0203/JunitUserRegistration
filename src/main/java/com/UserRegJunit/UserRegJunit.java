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
				System.out.println("First Name " +fname+" is: "+ userregjunitobj.validatefname(fname));
				String lname = sc.nextLine();
				System.out.println("LastName "+lname+" is: "+ userregjunitobj.validatelname(lname));
				String email = sc.nextLine();
				System.out.println("EmailId "+email+" is: "+ userregjunitobj.validateEmail(email));
				String number = sc.nextLine();
				System.out.println("Mobile Format "+number+" is: "+ userregjunitobj.validateMobileNo(number));
				String password = sc.nextLine();
				System.out.println("Password "+password+" is: "+ userregjunitobj.validatePassword(password));
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
			public String validatefname(String s) {                  // valid first name
		    	  String regex = "(^[A-Z]{1})[a-z]{2,}$";
		    	  return matchpattern(regex, s);
		    }
			public String validatelname(String s) {                 // valid last name
		    	  String regex = "(^[A-Z]{1})[a-z]{2,}$";
		    	  return matchpattern(regex, s);
		    }
			public String validateEmail(String s) {                 // valid emailId
		    	  String regex = "^[a-z]+[.|+_-]?[a-z0-9]+[@][a-z0-9]{1,}[.][a-z]{2,}[.]{0,1}[a-z]*$";
		    	  return matchpattern(regex, s);
		    }
			public String validateMobileNo(String s) {                 // valid Mobile format
		    	  String regex = "^([0-9]{2}[ ][0-9]{10})$";
		    	  return matchpattern(regex, s);
		    }
			public String validatePassword(String s) {                 // valid Password format
		    	  String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%#*?&])[A-Za-z\\d@#$!%*?&]{8,}$";
		    	  return matchpattern(regex, s);
		    }
}
