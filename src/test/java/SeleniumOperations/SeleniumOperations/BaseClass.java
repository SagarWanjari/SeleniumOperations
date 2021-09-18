package SeleniumOperations.SeleniumOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	WebDriver driver;
	//WebDriverWait wait=new WebDriverWait(driver, 30);
	@BeforeClass
	public void setup() throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	 driver=new FirefoxDriver();
	driver.get("http://demo.guru99.com/V4/");
	Thread.sleep(3000);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(locators.seleniumPath).click();
	Thread.sleep(3000);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
