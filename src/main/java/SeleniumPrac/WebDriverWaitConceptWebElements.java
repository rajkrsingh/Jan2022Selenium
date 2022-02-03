package SeleniumPrac;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConceptWebElements {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
		
//		driver.get("https://rajqa-trials73.orangehrmlive.com/auth/seamlessLogin");
//		
//		By username=By.id("txtUsername");
//		By password=By.id("txtPassword");
//		By loginBtn=By.cssSelector("button[type='submit']");
		
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		WebElement username_ele=
//				wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		
		//WebElement username_ele=waitForElementPresent(username,10);
		
//		username_ele.sendKeys("admin");
//		driver.findElement(password).sendKeys("DF9ZyQb8@t");
//		driver.findElement(loginBtn).click();
		driver.get("https://www.dollartree.com/");
		//Thread.sleep(3000);
		//By footer_links=By.cssSelector(".footer-nav li a");
		
		By track_orders=By.xpath("//span[contains(@role,'alert')]/a/span[contains(@data-bind,'trackOrders')]");
		//By track_orders=By.cssSelector("div.oc-panel.col-md-3 > span > a > span");
		
		//driver.findElement(track_orders).click();
		//List<WebElement> footer_list =visiblityOfAllElements(footer_links,10);
		//System.out.println(footer_list.size());
		//footer_list.stream().forEach(ele->System.out.println(ele.getText()));
		
		
		
		
		
		//Thread.sleep(5000);
		//WebElement element=driver.findElement(track_orders);
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		WebElement track=wait.until(ExpectedConditions.elementToBeClickable(track_orders));
//		Actions act=new Actions(driver);
//		act.moveToElement(track).click().build().perform();
		//clickWhenElementReady(track_orders,10);	
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.actionsClickWhenElementReady(track_orders, 10);
		
	}

	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	
	public static  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}
    /**
     * An expectation for checking that an element is present on the DOM of a page.
     * This does not necessarily mean that the element is visible
     * @param locator
     * @param timeOut
     * @return
     */
	public static WebElement waitForElementPresent(By locator,int timeOut) {
	
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
	}
	
	
	/**
	 * An expectation for checking that an element, known to be present on the DOM of a page, is visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 */
	
	public static void waitForElementVisible(By locator,int timeOut) {
		
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
	
	/**
	 * An expectation for checking that all elements present on the web page that match the locator are visible.
	 * Visibility means that the elements are not only displayed but also have a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return 
	 */
   public static List<WebElement> visiblityOfAllElements(By locator,int timeOut) {
	   WebDriverWait wait=new WebDriverWait(driver,timeOut); 
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));   

   }
   
   
   /**
    * An expectation for checking an element is visible and enabled such that you can click it.
    * @param locator
    * @param timeOut
    */
   public static void clickWhenElementReady(By locator,int timeOut) {
	   
	   WebDriverWait wait=new WebDriverWait(driver,timeOut);
	   WebElement element= wait.until(ExpectedConditions.elementToBeClickable(locator));
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
	   
   }
}
