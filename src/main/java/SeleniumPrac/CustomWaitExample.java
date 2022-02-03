package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWaitExample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rajqa-trials73.orangehrmlive.com/auth/seamlessLogin");
		
		By username=By.id("txtUsername");
		By password=By.id("txtPassword");
		By loginBtn=By.cssSelector("button[type='submit']");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.retryingElement(username).sendKeys("admin");
		eleUtil.doSendKeys(password, "DF9ZyQb8@t");
		eleUtil.doClick(loginBtn);

	}

}
