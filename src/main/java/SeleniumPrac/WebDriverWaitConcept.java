package SeleniumPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {


		//explicit wait:WebDriverWait extends FluentWait
		//both classes are implementing wait interface
		//dynamic wait:10 secs -- 5 secs --will be ignored


		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.get("https://www.kayak.com");

		//		WebDriverWait wait=new WebDriverWait(driver,10);
		//        wait.until(ExpectedConditions.titleContains("KAYAK"));
		//        System.out.println(driver.getTitle());

		String title=waitForPageTitle("KAYAK",10);
		System.out.println(title);

	}

	public static String waitForPageTitle(String title,int timeOut) {

		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();

	}

	public static String waitForPageTitleToBe(String title,int timeOut) {

		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();

	}

	public static String waitForPageUrl(String urlValue,int timeOut) {

		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.urlContains(urlValue));
		return driver.getCurrentUrl();

	}

}
