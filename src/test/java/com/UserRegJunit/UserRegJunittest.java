package com.UserRegJunit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegJunittest {
	
	private String email;
	private String expectedValue;
	
	public UserRegJunittest(String email, String expectedValue) {
		
		super();
		this.email = email;
		this.expectedValue = expectedValue;
	}
	
	@Before
	public void initialize() {
		UserRegJunit userregjunit = new UserRegJunit();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{"abc-100@yahoo.com", "valid"}, {"abc@yahoo.com", "valid"}, {"abc.100@yahoo.com", "valid"}, 
		{"abc111@abc.com", "valid"}, {"abc-100@abc.net", "valid"}, {"abc.100@abc.com.au", "valid"}, {"abc@1.com", "valid"}, {"abc@gmail.com.com", "valid"}, 
		{"abc+100@gmail.com", "valid"},{"abc", "invalid"},{"abc@.com.my","invalid"},{"abc123@gmail.a","invalid"},{"abc123@.com","invalid"},{"abc123@.com.com","invalid"},{".abc@abc.com","invalid"},
		{"abc()*.com","invalid"},{"abc@%*.com","invalid"},{"abc..2002@gmail.com","invalid"},{"abc.@gmail.com","invalid"},{"abc@abc@gmail.com","invalid"},
		{"abc@gmail.com.1a","invalid"},{"abc@gmail.com.aa.au","invalid"}});
	}	

	@Test
	public void givenSamples_whenExpectedIsTrue_returnTrue() {
		UserRegJunit userregjunit1 = new UserRegJunit();
		
	    assertEquals(expectedValue, userregjunit1.validateEmail(email));
	        
    }
}
