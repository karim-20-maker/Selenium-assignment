package SDET.TERKWAZ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoading extends BasePage {

	public DynamicLoading(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath = "//*[@id=\"content\"]/ul/li[14]/a")
	 public WebElement DynamicLink ;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div/a[2]")
	 public WebElement SecondLink ;
	

	
	@FindBy(css = "div#finish")
	 public WebElement HEllo ;
	
	public void dynamic () {
		
		DynamicLink.click();
		SecondLink.click();
		
		
		
		
	
	
	
	
	
	}
}
