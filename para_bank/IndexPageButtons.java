package para_bank;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Config.ConfiguerPropertiesFile;

public class IndexPageButtons extends ConfiguerPropertiesFile{
	
	WebDriver driver;
	public IndexPageButtons(WebDriver driver)
	{
		this.driver=driver;
		
	}

	By home=By.cssSelector(".home > a");
	By about=By.cssSelector(".aboutus > a");
	By contact=By.cssSelector(".contact > a");
	By name=By.id("name");
	By EmailId=By.id("email");
	By phoneno=By.id("phone");
	By messg=By.id("message");
	By sendbtn=By.className("button");
	public void homeBtn()
	{
		try
		{
			driver.findElement(home).click();
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void aboutBtn()
	{
		try
		{
			driver.findElement(about).click();
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void contactBtn()
	{
		try
		{
			driver.findElement(contact).click();
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void contactMessage()
	{
		String configPropPath="C:\\Users\\Suresh\\Desktop\\ParaBank_Program\\ParaBank\\src\\test\\java\\Config\\config.properties";
		Properties prop=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream(configPropPath);
			prop.load(fis);
			
			driver.findElement(name).sendKeys(prop.getProperty("Name2"));
			driver.findElement(EmailId).sendKeys(prop.getProperty("EmailID2"));
			driver.findElement(phoneno).sendKeys(prop.getProperty("Phoneno2"));
			driver.findElement(messg).sendKeys(prop.getProperty("Message"));
			driver.findElement(sendbtn).click();
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
