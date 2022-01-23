package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country=By.xpath("//select[@id='Form_submitForm_Country']/option");
		selectDropDownValue(country,"United Kingdom");
		
		
		
	}

	
	public static void selectDropDownValue(By locator,String value) {
		
		List<WebElement> optionsList=driver.findElements(locator);
		//int totalCountry=countryList.size();
		//System.out.println("Total country count:"+totalCountry);
		
		for(WebElement e:optionsList) {
			if(e.getText().equals(value)){
				e.click();
				break;
			}
		}
		
	}
}
