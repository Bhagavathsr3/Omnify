package dataProviders;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

	@DataProvider(name="invalidLoginData")
	public static Object getInvalidLogindata() {
		return new Object[][] {
			{"hello@gmail.com","00000000"},
			{"demoooo@gmail.com","00sdgsag000000"},
			{"gsgggk@gmail.com","jkgakjghg0"},
			{"Dumyyy@gmail.com","jkgakjghg0"}
		};
		
		
	}
}
