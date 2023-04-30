package para_bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Config.ConfiguerPropertiesFile;

public class AccountOverview extends ConfiguerPropertiesFile {
	
	WebDriver driver;
	
	public AccountOverview(WebDriver driver) {
		this.driver=driver;
	}

	By overviewLink=By.xpath("//a[contains(text(),'Accounts Overview')]");
	By Overview=By.cssSelector("td:nth-child(1) > .ng-binding");
	By month=By.id("month");
	By type=By.id("transactionType");
	By gobtn=By.xpath("//input[@value='Go']");
	
	public void OpenAccOverview() {
		try {
			driver.findElement(overviewLink);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void OverviewAccInfo()
	{
		try
		{
			driver.findElement(Overview).click();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void checkTransaction()
	{
		try
		{
			driver.findElement(month).click();;
			WebElement dropdown=driver.findElement(month);
			dropdown.click();
			Select dropdown1=new Select(dropdown);
			System.out.println(dropdown.isDisplayed());
			dropdown1.selectByValue("April");
			
			driver.findElement(type).click();
			WebElement dropdown2=driver.findElement(type);
			dropdown2.click();
			Select drop2=new Select(dropdown2);
			System.out.println(dropdown2.isDisplayed());
			drop2.selectByValue("Credit");
			
			driver.findElement(gobtn).click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
