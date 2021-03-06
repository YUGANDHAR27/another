package com.automationAspireportal.testscript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeePageHelper;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC05_Action_reject extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void manageractionreject() throws InterruptedException {

		EmployeePageHelper helper=new EmployeePageHelper(driver);
		helper.employeeHelper();

		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(read.rejectaction())).click();
		Thread.sleep(5000);	
		WebElement textareacomment=driver.findElement(By.xpath(read.clickontextarea()));
		textareacomment.click();
		textareacomment.sendKeys("Do well");
		driver.findElement(By.xpath(read.popupreject())).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);


	}




}
