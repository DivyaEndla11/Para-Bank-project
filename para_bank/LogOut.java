package para_bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Config.ConfiguerPropertiesFile;

public class LogOut extends ConfiguerPropertiesFile {
	
	WebDriver driver;
	
	public LogOut(WebDriver driver)
	{
		this.driver=driver;
	}
By logout=By.xpath("//a[contains(text(),'Log Out')]");

public void logout()
{
	try
	{
		driver.findElement(logout).click();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
