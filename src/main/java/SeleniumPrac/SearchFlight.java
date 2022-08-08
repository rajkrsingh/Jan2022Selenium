package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchFlight {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.kayak.co.in/?ispredir=true");
		ElementUtil eu=new ElementUtil(driver);
		
	      //OR
		
	      By From= By.xpath("//div[@id='DZ0S']//div[contains(text(),'From?')]");
		   //By From= By.xpath("//*[@id=\"rGdd\"]//div");
     	  By To= By.xpath("//div[@id='l4zk']//div[contains(text(),'To?')]");
		  By BLR=By.xpath("//div[contains(text(),'BLR')]");
		  By DEL=By.xpath("//div[contains(text(),'DEL')]");
		  
		  //Actions action=new Actions(driver);
		  Thread.sleep(8000);
		  System.out.println("why thread.sleep() is used");
		 
		  //action.click(driver.findElement(From));
		  
    	  driver.findElement(From).click();
//		  driver.findElement(From).sendKeys("BLR");
//		  driver.findElement(BLR).click();
//		  
//		  driver.findElement(To).click();
//		  driver.findElement(To).sendKeys("DEL");
//		  driver.findElement(DEL).click();

	}

}
