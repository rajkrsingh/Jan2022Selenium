package SeleniumPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessMode {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
	}

}
