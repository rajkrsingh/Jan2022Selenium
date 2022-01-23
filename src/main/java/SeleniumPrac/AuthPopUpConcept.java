package SeleniumPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUpConcept {
	static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); //after @ selenium consider the url of 
	    authPopUpConcept();                                                              //the application so  password should not contains @ like admin@123--in this case it won't work
		                               
	}
	
	public static void authPopUpConcept() {
		
		//after @ selenium consider the url of the application so  password should not
        // contains @ like admin@123--in this case it won't work
		//url - https://admin:admin@the-internet.herokuapp.com/basic_auth
		

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); 
	}

}
