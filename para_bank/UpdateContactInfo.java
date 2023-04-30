package para_bank;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Config.ConfiguerPropertiesFile;

public class UpdateContactInfo extends ConfiguerPropertiesFile {
	
	WebDriver driver;
	public UpdateContactInfo(WebDriver driver)
	{
		this.driver=driver;
	}
By updateLink=By.xpath("//a[contains(text(),'Update Contact Info')]");	
By firstname1=By.id("customer.firstName");
By Lastname1=By.id("customer.lastName");
By address1=By.id("customer.address.street");
By city1=By.id("customer.address.city");
By state1=By.id("customer.address.state");
By zipcode=By.id("customer.address.zipCode");
By phone=By.id("customer.phoneNumber");
By updateBtn=By.cssSelector(".button:nth-child(1)")	;

public void openUpdateprofile()
{
	try {
		driver.findElement(updateLink).click();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}

public void UpdateData()
{
	String configPropPath="C:\\Users\\Suresh\\Desktop\\ParaBank_Program\\ParaBank\\src\\test\\java\\Config\\config.properties";
	Properties prop=new Properties();
	
	try
	{
		FileInputStream fis=new FileInputStream(configPropPath);
		prop.load(fis);
		driver.findElement(firstname1).sendKeys(prop.getProperty("Firstname1"));
		driver.findElement(Lastname1).sendKeys(prop.getProperty("Lastname1"));
		driver.findElement(address1).sendKeys(prop.getProperty("address1"));
		driver.findElement(city1).sendKeys(prop.getProperty("city1"));
		driver.findElement(state1).sendKeys(prop.getProperty("state1"));
		driver.findElement(zipcode).sendKeys(prop.getProperty("zipcode"));
		driver.findElement(phone).sendKeys(prop.getProperty("phone"));
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}

public void Updateprofile()
{
	try {
		driver.findElement(updateBtn).click();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
