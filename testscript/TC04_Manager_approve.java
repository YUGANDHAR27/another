//package com.automationAspireportal.testscript;
//
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//
//import com.automationAspireportal.helper.EmployeePageHelper;
//import com.automationAspireportal.helper.ManagerLogin;
//import com.automationAspireportal.testsuite.TestsuiteBase;
//import com.automationAspireportal.utils.ReadTimesheetModuleLocators;
//
//public class TC04_Manager_approve extends TestsuiteBase
//{
//	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
//
//	@Test
//	public void managerapprove() throws InterruptedException 
//	{
//		EmployeePageHelper helper=new EmployeePageHelper(driver);
//		helper.employeeHelper();
//
//
//		ManagerLogin login = new ManagerLogin(driver);
//		login.managerlogin();
//		driver.findElement(By.xpath(read.clickoncheckbox())).click();
//		driver.findElement(By.xpath(read.clickonApprove())).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(read.profile())).click();
//		driver.findElement(By.xpath(read.clickonlogout())).click();
//		Thread.sleep(2000);
//
//		
//	}
//
//
//
//
//}
