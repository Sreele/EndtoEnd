package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By signin=By.xpath("//span[contains(text(),'Login')]");
	By Login_title=By.xpath("//div[@class='alert alert-danger alert-show mb-5']");
	By Home_title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By Navbar=By.xpath("//div[@class='navbar navbar-default navbar-static-top']");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getLogin() {
		return driver.findElement(signin);
	}
	public WebElement gettitile() {
		return driver.findElement(Login_title);
	}
	public WebElement get_home_title() {
		return driver.findElement(Home_title);
	}
	public WebElement getNavbar() {
		return driver.findElement(Navbar);
	}
}
