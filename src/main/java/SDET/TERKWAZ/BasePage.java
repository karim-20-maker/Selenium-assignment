package SDET.TERKWAZ;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
protected WebDriver driver;


	// create constructor
	public BasePage(WebDriver driver)
	  {

		PageFactory.initElements(driver, this); // belongs to pom pattern; 

	}
	protected static void clickButton(WebElement button) {
		
		button.click();
		
	}
protected static void setText (WebElement textElements , String value) {
textElements.sendKeys(value);	
}

protected static void ClearButton(WebElement erase) {
	
	erase.clear();
	
}



}


