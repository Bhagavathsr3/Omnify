package pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePack.Base;

public class AddEmployeePojo extends Base {
public  AddEmployeePojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath ="//input[@name='firstName']" )
WebElement  firstName;
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getMiddleName() {
	return middleName;
}
public WebElement getEmpId() {
	return empId;
}
@FindBy(xpath ="//input[@name='lastName']" )
WebElement lastName;
@FindBy(xpath = "//input[@name='middleName']")
WebElement middleName;
@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
WebElement empId;
}
