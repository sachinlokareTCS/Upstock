package com.Assert_class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Fail {

	@Test
	public void TC1() {
		Reporter.log("running tc1");
	}
	@Test
	public void TC2() {
		Reporter.log("running tc1");
		Assert.fail();;
	}

}

