package para_bank;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Config.ConfiguerPropertiesFile;

public class ForgotLogInInfo extends ConfiguerPropertiesFile {
	
	WebDriver driver;

	public ForgotLogInInfo(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By forgotlogin=By.xpath("//div[@id='loginPanel']/p/a");
	By firstname=By.id("firstName");
	By Lastname=By.id("lastName");
	By address=By.id("address.street");
	By city=By.id("address.city");
	By state=By.id("address.state");
	By zipcode=By.id("address.zipCode");
	By SSN=By.id("ssn");
	By findLogInfoBtn=By.xpath("//input[@value='Find My Login Info']");
	
	public void openlookupPage()
	{
		try
		{
			driver.findElement(forgotlogin).click();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void dataentry()
	{
		String configPropPath="C:\\Users\\Suresh\\Desktop\\ParaBank_Program\\ParaBank\\src\\test\\java\\Config\\config.properties";
		Properties prop=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream(configPropPath);
			prop.load(fis);
			
			driver.findElement(firstname).sendKeys(prop.getProperty("Firstname1"));
			driver.findElement(Lastname).sendKeys(prop.getProperty("Lastname1"));
			driver.findElement(address).sendKeys(prop.getProperty("address1"));
			driver.findElement(city).sendKeys(prop.getProperty("city1"));
			driver.findElement(state).sendKeys(prop.getProperty("state1"));
			driver.findElement(zipcode).sendKeys(prop.getProperty("zipcode1"));
			driver.findElement(SSN).sendKeys(prop.getProperty("SSN1"));
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void findLogInfo()
	{
		try {
			driver.findElement(findLogInfoBtn).click();;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

