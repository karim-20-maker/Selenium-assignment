package SDET.TERKWAZ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubmitUploaded extends BasePage{

	public SubmitUploaded(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy (id = "uploaded-files")
	public WebElement FileUploaded;

}
