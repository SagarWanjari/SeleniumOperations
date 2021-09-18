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
	final static By googleClick=By.xpath("//a[@href='http://www.google.com']");
	final static By fbclick=By.xpath("//a[@href='http://www.fb.com']");
	final static By accessLink=By.xpath("//a[text()='Accessing Link']");
	final static By ajaxDemo=By.xpath("//a[text()='Ajax Demo']");
	final static By radioYes=By.xpath("//input[@id='yes']");
	final static By radioNo=By.xpath("//input[@id='no']");
	final static By btnReset=By.xpath("//input[@value='Reset']");
	final static By btnCheck=By.xpath("//input[@value='Check']");
	
	//p[contains(text(),'value is No')]
	//p[contains(text(),'value is Yes')]
	//p[contains(text(),'Radio button is Not checked')]
}
