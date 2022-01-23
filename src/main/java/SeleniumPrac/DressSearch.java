package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DressSearch {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");

		//Object Repository:
		By search=By.id("search_query_top");
		By suggestionList=By.xpath("//div[@class='ac_results']/ul/li");

		WebElement searchText=driver.findElement(search);
		searchText.sendKeys("dress");
		Thread.sleep(3000);
		selectFromSuggestionList(suggestionList,"Summer Dresses > Printed Chiffon Dress");
		
		
	}
	public static void selectFromSuggestionList(By suggestionList, String value) {
	
		List<WebElement> totalSuggestion=driver.findElements(suggestionList);

		for(WebElement e:totalSuggestion) {
			System.out.println(e.getText());

			if(e.getText().equals(value)) {
				e.click();
				break;
			}
		}

		
	}


}
