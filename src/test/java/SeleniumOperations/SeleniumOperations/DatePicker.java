
package SeleniumOperations.SeleniumOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DatePicker extends BaseClass {

	@Test
	public void datePicker() throws InterruptedException
	{
		driver.findElement(locators.datePicker).click();
		
		//telerik DateTimePicker control refer link https://www.guru99.com/handling-date-time-picker-using-selenium.html
		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

        //Fill date as mm/dd/yyyy as 09/25/2013

        dateBox.sendKeys("09252013");
        Thread.sleep(5000);
        //Press tab to shift focus to time field

        dateBox.sendKeys(Keys.TAB);

        //Fill time as 02:45 PM

        dateBox.sendKeys("0245PM");
        
        Thread.sleep(5000);
        driver.findElement(locators.submitDate).click();
	}
}
