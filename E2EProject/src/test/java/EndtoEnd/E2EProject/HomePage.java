package EndtoEnd.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	private static Logger log=LogManager.getLogger(HomePage.class.getName());
	@BeforeTest
	public void start() throws IOException {
		
		driver=initilizeDriver();
		
	}
	
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String email,String pass) throws IOException {
		
		driver.get(pr.getProperty("url"));
		LandingPage landing=new LandingPage(driver);
		landing.getLogin().click();
		LoginPage login=new LoginPage(driver);
		login.getEmail().sendKeys(email);
		login.getPass().sendKeys(pass);
		//System.out.println(text);
		login.getSubmit().click();
		System.out.println(landing.gettitile().getText());
		Assert.assertEquals(landing.gettitile().getText(),"Invalid email or password.");
	}
	@DataProvider
	public Object[][] getData() { 
			
			Object[][] data=new Object[2][2];
			
			data[0][0]="mfkmgkf";
			data[0][1]="mfmmgfm";
			//data[0][2]="gmfl";
			
			data[1][0]="mfkmgkf";
			data[1][1]="mfmmgfm";
			//data[1][2]="gmfl";
			
			return data;
			
			
			
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
		
		

}
