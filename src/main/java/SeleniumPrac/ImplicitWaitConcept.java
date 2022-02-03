package SeleniumPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	
	public static void main(String[] args) {
		
		//2 types of waits:
		//1.Static wait:Thread.sleep(3000);
		//2.Dynamic wait:
		   //2.1 implicitly wait:dynamic wait:global wait
		  //2.2  explicit wait:
		           //a.WebDriverWait
		           //b.FluentWait
		
		//Implicitly wait:dynamic wait:global wait
		//It will be applied om all the elements by default 
		//when we create the web elements with the help of findelement and findlements then implicit wait will be applied by default
		//default value of implicitly wait is 0
		//it will only applied on webelements but not on non webelements like title,url,alerts
		//if element is not found within the given time :it will throw NoSuchElementException
		//default polling time:500 ms 
		
		
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    //homepage:
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
	    //details page:
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    
	    
	    
	    driver.get("https://demo.opencart.com/index.php?route=account/login"); 
	    
	    driver.findElement(By.id("input-email")); //10sec
	    driver.findElement(By.id("input-password")); //10 sec
	    driver.findElement(By.cssSelector("input[type='submit']")); //10 sec
	    
	    //input[type='submit']
	    
	    
	    
		
	}

}
