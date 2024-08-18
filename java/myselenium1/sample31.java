package myselenium1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample31 {
	@Test
	public void m4() {
		Reporter.log("running m4",true);
	}
	@Test(timeOut = 2000)
	public void m5() throws InterruptedException {
		Thread.sleep(3000);
		Reporter.log("running m5",true);
	 
	}
	@Test(dependsOnMethods = {"m4","m5"})
	public void m6() {
		Reporter.log("running m6",true);

		
	}

}
