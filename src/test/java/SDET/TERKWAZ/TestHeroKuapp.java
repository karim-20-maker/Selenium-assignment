package SDET.TERKWAZ;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHeroKuapp extends TestBase {

	String imagePath = System.getProperty("user.dir")+"/uploads/selenium.jpg";

	HeroKuappFile uploadobj;
	HomeFile FileObj;
	SubmitUploaded SubmitObj;

	
	@BeforeMethod
	public void navigate () {

		driver.navigate().to("https://the-internet.herokuapp.com/");
		uploadobj = new HeroKuappFile(driver);
		FileObj = new HomeFile(driver);
		SubmitObj = new SubmitUploaded(driver);
		
	}

	

	@Test 
	public void UploadFileConfirmation() throws InterruptedException {


		FileObj.SelectUploadFile();
		uploadobj.chooseandupload(imagePath);
		try {		
			Assert.assertEquals(SubmitObj.FileUploaded.getText(), "selenium.jpg");

		}
		catch (Exception e) {
			System.out.println("go awaaaay!!");
		}
		Thread.sleep(2000);








	}










}
