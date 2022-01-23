package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		Thread.sleep(2000);

		//Multi Selection
		//By muliti_selection1=By.id("justAnInputBox");
		//By option_list1=By.xpath("//span[@class='comboTreeItemTitle']");


		//Multi Selection With Cascade Option Select
		By multi_list_open=By.id("justAnInputBox1");
		By multi_select=By.xpath("//span[@class='comboTreeItemTitle']");

		driver.findElement(multi_list_open).click();
		Thread.sleep(2000);
		//optionListMultiSelect(multi_select,"choice 1","choice 2 1","choice 3","choice 4"); 
		optionListMultiSelect(multi_select,"all"); 

	}

	public static void optionListMultiSelect(By locator,String...value) throws InterruptedException {

		List<WebElement> multi_select_options=driver.findElements(locator);
		if(!value[0].equalsIgnoreCase("All")) {

			for(int i=0;i<multi_select_options.size(); i++) {
				String text=multi_select_options.get(i).getText();
				if(!text.isEmpty()) {
					System.out.println(text); 

					for(int j=0;j<value.length;j++) {
						if(text.equals(value[j])) {
							multi_select_options.get(i).click();
							break;
						}

					}
				}

			}
		}
		else {
			try {
				for(WebElement e:multi_select_options) {
					String text1=e.getText();
					if(!text1.isEmpty())
					{
						//Thread.sleep(2000);
						e.click();
						
					}

				}
			}
			catch(Exception e) { }
		}

	}

}



