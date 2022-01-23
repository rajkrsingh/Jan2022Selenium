package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country=By.id("Form_submitForm_Country");
		//WebElement selectCountry=driver.findElement(country);
		//Select select1=new Select(selectCountry);
		//select1.selectByIndex(16);
		//select1.selectByVisibleText("India"); //Best approach among 3 select
		//select1.selectByValue("Algeria");
		
		
		
		 doSelectFromDropDownVisibleText(country,"India");
		//doSelectFromDropDownByIndex(country,5);
		
		//doSelectFromDropDownByValue(country,"Algeria");
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	public static void doSelectFromDropDownVisibleText(By locator,String value){
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
		
	}
	
	public static void doSelectFromDropDownByIndex(By locator,int index){
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	
	public static void doSelectFromDropDownByValue(By locator,String value){
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
		
	}


}
