package SeleniumPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/shambhu892/downloads/chromedriver");
		WebDriver driver=new ChromeDriver(); //launch chrome driver
		driver.get("http:www.google.com"); //enter the url
		String title=driver.getTitle();
		System.out.println("Google title:"+title);
		System.out.println("--------------------------------");
		//String pageSource=driver.getPageSource();
		//System.out.println("Page Source:"+pageSource);
		 //driver.quit();
		 driver.close();
		 System.out.println(driver.getTitle()); //for quit case - NoSuchSessionException: Session ID is null. 
         //for close case - NoSuchSessionException: invalid session id
	}

}
