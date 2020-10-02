package com.UserRegJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegJunittest {
	@Test
	public void fname() {
	       UserRegJunit userregjunitobj = new UserRegJunit();
	       String input1 = userregjunitobj.validatefname("Leena");
	       assertTrue(input1 == "Valid");
	       String input2 = userregjunitobj.validatelname("nikita");
	       assertTrue(input2 == "Invalid");
		}
	@Test
	public void lname() {
	       UserRegJunit userregjunitobj = new UserRegJunit();
	       String input1 = userregjunitobj.validatelname("Sarode");
	       assertTrue(input1 == "Valid");
	       String input2 = userregjunitobj.validatelname("s123ro");
	       assertTrue(input2 == "Invalid"); 
		}	 
	@Test
	public void email() {
	       UserRegJunit userregjunitobj = new UserRegJunit();
	       String input1 = userregjunitobj.validateEmail("abc@yahoo.com");
	       assertTrue(input1 == "Valid");
	       String input2 = userregjunitobj.validateEmail("abc-100@yahoo.com");
	       assertTrue(input2 == "Valid");
	       String input3 = userregjunitobj.validateEmail("abc-100@abc.net");
	       assertTrue(input3 == "Valid");
	       String input4 = userregjunitobj.validateEmail("abc111@abc.com");
	       assertTrue(input4 == "Valid");
	       String input5 = userregjunitobj.validateEmail("abc+100@gmail.com");
	       assertTrue(input5 == "Valid");
	       String input6 = userregjunitobj.validateEmail("abc123@.com");
	       assertTrue(input6 == "Invalid");
	       String input7 = userregjunitobj.validateEmail("abc@%*.com");
	       assertTrue(input7 == "Invalid");
	       String input8 = userregjunitobj.validateEmail("abc@gmail.com.aa.au");
	       assertTrue(input8 == "Invalid");
		}	
	@Test
	public void number() {
	       UserRegJunit userregjunitobj = new UserRegJunit();
	       String input1 = userregjunitobj.validateMobileNo("12 8796543015");
	       assertTrue(input1 == "Valid");
	       String input2 = userregjunitobj.validateMobileNo("912 567483920");
	       assertTrue(input2 == "Invalid"); 
		}
	@Test
	public void Password() {
	       UserRegJunit userregjunitobj = new UserRegJunit();
	       String input1 = userregjunitobj.validatePassword("Sbret#on6");
	       assertTrue(input1 == "Valid");
	       String input2 = userregjunitobj.validatePassword("omnt#yti5");
	       assertTrue(input2 == "Invalid"); 
		}
}
