package SeleniumPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
	//static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		 //WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","/Users/shambhu892/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		//System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//driver.close();
		//System.out.println(driver.getTitle()); //NoSuchSessionException: invalid session id

		driver.quit();
	    System.out.println(driver.getTitle());
	}

}
