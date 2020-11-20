package SDET.TERKWAZ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeFile extends BasePage {

	public HomeFile(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "//*[@id=\"content\"]/ul/li[18]/a")
	public WebElement UploadFileBtn;
	
	
	public void  SelectUploadFile () {
		
		
		UploadFileBtn.click();
	}
	

}
