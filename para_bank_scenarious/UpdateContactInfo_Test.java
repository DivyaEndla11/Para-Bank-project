package para_bank_scenarious;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import para_bank.Login;
import para_bank.UpdateContactInfo;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class UpdateContactInfo_Test {
	
WebDriver driver;
	
	Properties prop;
	
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void initialize()
	{
		String configPropPath="C:\\Users\\Suresh\\Desktop\\ParaBank_Program\\ParaBank\\src\\test\\java\\Config\\config.properties";
		prop=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream(configPropPath);
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	
			
	}
@Test
public void updatecontinfo()
{
	Login login=new Login(driver);
	login.loginData();
	UpdateContactInfo update=new UpdateContactInfo(driver);
	update.openUpdateprofile();
	update.UpdateData();
	update.Updateprofile();
}
 
@AfterMethod
public void aftermethod()
{
	driver.quit();
}
}

  