package SeleniumOperations.SeleniumOperations;

import java.util.List;

import javax.swing.text.TabExpander;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class toolTip extends BaseClass {

	@Test
	public void toolTest() throws InterruptedException {
		driver.findElement(locators.toolTip).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(locators.DownloadNow)).perform();
		List<WebElement> tableRow=driver.findElements(By.tagName("tr"));
		
		for(int i=0;i<tableRow.size();i++)
		{
			List<WebElement> tableData=tableRow.get(i).findElements(By.tagName("td"));
					for(int k=0;k<tableData.size();k++)
					{
						System.out.println(tableData.get(k).getText()+" ");
					}
					System.out.println("");
		}
	}
}
