package SDET.TERKWAZ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeSearch extends BasePage{

	public HomeSearch(WebDriver driver) {
		super(driver);
	}
	
	

	
 @FindBy (xpath = "//*[@id=\"rso\"]/div[4]/div/div[1]/a/h3/span")
	public WebElement link;
	
	
}
