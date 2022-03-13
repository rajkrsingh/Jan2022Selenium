package TestNgPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FreshworksPageTest extends BaseTest{
	
	@BeforeClass
	public void launchURL() {
		driver.get("https://www.freshworks.com/");
	}
	
	@Test(priority=1)
	public void getTitle() {
		String title=driver.getTitle();
		Assert.assertEquals(title,"Freshworks | Modern and Easy Customer and Employee Experience Software");
	}
	
	@Test(priority=2)
	public void verifyContanctSalesBtn() {
		
		Assert.assertTrue(driver.findElement(By.cssSelector(".contact-sales-wrapper>a")).isDisplayed());
	}

}
