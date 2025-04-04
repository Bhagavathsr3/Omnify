package Tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dataProviders.AddEmployeeDataProvider;
import pojoclass.AddEmployeePojo;

public class AddEmployee extends AddEmployeePojo {
public static List <String> empId = new ArrayList<>();
	public AddEmployeePojo ep;
	@BeforeMethod
	public void initialize() {
		ep = new AddEmployeePojo();
	}
	@Test(priority = 1)
	public void addEmpNavigation() throws InterruptedException {
		Thread.sleep(2000);
		userclickAction("//*[text()='PIM']");//click pim tab
		Thread.sleep(2000);
		userclickAction("//*[text()='Add Employee']");
	}
	@Test(dataProvider = "employeeDetails", dataProviderClass = AddEmployeeDataProvider.class, priority = 2)
	public void fillEmpDetails(String firstName, String middleName, String lastName,String empid) throws InterruptedException {
		Thread.sleep(2000);
		//WebElement emid = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		
     Actions a = new Actions(driver);
		a.click(ep.getEmpId()).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		ep.getFirstName().sendKeys(firstName);
		ep.getMiddleName().sendKeys(middleName);
		ep.getLastName().sendKeys(lastName);
		Thread.sleep(2000);	
		

		ep.getEmpId().sendKeys(empid);		
		
		Thread.sleep(2000);
	    userclickAction("//button[text()=' Save ']");
		System.out.println(" Saved Employee Details :"+ firstName+" " + middleName+" " + lastName+" " + empid);
		Thread.sleep(2000);
		userclickAction("//*[text()='Add Employee']");
		
	empId.add(empid);
	
	}
	
		
	}

