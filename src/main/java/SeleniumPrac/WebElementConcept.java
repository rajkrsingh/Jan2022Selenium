package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {
	 static WebDriver driver;
	public static void main(String[] args) {
		
		
		//By locator -> OR 
		
		
		//Home page
		By myAccount=By.xpath("//span[contains(text(),'My Account')]");
		By registerLink=By.xpath("//a[contains(text(),'Register')]");
		
		//Register page
		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By eMail=By.id("input-email");
		By telePhone=By.id("input-telephone");
		By passWord=By.id("input-password");
		By confirmPass=By.id("input-confirm");
		By privatePolicy=By.name("agree");
		By continueBtn=By.xpath("//input[@type='submit']");
		
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		//driver.quit();
		
//		driver.findElement(myAccount).click();
//		driver.findElement(registerLink).click();
//		driver.findElement(firstName).sendKeys("Raj");
//		driver.findElement(lastName).sendKeys("QA");
//		driver.findElement(eMail).sendKeys("rajqa@qa.com");
//		driver.findElement(telePhone).sendKeys("9999999999");
//		driver.findElement(passWord).sendKeys("raj123456");
//		driver.findElement(confirmPass).sendKeys("raj123456");
//		driver.findElement(privatePolicy).click();
//		driver.findElement(continueBtn).click();
		
		doClick(myAccount);
		doClick(registerLink);
		doSendKeys(firstName,"Raj");
		doSendKeys(lastName,"QA");
		doSendKeys(eMail,"rajqa@qa.com");
		doSendKeys(telePhone,"9999999999");
		doSendKeys(passWord,"raj123456");
		doSendKeys(confirmPass,"raj123456");
		doClick(privatePolicy);
		doClick(continueBtn);
		

	}
	
	public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
		
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
