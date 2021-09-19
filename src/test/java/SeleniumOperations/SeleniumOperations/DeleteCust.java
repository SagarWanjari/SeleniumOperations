package SeleniumOperations.SeleniumOperations;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class DeleteCust extends BaseClass {
	
	@Test
	public void delCust() throws InterruptedException
	{
		
/* Code with hard assert*/		
//		driver.findElement(locators.delCustLink).click();
//		
//		driver.findElement(locators.custId).sendKeys("1234");
//		Thread.sleep(3000);
//		driver.findElement(locators.btnReset).click();
//		String data=driver.findElement(locators.custId).getText();
//		Assert.assertEquals("", data);
//		driver.findElement(locators.custId).sendKeys("1234");
//		driver.findElement(locators.btnSubmit).click();
//		WebDriverWait wait=new WebDriverWait(this.driver,30);
//		String text=driver.switchTo().alert().getText();
//		Thread.sleep(5000);
//		Assert.assertEquals("Do you really want to delete this Customer?", text);		
//		Thread.sleep(5000);
//		if(wait.until(ExpectedConditions.alertIsPresent())==null)
//		{
//			Assert.assertTrue(false);
//		}
//		else
//		{
//			Assert.assertTrue(true);
//		}
//		driver.switchTo().alert().accept();
//		
//		driver.switchTo().alert().accept();
//		
//		driver.findElement(locators.custId).sendKeys("1234");
		
		
		SoftAssert sa=new SoftAssert();
		
		driver.findElement(locators.delCustLink).click();
		
		driver.findElement(locators.custId).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(locators.btnReset).click();
		String data=driver.findElement(locators.custId).getText();
		sa.assertEquals("123", data);
		driver.findElement(locators.custId).sendKeys("1234");
		data=driver.findElement(locators.custId).getText();
		sa.assertEquals("1234", data);
		driver.findElement(locators.btnSubmit).click();
		WebDriverWait wait=new WebDriverWait(this.driver,30);
		String text=driver.switchTo().alert().getText();
		Thread.sleep(5000);
		sa.assertEquals("Do you really want to delete this Customer? hi", text);		
		Thread.sleep(5000);
		if(wait.until(ExpectedConditions.alertIsPresent())==null)
		{
			sa.assertTrue(false);
		}
		else
		{
			sa.assertTrue(true);
		}
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(locators.custId).sendKeys("1234");
		
	}

}
