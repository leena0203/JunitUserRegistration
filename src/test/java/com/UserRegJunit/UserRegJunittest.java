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
	       String input1 = userregjunitobj.validateEmail("abc.ghy@bl.co.jaddg");
	       assertTrue(input1 == "Valid");
	       String input2 = userregjunitobj.validateEmail("leenasaorde55467@vo.bl.com");
	       assertTrue(input2 == "Invalid"); 
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
	       String input1 = userregjunitobj.validatePassword("Sbreton92");
	       assertTrue(input1 == "Valid");
	       String input2 = userregjunitobj.validatePassword("Smnt@yti5");
	       assertTrue(input2 == "Invalid"); 
		}
}
