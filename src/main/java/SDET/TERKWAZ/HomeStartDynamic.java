package SDET.TERKWAZ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeStartDynamic extends BasePage{

	public HomeStartDynamic(WebDriver driver) {
		super(driver);
	}


	@FindBy (xpath = "//div[@id=\"start\"]/button")
	public	WebElement StartBtn ; 
	public void StartLoad () {

		StartBtn.click();



	}



}
