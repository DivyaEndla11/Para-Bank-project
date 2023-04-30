package para_bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAcc  {
	WebDriver driver;

	public OpenNewAcc(WebDriver driver) {
		this.driver=driver;
		
	}

	By openacc=By.xpath("//a[contains(text(),'Open New Account')]");
	By accType=By.xpath("//select[@id='type']");
	By selectaccType=By.xpath("//select[@id='type']");
	By openaccBtn=By.cssSelector(".button:nth-child(1)");
	public void opennewaccPage()
	{
		try {
			driver.findElement(openacc).click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void createAccount()
	{
		try {
			driver.findElement(accType).click();
			driver.findElement(selectaccType).click();
			WebElement dropdown=driver.findElement(selectaccType);
			dropdown.click();
			Select dropdown1=new Select(dropdown);
			System.out.println(dropdown.isDisplayed());
			dropdown1.selectByValue("1");
			driver.findElement(openaccBtn).click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
