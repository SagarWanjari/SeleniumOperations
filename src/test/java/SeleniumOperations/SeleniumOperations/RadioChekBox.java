package SeleniumOperations.SeleniumOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class RadioChekBox extends BaseClass{

	
	String option="Option 1";
	String checkbox1="checkbox1";
	String checkbox2="checkbox2";
	String checkbox3="checkbox3";
	@Test
	public void radioOperation() throws InterruptedException
	{
	driver.findElement(locators.radioCheckboxLink).click();
	String loc=locators.radioFirstPart+option+locators.radioSecondPart;
	driver.findElement(By.xpath(loc)).click();
	Thread.sleep(3000);
	driver.findElement(locators.checkbox1).click();
	driver.findElement(locators.checkbox3).click();
	}
	

}
