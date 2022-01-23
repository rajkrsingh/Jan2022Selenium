package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
	driver.get("http://londonfreelance.org/courses/frames/index.html");
	
	//Object Repository - OR
	
	By title_bar=By.xpath("//h2[contains(text(),'Title bar ')]");
	
//	driver.switchTo().frame("main");
//	
//	WebElement title=driver.findElement(title_bar);
//	String text=title.getText();
//	System.out.println(text);
//	
//	driver.switchTo().defaultContent();
	
	frameHandle(title_bar,"main");

	}
	
	
	 public static void frameHandle(By locator,String name) {
		 
		 driver.switchTo().frame(name);
			
			WebElement title=driver.findElement(locator);
			String text=title.getText();
			System.out.println(text);
			
			driver.switchTo().defaultContent();
	 }
	
	

}
