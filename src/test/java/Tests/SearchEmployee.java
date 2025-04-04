package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BasePack.Base;

public class SearchEmployee extends Base{
	
	AddEmployee ad = new AddEmployee();
	
	@Test
public void verifyEmployee() throws InterruptedException {
		
		Thread.sleep(3000);
        userclickAction("//*[text()='Employee List']");
    	 
    List<String> empId =AddEmployee.empId;
    for(String empid : empId) {
    	
    	
    	Thread.sleep(2000);
    	WebElement searchid = driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]"));
    	
    	Actions a = new Actions(driver);
    	a.click(searchid).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();		
    	
//    	searchid.sendKeys(Keys.CONTROL + "a");
//    	searchid.sendKeys(Keys.DELETE); 	
    	Thread.sleep(2000);
    	System.out.println("pass value"+empid);
    	searchid.sendKeys(empid);
    	
    	Thread.sleep(3000);
  userclickAction("//*[text()=' Search ']");
   
    scrollbtm();
   // scroll("//*[contains(text(),'EMP_001')]");
    Thread.sleep(2000);
   boolean isEmployeeFound = driver.findElements(By.xpath("//*[contains(text(),'"+empid+"')]")).size()>0;
   
    if(isEmployeeFound) {
    	System.out.println("Employee Found "+ empid);
    	}
    	else {
    		System.out.println("Employee Not Found:" + empid);
    	}
    scrolltop();
    Thread.sleep(2000);
    userclickAction("//button[text()=' Reset ']");//Reset button
    
    }
    }
    
   
	}

