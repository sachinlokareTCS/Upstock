package com.Test_ng_program;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable {
	@Test(enabled = false)//intentionally we are ignored tc1
	public void TC1() {
		Reporter.log("running tc1",true);
}
	@Test()
	public void TC2() {
		Reporter.log("running tc2",true);
	}


}
