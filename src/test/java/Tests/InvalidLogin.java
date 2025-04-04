package Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dataProviders.LoginDataProvider;
import pojoclass.LoginPojo;

public class InvalidLogin extends LoginPojo {
	public LoginPojo lp;
	@BeforeMethod
	public  void intialize() {
		 lp = new LoginPojo();
	}
	
	//@Test
public void Invalid() {
	lp.getUserName().sendKeys("hasfhj");
//	usersendkeys("//*[@id='formBasicEmail']", "demo000@voosh.in");
//	usersendkeys("//*[@id='formBasicPassword']", "admin@demo");
//	userclickAction("(//*[text()='Login'])[2]");
}
	@Test(dataProvider = "invalidLoginData", dataProviderClass = LoginDataProvider.class)
	public void InvalidLoginData(String email, String pass) throws InterruptedException {
		Thread.sleep(2000);
		lp.getUserName().sendKeys(email);
		lp.getPass().sendKeys(pass);
		lp.getLoginBtn().click();
		Thread.sleep(2000);
		lp.getUserName().clear();
		lp.getPass().clear();
	}
}
