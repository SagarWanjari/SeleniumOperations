package SeleniumOperations.SeleniumOperations;

import org.openqa.selenium.By;

public class locators {
	//selenium path
	 final  static By seleniumPath=By.xpath("//a[contains(text(),'Selenium')]");
	
	//radio&checkbox 
	final static String radioFirstPart="//input[@value='";
	final static String radioSecondPart="']";	
	final static By radioCheckboxLink=By.xpath("//li/a[contains(text(),'Radio & Checkbox Demo')]");
	final static By checkbox1=By.xpath("//*[@value='checkbox1']");
	final static By checkbox2=By.xpath("//*[@value='checkbox2']");
	final static By checkbox3=By.xpath("//*[@value='checkbox3']");
	
	//table link
	final static By tableLink=By.xpath("//a[text()='Table Demo']");
	
	//access link
	final static By googleClick=By.xpath("//a[@href='http://www.google.com']");
	final static By fbclick=By.xpath("//a[@href='http://www.fb.com']");
	final static By accessLink=By.xpath("//a[text()='Accessing Link']");
	
	//ajax demo
	final static By ajaxDemo=By.xpath("//a[text()='Ajax Demo']");
	final static By radioYes=By.xpath("//input[@id='yes']");
	final static By radioNo=By.xpath("//input[@id='no']");
	final static By btnReset=By.xpath("//input[@value='Reset']");
	final static By btnCheck=By.xpath("//input[@value='Check']");
	final static By btnSubmit=By.xpath("//input[@value='Submit']");
	
	//p[contains(text(),'value is No')]
	//p[contains(text(),'value is Yes')]
	//p[contains(text(),'Radio button is Not checked')]
	
	//delete customer
	final static By custId=By.xpath("//input[@name='cusid']");
	final static By delCustLink=By.xpath("//a[text()='Delete Customer Form']");
	
	//tooltip demo
	final static By DownloadNow=By.xpath("//a[text()='Download now']");
	final static By toolTip=By.xpath("//a[text()='Tooltip']");

	//File Upload 
	final static By fileUpload=By.xpath("//a[text()='File Upload']");
	final static By browseFile=By.xpath("//input[@name='uploadfile_0']");
	final static By terms=By.xpath("//input[@name='terms']");
	final static By submitFile=By.xpath("//button[@id='submitbutton']");

	//Login
	final static By Login=By.xpath("//a[text()='Login']");
	final static By email=By.xpath("//input[@name='email']");
	final static By password=By.xpath("//input[@name='passwd']");
	final static By signIn=By.xpath("//button[@id='SubmitLogin']");
	final static By forgotPass=By.xpath("//a[contains(text(),'Forgot your password?')]");
}
