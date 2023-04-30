package para_bank;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Config.ConfiguerPropertiesFile;

public class registerParabankAccount extends ConfiguerPropertiesFile {
	
	
	WebDriver driver;
	
	public registerParabankAccount(WebDriver driver) {
		this.driver=driver;
	}
	By register= By.cssSelector("p:nth-child(3) > a");
	By firstname1=By.id("customer.firstName");
	By Lastname1=By.id("customer.lastName");
	By address1=By.id("customer.address.street");
	By city1=By.id("customer.address.city");
	By state1=By.id("customer.address.state");
	By zipcode1=By.id("customer.address.zipCode");
	By phone1=By.id("customer.phoneNumber");
	By SSN1=By.id("customer.ssn");
	By Username1=By.id("customer.username");
	By Password1=By.id("customer.password");
	By confirm1=By.id("repeatedPassword");
	By reg_btn=By.xpath("//input[@value='Register']");
	
	
	public void registerAcc()
	{  
		try
		{
			driver.findElement(register).click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void registerData()
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
				driver.findElement(zipcode1).sendKeys(prop.getProperty("zipcode1"));
				driver.findElement(phone1).sendKeys(prop.getProperty("phone1"));
				driver.findElement(SSN1).sendKeys(prop.getProperty("SSN1"));
				driver.findElement(Username1).sendKeys(prop.getProperty("Username1"));
				driver.findElement(Password1).sendKeys(prop.getProperty("Password1"));
				driver.findElement(confirm1).sendKeys(prop.getProperty("confirm1"));
				driver.findElement(reg_btn).click();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
}

