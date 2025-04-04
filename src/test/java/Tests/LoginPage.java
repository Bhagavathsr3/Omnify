package Tests;

import org.testng.annotations.Test;

import BasePack.Base;

public class LoginPage extends Base {
	@Test(priority = 1)
	public void verifyUrl() {
		Launcher();//Method to launch browser
		launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WindowMaximize();
	}
	
@Test(priority=2)
	public void urlResponseTime() {
		//Launcher();
		PageLoadtime("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//Method to check url response time
	}
	
}
