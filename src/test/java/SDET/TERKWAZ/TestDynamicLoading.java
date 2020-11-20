package SDET.TERKWAZ;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDynamicLoading extends TestBase {

	DynamicLoading DynamicObj;
	HomeStartDynamic StartObj;
	WebDriverWait wait ;
	
	
	
	@BeforeMethod
	
	public void navigate () {

		driver.navigate().to("https://the-internet.herokuapp.com/");
		DynamicObj = new DynamicLoading(driver);
		StartObj = new HomeStartDynamic(driver);
		wait = new  WebDriverWait(driver, 25);

	}


	@Test 

	public void waiting() {
		DynamicObj.dynamic();
		StartObj.StartLoad();
		wait.until(ExpectedConditions.textToBePresentInElement(DynamicObj.HEllo, "Hello World!"));

		System.out.println(DynamicObj.HEllo.getText());

		try {
			Assert.assertTrue(DynamicObj.HEllo.getText().contains("Hello World!")); 


		} catch (Exception e) {


			System.out.println("go awaaaay!!");
		}





	}









}







