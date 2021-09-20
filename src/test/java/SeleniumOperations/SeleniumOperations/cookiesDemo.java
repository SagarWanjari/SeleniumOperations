package SeleniumOperations.SeleniumOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

public class cookiesDemo extends BaseClass {

	@Test
	public void cookieDemo() throws InterruptedException {
		driver.findElement(locators.cookiesDemo).click();
		driver.findElement(locators.username).sendKeys("admin");
		driver.findElement(locators.passwd).sendKeys("admin");
		driver.findElement(locators.submitButton).click();
		Thread.sleep(3000);

		File file = new File("Cookies.data");

		try {
			file.delete();
			file.createNewFile();
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for (Cookie ck : driver.manage().getCookies()) {
				bw.write(ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure());
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
