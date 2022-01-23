package SeleniumPrac;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver=driver;

	}

	public  WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);

	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	//****Send/Click Keys with ACTIONS CLASS ******************** 
	public void doActionsSendKeys(By locator,String value) {
		Actions action=new Actions(driver);
		action.sendKeys(getElement(locator),value).perform();

	}

	public void doActionsClick(By locator) {
		Actions action=new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	//***********Drop Down with Select Class*******************


	public void doSelectFromDropDownVisibleText(By locator,String value){
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);

	}

	public void doSelectFromDropDownByIndex(By locator,int index){
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public void doSelectFromDropDownByValue(By locator,String value){
		Select select=new Select(getElement(locator));
		select.selectByValue(value);

	}

	//************Drop Down without Select Class**********************

	public void selectDropDownValue(By locator,String value) {

		List<WebElement> optionsList=getElements(locator);
		//int totalCountry=countryList.size();
		//System.out.println("Total country count:"+totalCountry);

		for(WebElement e:optionsList) {
			if(e.getText().equals(value)){
				e.click();
				break;
			}
		}

	}


	public void selectFromSuggestionList(By suggestionList, String value) {

		List<WebElement> totalSuggestion=getElements(suggestionList);

		for(WebElement e:totalSuggestion) {
			System.out.println(e.getText());

			if(e.getText().equals(value)) {
				e.click();
				break;
			}
		}

	}

	//********This method will handle java script alert pop *******************************************

	public void jsAlertPopUpHandle() {

		Alert alert=driver.switchTo().alert();
		alert.accept(); //clicks on OK button
		//alert.dismiss(); // clicks on cancel button
		//alert.getText(); //get the text message from java script pop up window
		//alert.sendKeys("Testing"); //It will entered text in JS prompt 
	}


	//*********Handling Frame if frame name is exist(not applicable, if frame id is exist) **************** 

	public void frameHandle(By locator,String name) {

		driver.switchTo().frame(name);
		WebElement title=getElement(locator);
		String text=title.getText();
		System.out.println(text);

		driver.switchTo().defaultContent();
	}
	public List<String> getOptionsTextList(By locator) {
		List<String> optionsList=new ArrayList<>();

		Select select=new Select(getElement(locator));
		List<WebElement> options_list=select.getOptions();
		System.out.println(options_list.size());

		for(WebElement e:options_list) {
			String text=e.getText();
			System.out.println(text);
			optionsList.add(text);

		}

		return optionsList;

	}

	//** verify links

	public List<String> languageLinks(By locator) {
		List<String> language_links= new ArrayList<>();	
		List<WebElement> language_List=getElements(locator);
		for(WebElement e:language_List) {	
			String text=e.getText();
			System.out.println(text);
			language_links.add(text);
		}

		return language_links;

	}

	//3.function: which will return :the list of footer links text
	public List<String> bottomFooterLinks(By locator) {

		List<String> bottomLinkText=new ArrayList<>();
		List<WebElement> bottomLinks=getElements(locator);

		for(WebElement e:bottomLinks) {
			String text=e.getText();
			System.out.println(text);
			bottomLinkText.add(text);;



		}

		return bottomLinkText;

	}

	//*****File Upload*************************//

	public void fileUploadPopUp(By locator,String path) {
		getElement(locator).sendKeys(path);


	}

	//*******To handle Basic Auth *******************//

	public void authPopUpConcept() {

		//after @ selenium consider the url of the application so  password should not
		// contains @ like admin@123--in this case it won't work
		//url - https://admin:admin@the-internet.herokuapp.com/basic_auth


		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); 
	}


	//******JQuery Drop Down Handle ************************
	/**
	 * 
	 * 1.Pass the single string value for single selection
	 * 2.Pass the multiple string value for multiple selection
	 * 3.Pass "All" for all selection values from drop down
	 * Here Sting... value -> it behaves like a String array
	 * For multi selection we call method like "optionListMultiSelect(multi_select,"choice 1","choice 2 1","choice 3","choice 4"); "
	 * For All selection we call method like "optionListMultiSelect(multi_select,"All"); "
	 * @param locator
	 * @param value
	 * @throws InterruptedException
	 */


	public  void optionListMultiSelect(By locator,String...value) throws InterruptedException {

		List<WebElement> multi_select_options=getElements(locator);
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

