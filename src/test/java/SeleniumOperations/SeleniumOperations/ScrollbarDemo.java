package SeleniumOperations.SeleniumOperations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollbarDemo extends BaseClass{

	@Test
	public void scrollDemo() throws InterruptedException
	{
		driver.findElement(locators.scollbarLink).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//to scroll down
		//js.executeScript("window.scrollBy(0,1000)");
		WebElement element=driver.findElement(locators.textToFind);
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(3000);
	}
}
