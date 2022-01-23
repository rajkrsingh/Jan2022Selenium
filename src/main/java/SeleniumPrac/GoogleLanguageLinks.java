package SeleniumPrac;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {
	
    static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		//Object Repository - By Locator
		
		By languageList= By.xpath("//div[@id='SIvCob']/a");
		
		//List<String> languages=new ArrayList<>();
		//List<WebElement> language_List=driver.findElements(languageList);
		
		//for(WebElement e:language_List) {
			
		//	String text=e.getText();
		//	System.out.println(text);
		//	languages.add(text);
	   //}
		
		//System.out.println(languages);
		//List<String>  totalLinks = languageLinks(languageList);
		
		List<String> totLinks=languageLinks(languageList);
		
		System.out.println(totLinks);
		
	}
	
	//1.function: which will return : the list of language links text
	//2.function: which will return : the string array of links text[]
	//3.function: which will return :the list of footer links text
	//4.on https://www.freshworks.com/--return the list of all footer links text	
	
	
	
	//1.function: which will return : the list of language links text
	//2.function: which will return : the string array of links text[]
	
	public static List<String> languageLinks(By locator) {
	 List<String> language_linkss= new ArrayList<>();	
	 List<WebElement> language_List=driver.findElements(locator);
		for(WebElement e:language_List) {	
		String text=e.getText();
		System.out.println(text);
		language_linkss.add(text);
		}
		
		return language_linkss;
		
	}
	
}
