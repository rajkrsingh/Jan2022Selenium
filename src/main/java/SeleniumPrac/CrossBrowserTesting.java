package SeleniumPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {
	static WebDriver driver=null;	

	public static void main(String[] args) {
		String str="safari";
		switch(str) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver","/Users/shambhu892/downloads/chromedriver");  
			driver=new ChromeDriver();
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver","/Users/shambhu892/downloads/geckodriver");
			driver= new FirefoxDriver();
			
		case "safari":
			driver=new SafariDriver();
			driver.get("http://google.com");
			
		}
		driver.quit();	
	}
	

}
