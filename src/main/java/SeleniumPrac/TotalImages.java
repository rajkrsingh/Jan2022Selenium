package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		//Object Repository
		
		By imageList=By.tagName("img");
		
		List<WebElement> iamgesDetails=driver.findElements(imageList);
		
		int totalImages=iamgesDetails.size();
		System.out.println("Total image size:"+totalImages);
		
		for(int i=0;i<totalImages;i++) {
			
			String srcURL=iamgesDetails.get(i).getAttribute("src");
			String altValue=iamgesDetails.get(i).getAttribute("alt");
			System.out.println(srcURL);
			System.out.println(altValue);
			
			
		}
		
	}

}
