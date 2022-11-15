package com.Testng_Advantages;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Eqauls {
	@Test
	public void TC1() {
		Reporter.log("TC1 is running",true);
		String expR="Anky";
		String actR="Anky";
		assertEquals(expR, actR);
	
	}
	}


