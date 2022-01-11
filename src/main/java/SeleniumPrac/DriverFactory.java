package SeleniumPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	 private WebDriver driver;
	/**
	 * This method is used to initializing driver on the basis of browser name 
	 * @param browserName
	 * @return This is returning WebDriver driver;
	 */
	
	public WebDriver init_driver(String browserName) {
		System.out.println("Browser name is "+browserName);
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equals("safari")) {
			driver=new SafariDriver();
		}
		
		else {
			System.out.println("Please pass the correct browser name");
		}
		
		return driver;
		
	}
	
	public void lanchURL(String url) {
		driver.get(url);
	}
	
	public String doGetTitle() {
		return driver.getTitle();
		
	}
	
	public String doGetCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
