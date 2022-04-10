package baseclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Configuration;

public class BaseClass {
	
	

	WebDriver driver;
	public WebDriver initializeBrowser() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver",Configuration.driverpath);
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://aspireapp.odoo.com/web/login");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}

}
