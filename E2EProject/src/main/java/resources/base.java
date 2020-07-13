package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	
	public WebDriver driver;
	public Properties pr;
	public WebDriver initilizeDriver() throws IOException {
	    pr=new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\GAVSLTPBCP\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		pr.load(fis);
		String browserName=pr.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAVSLTPBCP\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		
		}
		else if(browserName=="firefox") {
			
			System.setProperty("webdriver.gecko.driver", "/Users/username/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}
		else if(browserName=="IE") {
		
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
	    }
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

}}
