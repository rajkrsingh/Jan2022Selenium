package SeleniumPrac;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinksText {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		//Object Repsitory - OR
		By footer_links=By.xpath("//div[@class='footer-main']//div[@class='col-md-4 footer-left-section']");
		By bottom_footer=By.xpath("//div[@class='footer-copyrights']//div[@class='footer-nav copyrights-nav hide-in-mobile']");



		List<String> bottom_links_details=bottomFooterLinks(bottom_footer);
		System.out.println(bottom_links_details);

		System.out.println("*************************");

		List<String> footer_links_details=footerLinks(footer_links);
		System.out.println(footer_links_details);




	}

	//3.function: which will return :the list of footer links text
	public static List<String> bottomFooterLinks(By locator) {

		List<String> bottomLinkText=new ArrayList<>();
		List<WebElement> bottomLinks=driver.findElements(locator);

		for(WebElement e:bottomLinks) {
			String text=e.getText();
			System.out.println(text);
			bottomLinkText.add(text);;



		}

		return bottomLinkText;

	}

	//4.on https://www.freshworks.com/--return the list of all footer links text
	public static List<String> footerLinks(By locator) {

		List<String> footerText=new ArrayList<>();
		List<WebElement> footetLinks=driver.findElements(locator);

		for(WebElement e:footetLinks) {
			String text=e.getText();
			if(!(text.equals("Freshworks") & text.equals("COMPANY"))) {
				//System.out.println(text);
				//System.out.println("**********************");

				footerText.add(text);;

			}

		}

		return footerText;
	}



}
