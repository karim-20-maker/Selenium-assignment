package SDET.TERKWAZ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeroKuappFile extends BasePage {
	
	

	public HeroKuappFile(WebDriver driver) {
		super(driver);
	}

	
	
	
	@FindBy (css = "input#file-upload")
	public WebElement ChooseFileBtn;
	
	@FindBy (id = "file-submit")
	public WebElement uploadbtn;
	

	

	
	
	public void chooseandupload (String image) {
		
		ChooseFileBtn.sendKeys(image);
		uploadbtn.click();
	}
	
	
	
}
