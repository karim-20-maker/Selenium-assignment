package SDET.TERKWAZ;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearch  extends TestBase{

	String name = "Selenium webdriver";
	SearchSeleniumPage searchobj ;
	HomeSearch homeObj ;


	@BeforeMethod
	public void navigate () throws InterruptedException  {
		driver.navigate().to("https://www.google.com/ncr");
		searchobj = new SearchSeleniumPage(driver);
		homeObj = new HomeSearch(driver);
		searchobj.SearchGoogle(name);
	

		System.out.println(homeObj.link.getText()+" : is the third link ");
	}
	@Test

	public void SearchSelenium()  {
		

		

		try {
			Assert.assertTrue(homeObj.link.getText().contains("what is selenium webdriver?")); //its not the third result

		} 
		catch (Exception e) {System.out.println(" go awaaay !!");
		}}}




