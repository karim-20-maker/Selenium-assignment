package SDET.TERKWAZ;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchSeleniumPage extends BasePage {

	public SearchSeleniumPage(WebDriver driver) {
		super(driver);

	}
	

	
	@FindBy (css= "input.gLFyf.gsfi")
	public WebElement searchbox ;
	
	
public void SearchGoogle (String name) {
	
	setText(searchbox, name);
	searchbox.sendKeys(Keys.ENTER);
	
	}


	
	
	
	
		
		
	
	

}
