package com.Assert_class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_True {
	@Test
	public void TC4() {
		Reporter.log("Running tc4",true);
		boolean actR=false;
		Assert.assertTrue(actR);//TC is pass
	}


}
