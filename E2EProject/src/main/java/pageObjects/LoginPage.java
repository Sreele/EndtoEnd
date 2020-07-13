package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	By email=By.id("user_email");
	By pass=By.id("user_password");
	By submit=By.xpath("//input[@name='commit']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPass() {
		return driver.findElement(pass);
	}
	public WebElement getSubmit() {
		return driver.findElement(submit);
	}
}
