package SeleniumOperations.SeleniumOperations;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Login extends BaseClass {

	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(locators.Login).click();
		driver.findElement(locators.email).sendKeys("admin");
		driver.findElement(locators.password).sendKeys("admin");
		driver.findElement(locators.signIn).click();
		boolean title = driver.getPageSource().contains("Successfully");
		System.out.println(title);
		Assert.assertTrue(title);
	}
}
