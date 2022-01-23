package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		//Object Repository:
		
		By fName=By.id("input-firstname");
		By lName=By.id("input-lastname");
		By eMail=By.id("input-email");
		By telephone=By.id("input-telephone");
		By password=By.id("input-password");
		By confirmPassword=By.id("input-confirm");
		By privacyPolicy=By.name("agree");
		By continue_Btn=By.xpath("//input[@type='submit']");
		By success_continue_Btn=By.xpath("//div[@class='buttons']//a[contains(text(),Continue)]");
		
		//Actions action=new Actions(driver);
		
//		action.sendKeys(driver.findElement(fName), "Raj").perform();
//        action.sendKeys(driver.findElement(lName), "Kumar").perform();
//        action.sendKeys(driver.findElement(eMail), "rajksingh@gmail.com").perform();
//        action.sendKeys(driver.findElement(telephone), "9999999999").perform();
//        action.sendKeys(driver.findElement(password),"raj@123456").perform();
//        action.sendKeys(driver.findElement(confirmPassword),"raj@123456").perform();
//        action.click(driver.findElement(privacyPolicy)).perform();
//        action.click(driver.findElement(continue_Btn)).perform();
//        action.click(driver.findElement(success_continue_Btn)).perform();
        
        doActionsSendKeys(fName,"Raj");
        doActionsSendKeys(lName,"Singh");
        doActionsSendKeys(eMail,"rajqa123@qa.com");
        doActionsClick(continue_Btn);
        
	}
	
	  public static void doActionsSendKeys(By locator,String value) {
		  Actions action=new Actions(driver);
		  action.sendKeys(driver.findElement(locator),value).perform();
		  
	  }
	  
	  public static void doActionsClick(By locator) {
		  Actions action=new Actions(driver);
		  action.click(driver.findElement(locator)).perform();
	  }

}
