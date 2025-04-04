package Tests;

import org.testng.annotations.Test;

import BasePack.Base;

public class ValidLogin extends Base {
	
@Test
	public void ValidDetails_1() throws InterruptedException {
	Thread.sleep(2000);
	
		usersendkeys("//input[@name='username']", "Admin");
		usersendkeys("//input[@name='password']", "admin123");
		userclickAction("//*[text()=' Login ']");
		
		
	}
}
