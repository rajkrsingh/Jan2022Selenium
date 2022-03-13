package TestNgPractice;

import org.testng.annotations.Test;

public class DependsOnMethodConceptTest {

	
	@Test(priority=1)
	public void loginTest() {
		System.out.println("Login page test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void registrationPageTest() {
		System.out.println("Registration page test");
	}
}
