package para_bank;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Config.ConfiguerPropertiesFile;

public class FindTransactions extends ConfiguerPropertiesFile {
	
	WebDriver driver;
	
	public FindTransactions(WebDriver driver) {
		this.driver=driver;
	}

	By fndtranLink=By.xpath("//a[contains(text(),'Find Transactions')]");
	By FindbyTransactionID=By.id("criteria.transactionId");
	By FindbyDate=By.id("criteria.onDate");
	By IdBtn=By.cssSelector("div:nth-child(5) > .button");
	By dateBtn=By.cssSelector("div:nth-child(9) > .button");
	By FromDate=By.id("criteria.fromDate");
	By ToDate=By.id("criteria.toDate");
	By rangeBtn=By.cssSelector("div:nth-child(13) > .button");
	By FindbyAmount=By.id("criteria.amount");
	By amtBtn=By.cssSelector("div:nth-child(17) > .button");
	
	
	public void openfindtransaction()
	{
		try {
			driver.findElement(fndtranLink).click();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void FindByTransactionID()
	{
		String configPropPath="C:\\Users\\Suresh\\Desktop\\ParaBank_Program\\ParaBank\\src\\test\\java\\Config\\config.properties";
		Properties prop=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream(configPropPath);
			prop.load(fis);
			driver.findElement(fndtranLink).click();
			driver.findElement(FindbyTransactionID).sendKeys(prop.getProperty("ID"));
			driver.findElement(IdBtn).click();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void FindbyDate()
	{
		String configPropPath="C:\\Users\\Suresh\\Desktop\\ParaBank_Program\\ParaBank\\src\\test\\java\\Config\\config.properties";
		Properties prop=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream(configPropPath);
			prop.load(fis);
			driver.findElement(fndtranLink).click();
			driver.findElement(FindbyDate).sendKeys(prop.getProperty("Date"));
			driver.findElement(dateBtn).click();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void FindbyDateRange()
	{
		String configPropPath="C:\\Users\\Suresh\\Desktop\\ParaBank_Program\\ParaBank\\src\\test\\java\\Config\\config.properties";
		Properties prop=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream(configPropPath);
			prop.load(fis);
			driver.findElement(fndtranLink).click();
			driver.findElement(FromDate).sendKeys(prop.getProperty("FromD"));
			driver.findElement(ToDate).sendKeys(prop.getProperty("ToD"));
			driver.findElement(rangeBtn).click();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void FindbyAmount()
	{
		String configPropPath="C:\\Users\\Suresh\\Desktop\\ParaBank_Program\\ParaBank\\src\\test\\java\\Config\\config.properties";
		Properties prop=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream(configPropPath);
			prop.load(fis);
			driver.findElement(fndtranLink).click();
			driver.findElement(FindbyAmount).sendKeys(prop.getProperty("Amount"));
			driver.findElement(amtBtn).click();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}

