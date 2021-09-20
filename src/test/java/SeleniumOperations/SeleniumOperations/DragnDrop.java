package SeleniumOperations.SeleniumOperations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragnDrop extends BaseClass{
	
	@Test
	public void dragdrop() throws InterruptedException
	{
		driver.findElement(locators.lnkDragnDrop).click();
		
		Actions action=new Actions(driver);
		WebElement dragfirstAmt5000= driver.findElement(locators.dragfirstAmt5000);
		WebElement dragfirstAmt2_5000= driver.findElement(locators.dragfirstAmt2_5000);
		WebElement dragbank = driver.findElement(locators.dragbank);
		WebElement dragsales = driver.findElement(locators.dragsales);
		WebElement placebank = driver.findElement(locators.placebank);
		WebElement placeamt1 = driver.findElement(locators.placeamt1);
		WebElement placeloan = driver.findElement(locators.placeloan);
		WebElement placeamt2 = driver.findElement(locators.placeamt2);
		action.dragAndDrop(dragfirstAmt5000,placeamt1).build().perform();
		action.dragAndDrop(dragfirstAmt2_5000,placeamt2).build().perform();
		action.dragAndDrop(dragbank,placebank).build().perform();
		action.dragAndDrop(dragsales,placeloan).build().perform();
	
		Thread.sleep(5000);
	}

}
