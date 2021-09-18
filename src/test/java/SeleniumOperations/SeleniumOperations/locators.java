package SeleniumOperations.SeleniumOperations;

import org.openqa.selenium.By;

public class locators {

	 final  static By seleniumPath=By.xpath("//a[contains(text(),'Selenium')]");
	final static String radioFirstPart="//input[@value='";
	final static String radioSecondPart="']";	
	final static By radioCheckboxLink=By.xpath("//li/a[contains(text(),'Radio & Checkbox Demo')]");
	final static By checkbox1=By.xpath("//*[@value='checkbox1']");
	final static By checkbox2=By.xpath("//*[@value='checkbox2']");
	final static By checkbox3=By.xpath("//*[@value='checkbox3']");
	final static By tableLink=By.xpath("//a[text()='Table Demo']");
	
	
}
