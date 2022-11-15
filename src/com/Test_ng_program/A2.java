package com.Test_ng_program;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class A2 {

	@Test
	public void TC4() {
		Reporter.log("running tc4",true);
	}
		@Test
	public void TC5() {
		Reporter.log("running tc5",true);
	Assert.fail();
	}
		@Test
	public void TC6() {
		Reporter.log("running tc6",true);
	}


}
