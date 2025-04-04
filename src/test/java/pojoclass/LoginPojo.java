package pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePack.Base;

public class LoginPojo extends Base{
public LoginPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//input[@name='username']")
WebElement userName;
public WebElement getUserName() {
	return userName;
}
public WebElement getPass() {
	return pass;
}
public WebElement getLoginBtn() {
	return loginBtn;
}

@FindBy(xpath = "//input[@name='password']")
WebElement pass;
@FindBy(xpath ="//*[text()=' Login ']" )
WebElement loginBtn;

}
