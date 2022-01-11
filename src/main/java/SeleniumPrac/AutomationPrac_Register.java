package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPrac_Register {
	

	public static void main(String[] args) throws InterruptedException {
		
		String browerName="chrome";
		
		//By - Object Repository
		
		   //By signIn=By.xpath("//a[@title='Log in to your customer account']");
		   By signIn=By.linkText("Sign in");
		    
		   //CREATE AN ACCOUNT
		   By emailAddress=By.id("email_create");
		   By submitBtn=By.id("SubmitCreate");
		   
		   //By gender_Male=By.id("id_gender1");
		   By gender_Male=By.xpath("//div[@class='radio-inline']//input[@id='id_gender1']");
		   By firstName=By.id("customer_firstname");
		   By lastName=By.id("customer_lastname");
		   By passWord=By.id("passwd");
		   
		   //Your Address
		   
		   //By addr_Fname=By.id("firstname");
		   //By addr_Lname=By.id("lastname");
		   By address=By.id("address1");
		   By city=By.id("city");
		   By state=By.id("id_state");
		   By select_State=By.xpath("//*[@id=\"id_state\"]/option[6]");
		   By postal_Code=By.id("postcode");
		   By mobileNumber=By.id("phone_mobile");
		   By register_Btn=By.id("submitAccount");
		   
		   //*[@id="id_state"]/option[2]
		   
		   DriverFactory df=new DriverFactory();
		   WebDriver driver=df.init_driver(browerName);
		   df.lanchURL("http://automationpractice.com/");
		   String title=df.doGetTitle();
		   System.out.println("Page title is:"+title);
		   if(title.equals("My Store")) {
			   System.out.println("Page title is correct......");
			   
		   }
		   else {
			   System.out.println("Page title is not correct");
		   }
		   ElementUtil elementUtil=new ElementUtil(driver);
		   
		   elementUtil.doClick(signIn);
		   elementUtil.doSendKeys(emailAddress,"rajqa11@rajqa.com");
		   elementUtil.doClick(submitBtn);
		   
		   Thread.sleep(5000);
		   
		   elementUtil.doClick(gender_Male);
		   elementUtil.doSendKeys(firstName, "Raj");
		   elementUtil.doSendKeys(lastName, "QA");
		   elementUtil.doSendKeys(passWord,"raj123456");
		   
		   //elementUtil.doSendKeys(addr_Fname,"Greater Noida");
		   //elementUtil.doSendKeys(addr_Lname,"Sector 2");
		   
		   elementUtil.doSendKeys(address, "Noida-sector 18");
		   elementUtil.doSendKeys(city,"Noida");
		   elementUtil.doClick(state);
		   //Thread.sleep(2000);
		   elementUtil.doClick(select_State);
		   elementUtil.doSendKeys(postal_Code, "12345");
		   elementUtil.doSendKeys(mobileNumber, "9999999999");
		   elementUtil.doClick(register_Btn);
	}

}
