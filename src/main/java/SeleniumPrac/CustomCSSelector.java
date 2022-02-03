package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCSSelector {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		//driver.get("https://app.hubspot.com/login");
		
		
		
		// id-->  #id, tag#id
		// class--> .class, tag.class
		// for multiple classes -> .c1.c2.c3.c4....cn
		
		//  tagname[attr1='value']
		//  tagname[attr1='value'][att2='val2']
		
		
		//examples:
		
		//  #input-email
		
		// .login-email, input.login-email , .form-control.private-form__control.login-email
		//use id and class together -->#username.form-control.private-form__control.login-email
		//use class first and then id--->.form-control.private-form__control.login-email#username
		//using id and class together with tag name --->input.login-email#username
		//tagname[attr1='value']=>  input[name='username']
		By.cssSelector("input[name='username']");
		
		//tagname[attr1='value'][att2='val2'] =>input[name='username'][type='text'] -- no space between [][]
		//  input[name][type='text'], input[name][type] ->this is also a right css selector
		// //input[@name and @type='text'], //input[@name and @type]-> This is also right XPATH
		
		//** Parent to Child traversing in CSS(there should be space between parent and child tagname
		
		// div.private-form__input-wrapper input
		// div.private-form__input-wrapper input#username
		// .private-form__input-wrapper input#username
		// .private-form__input-wrapper #username
		//  .private-form__input-wrapper>#username
		//  .private-form__input-wrapper>input
		
		
		// ***** child to parent: 
		//backward traversing is not possible in CSS
		
		//contains :Contaits works with * sign.
		//Contains () generally used for dynamic elements whether it is id or other attributes
		//   input[id*='username']
		//   input[]id*='origin-airport']
		
		//** Starts-with: sarts-with ^ caret sign
		// input[id^='username']
		
		//** Ends-with : Ends with $ dollar
		// input[id$='name']
		
		
		//****comma (,) in CSS
		
	    //	#input-email, #input-password,#input-email, #input-password,input[type='submit']
		//  #input-email, #input-password,input[type='submit'],a[href*='forgotten']
		
		//driver.findElement(By.cssSelector(".login-email")).sendKeys("raj");
		//driver.findElement(By.cssSelector("#input-password")).sendKeys("12345");
		
		
		//*******following sibling in CSS ************************
		//  div.private-form__input-wrapper+div ->we can find following sibling with + operator in CSS
		
		//***** to find nth row in CSS
		
		// ul.footer-nav li:nth-of-type(n) where n=1 to n
		
		
		
		
		
//		By loginForm=By.cssSelector("#input-email, #input-password,input[type='submit'],a[href*='forgotten'],a[href*='checkout/cart']");
//		
//		List<WebElement> eleList=driver.findElements(loginForm);
//		if(eleList.size()==6) {
//			System.out.println("My Login page is displayed with " +eleList.size()+ " mandatory fields...");
//		}
		
		By langLinks=By.cssSelector("ul.list-unstyled li:nth-of-type(n)");
		List<WebElement> langList=driver.findElements(langLinks);
		for(WebElement e:langList) {
			System.out.println(e.getText());
		}
		System.out.println("----------");
		langList.stream().forEach(ele->System.out.println(ele.getText()));
		
		
		
	}

}
