package com.UserRegJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegJunittest {
	@Test
	public void test() {
	       UserRegJunit fnameobj = new UserRegJunit();
	       String S = fnameobj.validateInput("Leena");
	       assertTrue(S == "Valid");
		}

}
