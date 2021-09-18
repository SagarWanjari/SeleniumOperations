package SeleniumOperations.SeleniumOperations;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class AjaxDemo extends BaseClass {

	@Test
	public void Ajax()
	{
		driver.findElement(locators.ajaxDemo).click();
		driver.findElement(locators.radioNo).click();
		driver.findElement(locators.btnCheck).click();
		Assert.assertTrue(driver.getPageSource().contains("value is No"));
		driver.findElement(locators.radioYes).click();
		driver.findElement(locators.btnCheck).click();
		Assert.assertTrue(driver.getPageSource().contains("value is Yes"));
		driver.findElement(locators.btnReset).click();
		driver.findElement(locators.btnCheck).click();
		Assert.assertTrue(driver.getPageSource().contains("Radio button is Not checked"));
		
	}
}
