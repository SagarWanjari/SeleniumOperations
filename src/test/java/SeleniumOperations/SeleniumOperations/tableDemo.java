package SeleniumOperations.SeleniumOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class tableDemo extends BaseClass {

	
	@Test
	public void tableTravserse()
	{
		driver.findElement(locators.tableLink).click();
		
		List<WebElement> trow = driver.findElements(By.tagName("tr"));
		System.out.println("trow size"+trow);
		for(int i=0;i<trow.size();i++)
		{
			List<WebElement> tdata = trow.get(i).findElements(By.tagName("td"));
			for(int k=0;k<tdata.size();k++)
			{
				System.out.print(tdata.get(k).getText()+" ");
			}
			System.out.println();
		}
	}
}
