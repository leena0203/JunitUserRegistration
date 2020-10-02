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
}
