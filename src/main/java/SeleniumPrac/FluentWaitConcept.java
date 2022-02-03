package SeleniumPrac;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	public static void main(String[] args) {
		
		//WebDriverWait(class)->extends->FluentWait(class)-->implementing->Wait(Interface)
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rajqa-trials73.orangehrmlive.com/auth/seamlessLogin");
		
		By username=By.id("txtUsername");
		By password=By.id("txtPassword");
		By loginBtn=By.cssSelector("button[type='submit']");
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				                .withTimeout(Duration.ofSeconds(10)) 
		                        .pollingEvery(Duration.ofSeconds(2)) //polling means total number of attempts in every 2 seconds
		                        .ignoring(NoSuchElementException.class)
		                        .ignoring(StaleElementReferenceException.class);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(username)).sendKeys("admin");
		

	}

}
