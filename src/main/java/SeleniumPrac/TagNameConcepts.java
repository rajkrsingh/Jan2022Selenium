package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameConcepts {
	
	static String browerName="chrome";

	public static void main(String[] args) {
        
		DriverFactory df=new DriverFactory();
		WebDriver driver=df.init_driver(browerName);
		df.lanchURL("https://classic.crmpro.com/index.html");
		
		//Object Repository - OR
		
		By tagName=By.tagName("h3");
		List<WebElement> totalTags=driver.findElements(tagName);
		
		//normal for loop
		
		for(int i=0;i<totalTags.size();i++) {
			
			 String text= totalTags.get(i).getText();
			 System.out.println(text);
			
		}
		
		System.out.println("******************************");
      // for each loop
		
		for(WebElement e:totalTags) {
			System.out.println(e.getText());
		}
	}

}
