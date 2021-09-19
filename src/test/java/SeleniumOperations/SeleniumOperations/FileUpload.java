package SeleniumOperations.SeleniumOperations;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class FileUpload extends BaseClass{

	@Test
	public void upload()
	{
		driver.findElement(locators.fileUpload).click();
		
		driver.findElement(locators.browseFile).sendKeys("C:\\Users\\sagar\\Downloads\\Resume_1.docx");
		driver.findElement(locators.terms).click();
		driver.findElement(locators.submitFile).click();
		boolean text = driver.getPageSource().contains("has been successfully uploaded.");
		Assert.assertTrue(text);
	}
}

