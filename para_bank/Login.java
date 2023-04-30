package para_bank;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Config.ConfiguerPropertiesFile;

public class Login extends ConfiguerPropertiesFile {
	
	WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}

	
	By username=By.name("username");
	By password=By.name("password");
	By login_btn=By.cssSelector(".login > .button");
	
	public void loginData()
	{
		
		String configPropPath="C:\\Users\\Suresh\\Desktop\\ParaBank_Program\\ParaBank\\src\\test\\java\\Config\\config.properties";
		Properties prop=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream(configPropPath);
			prop.load(fis);
			
			driver.findElement(username).sendKeys(prop.getProperty("Username1"));
			driver.findElement(password).sendKeys(prop.getProperty("Password1"));
			driver.findElement(login_btn).click();
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
