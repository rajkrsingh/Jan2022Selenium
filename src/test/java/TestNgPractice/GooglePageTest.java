package TestNgPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GooglePageTest extends BaseTest{
	
	@BeforeMethod 
	public void getURL() {
		driver.get("https://www.google.com/");
	}
	
	
	@Test(priority=1)
	public void getTitle() {
		String title=driver.getTitle();
		System.out.println("Google Title:"+title);
		Assert.assertEquals(title,"Google");
		
	}
	
	@Test(priority=2)
		public void verifyLogo() {
		//driver.findElement(By.cssSelector("img[alt='Google']"));
		Assert.assertTrue(driver.findElement(By.cssSelector("img[alt='Google']")).isDisplayed());
		}
	
	

}
