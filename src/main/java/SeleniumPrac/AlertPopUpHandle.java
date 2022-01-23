package SeleniumPrac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		//Object Repository - OR
		
		By JavaScript_link= By.linkText("JavaScript Alerts");
		By JS_alert_Btn=By.xpath("//button[@onclick='jsAlert()']");
		By success_Result=By.id("result");
		By JS_confirm=By.xpath("//button[@onclick='jsConfirm()']");
		By JS_confirm_ok_result=By.xpath("//p[contains(text(),'You clicked: Ok')]");
		By JS_confirm_cancel_result=By.xpath("//p[contains(text(),'You clicked: Cancel')]");
	    By JS_prompt_Btn=By.xpath("//button[@onclick='jsPrompt()']");	
		By JS_prompt_result=By.xpath("//p[contains(text(),'You entered')]");
		
		
		
		
		WebElement javaScriptBtn=driver.findElement(JavaScript_link);
		javaScriptBtn.click();
		
		WebElement JSalertBtn=driver.findElement(JS_alert_Btn);
		JSalertBtn.click();
		
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept(); //click on OK button
		WebElement successResult=driver.findElement(success_Result);
		String successMsg=successResult.getText();
		
		if(successMsg.equals("You successfully clicked an alert")) {
			System.out.println("User clicked on 'Click for JS Alert' button ");
		}
		
		
		//*****JS_Confirm Button
		
		WebElement js_ConfirmBtn=driver.findElement(JS_confirm);
		js_ConfirmBtn.click();
		
		Thread.sleep(2000);
		String JS_confirm_msg=alert.getText();
		
		System.out.println(JS_confirm_msg);
		alert.accept(); //click on OK button
		WebElement JS_Confirm_Msg=driver.findElement(JS_confirm_ok_result);
	    String JS_confirm_ok_result_msg=JS_Confirm_Msg.getText();
	    
	    if(JS_confirm_ok_result_msg.equals("You clicked: Ok")) {
	    	System.out.println("User clicked on 'Click for JS Confirm' button");
	    }
	    
	    //*******click on cancel button
	    js_ConfirmBtn.click();
	    alert.dismiss(); // click on cancel button
	    
	    WebElement JS_Confirm_cancel=driver.findElement(JS_confirm_cancel_result);
	    String JS_confirm_cancel_result_msg=JS_Confirm_cancel.getText();
	    
	    if(JS_confirm_cancel_result_msg.equals("You clicked: Cancel")) {
	    	System.out.println("JS Confirm alert pop up cancel succcessfully...");
	    }
	    
	    
	    //****JS Prompt button*********************************//
	    WebElement JS_prompt_Button=driver.findElement(JS_prompt_Btn);
	    JS_prompt_Button.click();
	    Thread.sleep(5000);
	    alert.sendKeys("Testing by Raj");
	    
	   
	    alert.accept();
	    
	    WebElement JS_prompt_result_msg=driver.findElement(JS_prompt_result);
	    String JS_prompt_result_Msg_Details=JS_prompt_result_msg.getText();
	    if(JS_prompt_result_Msg_Details.contains("You entered")) {
	    	System.out.println("You have entered text is JS prompt alert pop up successfully...");
	    }

	}

	
	public static void jsAlertPopUpHandle() {
		
		Alert alert=driver.switchTo().alert();
		alert.accept(); //clicks on OK button
		//alert.dismiss(); // clicks on cancel button
		//alert.getText(); //get the text message from java script pop up window
		//alert.sendKeys("Testing"); //It will entered text in JS prompt 
	}
}
