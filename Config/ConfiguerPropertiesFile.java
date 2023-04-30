package Config;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfiguerPropertiesFile {
	public static WebDriver driver;
public static Properties prop;
public void initialize()
{
	FirefoxOptions options=new FirefoxOptions();
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver(options);
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
}

public void tearDown()
{
		driver.quit();
	
}
public void readPropertyFile()
{
	String configPropPath="C:\\Users\\Suresh\\Desktop\\ParaBank_Program\\ParaBank\\src\\test\\java\\Config\\config.properties";
	prop=new Properties();
	
	try
	{
		FileInputStream fis=new FileInputStream(configPropPath);
		prop.load(fis);
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}


}
