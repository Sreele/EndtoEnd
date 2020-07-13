package EndtoEnd.E2EProject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateTitile extends base{
	
	
	@BeforeTest
	public void open_browser() throws IOException {
		driver=initilizeDriver();
		driver.get(pr.getProperty("url"));
	}
	@Test
	public void basePageNavigation() throws IOException {
		
		LandingPage landing=new LandingPage(driver);
		Assert.assertEquals(landing.get_home_title().getText(),"FEATURED COURSES");
		Assert.assertTrue(landing.getNavbar().isDisplayed());
		
		
	}
	@AfterTest
	public void close_browser() {
		driver.close();
	}
		
}
