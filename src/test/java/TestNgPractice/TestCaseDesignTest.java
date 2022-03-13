package TestNgPractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseDesignTest {

	//Global Preconditions
	//Precondition
	//Test Steps(Test case)+ Expected Vs Actual result
	//Post Steps
	//Status - Pass/Fail/Skip
	//Report
	
	
	/*
	 
	 Before Suite->>Connect with DB
     Before Test-->Create a sample user in DB
     Before class->Launch the browser and application
     Before Method-->>Login to Application
     Check user Info Test
     After Method---Logout
     
     Before Method-->>Login to Application
            Home page title test
     After Method---Logout
     Before Method-->>Login to Application
           Home page search Test
     After Method---Logout
     After Class ->>Close the browser
	 */

	@BeforeSuite
	public void beforeSuitTest() {

		System.out.println("Before Suite->>Connect with DB");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test-->Create a sample user in DB");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("Before class->Launch the browser and application");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method-->>Login to Application");
	}

	@Test(priority=2)
	public void homePageTitleTest() {

		System.out.println("Home page title test");
		Assert.assertEquals("Google", "Google");
	}
	@Test(priority=1)
	public void checkUserInfoTest() {
		System.out.println("Check user Info Test");
		Assert.assertEquals("admin", "admin");
	}

	@Test(priority=3)
	public void homepageSearchTest() {
		System.out.println("Home page search Test");
		Assert.assertTrue(true);
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method---Logout");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class ->>Close the browser");
	} 
	@AfterTest
	public void afterTest() {
		System.out.println("After Test --> Delete the user in DB");
	}
	
	@AfterSuite
	public void afterSuite() {

		System.out.println("After Suite->Disconnect from DB");
	}



}
