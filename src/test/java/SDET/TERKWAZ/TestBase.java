package SDET.TERKWAZ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilitiesOrHelper.Helper;

public class TestBase {


	public static WebDriver driver ; 

	@BeforeSuite

	@Parameters ({"browser"})
	public void startDriver(@Optional ("chrome") String browserName) {

		if(browserName.equalsIgnoreCase("chrome")) {

			String chrompath = System.getProperty("user.dir")+"/driver/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chrompath);
			driver = new ChromeDriver();

		} else if 

		(browserName.equalsIgnoreCase("firefox")) {
			String firefoxpath = System.getProperty("user.dir")+"/driver/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", firefoxpath);
			driver = new FirefoxDriver();


		}



		driver.manage().window().maximize();

	}





	@AfterSuite 
	public void CloseDriver () throws InterruptedException {

		driver.quit();
	}
	
	
	
	// take sc when test case fail
	
	@AfterMethod
	
	public void ScreenShotOnFailure(ITestResult result ){
		if (result.getStatus()==ITestResult.FAILURE)

		{
			System.out.println("failed!");
			System.out.println("take screenshot");
			Helper.captureScreenshot(driver, result.getName());
		}




	}

public void closeTheBrowser () {
	
	      driver.quit();
}
	
	
	
}
