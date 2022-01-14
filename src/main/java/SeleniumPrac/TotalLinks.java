package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinks {
	
	static String browserName="chrome";

	public static void main(String[] args) {
		DriverFactory df=new DriverFactory();
		WebDriver driver=df.init_driver(browserName);
	    df.lanchURL("https://www.amazon.in");
	    
	    //Object Repository 
	    
	    By links=By.tagName("a");
	    
	    
	   List<WebElement> totalLinks= driver.findElements(links);
	   int linksSize=totalLinks.size();
	   System.out.println("Total links:"+linksSize);
	   
	   //1.For each loop 
	   
//	   for(WebElement e:totalLinks) {
//		   if(!e.getText().isEmpty()) {
//			   System.out.println(e.getText());
//		   }
//		   
//	   }
	   
	   //2.Normal for loop
	   
	   for(int i=0;i<linksSize;i++) {
		   String linksText=totalLinks.get(i).getText();
		   if(!linksText.isEmpty()) {
			   System.out.println(i+"-->"+linksText ); 
		   }
		    
		   
	   }

	}

}
