package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefException {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	
		driver.get("https://rajqa-trials73.orangehrmlive.com/auth/seamlessLogin");
		By username=By.id("txtUsername");
		
		WebElement ele=driver.findElement(username);
		driver.navigate().refresh();
		ele.sendKeys("admin");
		
		// org.openqa.selenium.StaleElementReferenceException:
		//stale element reference: element is not attached to the page document
		
		
	    //ele=driver.findElement(username);
		//ele.sendKeys("admin");
		
		
	
	}

}
