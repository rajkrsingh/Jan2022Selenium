package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TutorialsNinja_RegisterPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		
		
	//By locator -> OR 
		
		
		//Home page
		By myAccount=By.xpath("//span[contains(text(),'My Account')]");
		By registerLink=By.xpath("//a[contains(text(),'Register')]");
		
		//Register page
		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By eMail=By.id("input-email");
		By telePhone=By.id("input-telephone");
		By passWord=By.id("input-password");
		By confirmPass=By.id("input-confirm");
		By privatePolicy=By.name("agree");
		By continueBtn=By.xpath("//input[@type='submit']");
		
		
		ElementUtil elementUtil= new ElementUtil(driver);
		
		elementUtil.doClick(myAccount);
		elementUtil.doClick(registerLink);
		elementUtil.doSendKeys(firstName,"Raj");
		elementUtil.doSendKeys(lastName,"QA");
		elementUtil.doSendKeys(eMail,"rajqa@qa.com");
		elementUtil.doSendKeys(telePhone,"9999999999");
		elementUtil.doSendKeys(passWord,"raj123456");
		elementUtil.doSendKeys(confirmPass,"raj123456");
		elementUtil.doClick(privatePolicy);
		elementUtil.doClick(continueBtn);
		

	}

}
