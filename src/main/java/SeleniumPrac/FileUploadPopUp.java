package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
		//Object Repository - OR
		
		By file_uplaod_link=By.linkText("File Upload");
		By choose_file_Btn=By.id("file-upload");
		By uplaod=By.id("file-submit");
		
		
      	driver.findElement(file_uplaod_link).click();
//		driver.findElement(choose_file_Btn).sendKeys("/Users/shambhu892/desktop/test.pdf");
      	
      	fileUploadPopUp(choose_file_Btn,"/Users/shambhu892/desktop/test.pdf"); 
      	driver.findElement(uplaod).click();
		
     
	}
    
	 public static void fileUploadPopUp(By locator,String path) {
		driver.findElement(locator).sendKeys(path);
		
		 
	 }
}
