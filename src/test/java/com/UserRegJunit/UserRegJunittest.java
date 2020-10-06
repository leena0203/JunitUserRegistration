package com.UserRegJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class UserRegJunittest {
	private static UserRegJunit userRegJunit;
	
	@BeforeAll
	static void initiate() {
		userRegJunit = new UserRegJunit();
	}

	//Test methods for first name
	@ParameterizedTest
	@ValueSource(strings = {"Leena", "Mitali", "Akshay", "Manali"})
	public void firstName_ifValid_shouldReturnValid(String validFirstNames) {
		try {
			assertEquals("Valid", userRegJunit.validateFname.validate(validFirstNames));
		}
		catch(InvalidUserInputException exception) {
			System.out.println(exception);
		}
	}
	
	@ParameterizedTest
	@ValueSource(strings = {" ", "leena" , " 123efrt", ""})
	public void firstName_ifInvalid_shouldReturnInvalid(String invalidFirstNames) {
		UserRegJunit object1 = new UserRegJunit();
        Assertions.assertThrows(InvalidUserInputException.class,() -> {
        	object1.validateFname.validate(invalidFirstNames);
		});
		
	}
	
	//Test methods for last name
	@ParameterizedTest
	@ValueSource(strings = {"Sarode", "Jadhav", "Jain", "Dev"})
	public void lastName_ifValid_shouldReturnValid(String validLastNames) {
		try {
			assertEquals("Valid", userRegJunit.validateLname.validate(validLastNames));
		}
		catch(InvalidUserInputException exception) {
			System.out.println(exception);
		}
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Pa_til", "da1dhav", " ", "12@_"})
	public void lastName_ifInvalid_shouldReturnInvalid(String invalidLastNames) {
		UserRegJunit object1 = new UserRegJunit();
        Assertions.assertThrows(InvalidUserInputException.class,() -> {
        	object1.validateLname.validate(invalidLastNames);		
        	});
		
	}
	
	//Test methods for mobile
	@ParameterizedTest
	@ValueSource(strings = {"91 9865326598", "45 9547321098", "00 7564839210"})
	public void mobile_ifValid_shouldReturnValid(String validMobile) {
		try {
			assertEquals("Valid", userRegJunit.validatePhoneNo.validate(validMobile));
		}
		catch(InvalidUserInputException exception) {
			System.out.println(exception);
		}
	}

	@ParameterizedTest
	@ValueSource(strings = {"45 67589@98_", "443 986532659898"})
	public void mobile_ifInvalid_shouldReturnInvalid(String invalidMobile) {
		UserRegJunit object1 = new UserRegJunit();
        Assertions.assertThrows(InvalidUserInputException.class,() -> {
        	object1.validatePhoneNo.validate(invalidMobile);
		});
			}
	
	
	//Test methods for password
	@ParameterizedTest
	@ValueSource(strings = {"Svgth_@123", "123@345kjddA"})
	public void password_ifValid_shouldReturnValid(String validPasswords) {
		try {
			assertEquals("Valid", userRegJunit.validatePassword.validate(validPasswords));
		}
		catch(InvalidUserInputException e) {
			System.out.println(e);
		}
	}

	@ParameterizedTest
	@ValueSource(strings = {"Abc@12", "ab-abab254"})
	public void password_ifInvalid_shouldReturnInvalid(String invalidPasswords) {
			UserRegJunit object1 = new UserRegJunit();
	        Assertions.assertThrows(InvalidUserInputException.class,() -> {
	        	object1.validatePassword.validate(invalidPasswords);
		});
		
	}

	//Test methods for email
	@ParameterizedTest
	@ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
			"abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"})
	public void email_ifValid_shouldReturnValid(String validEmails) {
		try {
			assertEquals("Valid", userRegJunit.validateEmail.validate(validEmails));
		}
		catch(InvalidUserInputException e) {
			System.out.println(e);
		}
	}
	
	
	@ParameterizedTest
	@ValueSource(strings = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*.com", "abc@%*.com", 
			"abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"})
	public void email_ifInvalid_shouldReturnInvalid(String invalidEmails) {
		UserRegJunit object1 = new UserRegJunit();
        Assertions.assertThrows(InvalidUserInputException.class,() -> {
        	object1.validateEmail.validate(invalidEmails);
		});
	}
	
}
