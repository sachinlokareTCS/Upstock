package com.Testng_Advantages;

import static org.testng.Assert.assertNotEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Not_Equals {
	@Test
	public void TC1() {
		Reporter.log("TC1 is running",true);
		String expR="Anky";
		String actR="Ankuyy";
		assertNotEquals(expR, actR);

	}
}
