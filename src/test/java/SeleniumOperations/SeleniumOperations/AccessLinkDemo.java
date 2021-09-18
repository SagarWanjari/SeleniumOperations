package SeleniumOperations.SeleniumOperations;

import org.testng.annotations.Test;

public class AccessLinkDemo extends BaseClass {

	

	
	@Test
	public void clickLink() throws InterruptedException
	{
		driver.findElement(locators.accessLink).click();
		driver.findElement(locators.googleClick).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(locators.fbclick).click();
	}
}
