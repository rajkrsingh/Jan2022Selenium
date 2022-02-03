package SeleniumPrac;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCricketScore {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/legends-league-cricket-2021-22-1298090/india-maharajas-vs-asia-lions-4th-match-1298098/full-scorecard");
		
//		 List<WebElement> score_details=driver.findElements(By.xpath
//				 ("//a[contains(text(),'Upul Tharanga')]//parent::td//following-sibling::td"));
//		 for(WebElement e:score_details) {
//			 System.out.println(e.getText());
//		 }
		
		    System.out.println(scoreDetails("Romesh Kaluwitharana"));
		    System.out.println(scoreDetails("Upul Tharanga"));
	}
	
	public static List<String> scoreDetails(String playerName) {
		System.out.println("Getting cricket score card of:"+playerName);
		
		List<String> scoreCard=new ArrayList<>();
		
		List<WebElement> score_details=driver.findElements(By.xpath
				 ("//a[contains(text(),'"+playerName+"')]//parent::td//following-sibling::td"));
		 for(WebElement e:score_details) {
			String text=e.getText();
			scoreCard.add(text);
			
		 }
		 
		 return scoreCard;
		
	}
}
