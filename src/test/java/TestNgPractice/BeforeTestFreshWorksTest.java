package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeTestFreshWorksTest {
	
	WebDriver driver;

	@BeforeTest
	public void launchUrl() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
	}

	@Test(priority=2)
	public void getPageTitle() {
		String title=driver.getTitle();
		System.out.println("Page title is:"+title);
		Assert.assertEquals(title,"Freshworks | Modern and Easy Customer and Employee Experience Software");
	}


	@Test(priority=1)
	public void homePageLogo() {
		driver.findElement(By.cssSelector("img[src*='logo-fworks-white.svg']"));
		Assert.assertTrue(true);

	}

	@Test(priority=3)
	public void verifyProductMenu() {
		WebElement products=driver.findElement(By.xpath("//ul[@class='l-nav-list nav-main-menu']//span[contains(text(),'Products')]"));
		String text=products.getText();
		Assert.assertEquals(text,"Products");
	}

	@Test(priority=4)
	public void verifyPlatformMenu() {
		WebElement products=driver.findElement(By.xpath("//ul[@class='l-nav-list nav-main-menu']//span[contains(text(),'Platform')]"));
		String text=products.getText();
		Assert.assertEquals(text,"Platform");

	}

	@Test(priority=5)
	public void verifyCompanyMenu() {
		WebElement products=driver.findElement(By.xpath("//ul[@class='l-nav-list nav-main-menu']//span[contains(text(),'Company')]"));
		String text=products.getText();
		Assert.assertEquals(text,"Company");
	}
	@Test(priority=6)
	public void verifyResourcesMenu() {
		WebElement products=driver.findElement(By.xpath("//ul[@class='l-nav-list nav-main-menu']//span[contains(text(),'Resources')]"));
		String text=products.getText();
		Assert.assertEquals(text,"Resources");
	}	
	@Test(priority=7)
	public void verifyCustomersMenu() {
		WebElement products=driver.findElement(By.xpath("//ul[@class='l-nav-list nav-main-menu']//a[contains(text(),'Customers')]"));
		String text=products.getText();
		Assert.assertEquals(text,"Customers");
	}

	@Test(priority=8)
	public void verifySupportMenu() {
		WebElement products=driver.findElement(By.xpath("//ul[@class='l-nav-list nav-main-menu']//a[contains(text(),'Support')]"));
		String text=products.getText();
		Assert.assertEquals(text,"Support");
	}
	@Test(priority=9)
	public void verifyFooterSocialSection() {
		WebElement footer_social_section=driver.findElement(By.xpath("//div[@class='row']//p[contains(text(),'CONNECT WITH US')]"));
		String text=footer_social_section.getText();
		Assert.assertEquals(text,"CONNECT WITH US");	
	}	
	
	@Test(priority=10)
	public void verifyTermsOfServiceSection() {
		WebElement terms_of_service=driver.findElement(By.cssSelector(".copyrights-nav a[href='/terms/']"));
		String text=terms_of_service.getText();
		//System.out.println(text);
		Assert.assertEquals(text,"Terms of service");	
	}	


@AfterTest
public void closeBrowser() {
	driver.quit();
}



}
