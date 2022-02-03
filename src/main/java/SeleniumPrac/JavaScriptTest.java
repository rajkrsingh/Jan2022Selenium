package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rajqa-trials73.orangehrmlive.com/auth/seamlessLogin");
		
		By username=By.id("txtUsername");
		By password=By.id("txtPassword");
		By loginBtn=By.cssSelector("button[type='submit']");
		
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		jsUtil.flash(driver.findElement(username));
		driver.findElement(username).sendKeys("admin");
		
		jsUtil.flash(driver.findElement(password));
		driver.findElement(password).sendKeys("DF9ZyQb8@t");
		
		jsUtil.flash(driver.findElement(loginBtn));
		driver.findElement(loginBtn).click();
	}

}
