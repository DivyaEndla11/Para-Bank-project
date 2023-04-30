package para_bank_scenarious;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import para_bank.FindTransactions;
import para_bank.Login;

public class FindTransactions_Test {
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
public void findTransaction() throws Exception
{
	Login login=new Login(driver);
	login.loginData();
	FindTransactions find=new FindTransactions(driver);
	find.openfindtransaction();
	Thread.sleep(10000);
	find.FindByTransactionID();
	find.FindbyDate();
	find.FindbyDateRange();
	find.FindbyAmount();
}
 
@AfterMethod
public void aftermethod()
{
	driver.quit();
}
}
  