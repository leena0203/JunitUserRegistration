package com.UserRegJunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegJunit {
	public boolean matchpattern(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
	}

	// valid first name
	public String validatefname(String s) throws InvalidUserInputException {
		String regex = "(^[A-Z]{1})[a-z]{2,}$";
		if (matchpattern(regex, s))
			return "Valid";
		else
			throw new InvalidUserInputException("Invalid input first name ");
	}

	// valid last name
	public String validatelname(String s) throws InvalidUserInputException {
		String regex = "(^[A-Z]{1})[a-z]{2,}$";
		if (matchpattern(regex, s))
			return "Valid";
		else
			throw new InvalidUserInputException("Invalid input for last name ");
	}

	// valid Mobile format
	public String validateMobileNo(String s) throws InvalidUserInputException {
		String regex = "^([0-9]{2}[ ][0-9]{10})$";
		if (matchpattern(regex, s))
			return "Valid";
		else
			throw new InvalidUserInputException("Invalid input for Phone Number format ");
	}

	// valid Password format
	public String validatePassword(String s) throws InvalidUserInputException {
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%#*?&])[A-Za-z\\d@#$!%*?&]{8,}$";
		if (matchpattern(regex, s))
			return "Valid";
		else
			throw new InvalidUserInputException("Invalid input for Password ");
	}

	// valid emailId
	public String validateEmail(String s) throws InvalidUserInputException {
		String regex = "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$";
		if (matchpattern(regex, s))
			return "Valid";
		else
			throw new InvalidUserInputException("Invalid input for last name ");
	}

	public static void main(String[] args) {

		UserRegJunit userregjunitobj = new UserRegJunit();
		Scanner sc = new Scanner(System.in);
		String fname = sc.nextLine();
		try {
			System.out.println("First Name " + fname + " is: " + userregjunitobj.validatefname(fname));
		} catch (InvalidUserInputException e) {
			e.printStackTrace();
		}

		String lname = sc.nextLine();
		try {
			System.out.println("LastName " + lname + " is: " + userregjunitobj.validatelname(lname));
		} catch (InvalidUserInputException e) {
			e.printStackTrace();
		}
		String number = sc.nextLine();
		try {
			System.out.println("Mobile Format " + number + " is: " + userregjunitobj.validateMobileNo(number));
		} catch (InvalidUserInputException e) {
			e.printStackTrace();
		}
		String password = sc.nextLine();
		try {
			System.out.println("Password " + password + " is: " + userregjunitobj.validatePassword(password));
		} catch (InvalidUserInputException e) {
			e.printStackTrace();
		}

		String[] multipleEmail;
		multipleEmail = new String[] { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc",
				"abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*.com",
				"abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a",
				"abc@gmail.com.aa.au" };
		for (int i = 0; i < multipleEmail.length; i++) {
			try {
				System.out.println(
						"EmailId " + multipleEmail[i] + " is: " + userregjunitobj.validateEmail(multipleEmail[i]));
			} catch (InvalidUserInputException e) {
				e.printStackTrace();
			}
		}
	}

}
