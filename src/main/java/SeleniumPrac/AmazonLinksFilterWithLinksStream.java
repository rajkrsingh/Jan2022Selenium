package SeleniumPrac;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLinksFilterWithLinksStream {

	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
        
		driver.get("https://www.amazon.in/");
		
		By links=By.tagName("a");
		List<WebElement> linksList=driver.findElements(links);
		//System.out.println(total_links.size());
		List<String> linksAmazonList=linksList.stream()
		  .filter(ele-> !ele.getText().isEmpty())
		  .filter(ele->ele.getText().contains("Amazon"))
		  .map(ele->ele.getText().trim())
		  .collect(Collectors.toList());
		
		linksAmazonList.stream().forEach(ele->System.out.println(ele));
	
		
		
		
		
		
		
	}

}
