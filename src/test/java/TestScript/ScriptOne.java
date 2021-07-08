package TestScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

@Listeners (ListnersClass.ClassListners.class)
public class ScriptOne {
	
	@Test(dataProvider="data")
	public void runScript(String inputData) throws IOException
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Amit.Rai\\Desktop\\AutomationTest\\Driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://translate.google.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@class='er8xn']")).sendKeys(inputData);
		
		//Take screen shot
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		getScreenshot(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		System.out.println("URL is --"+ driver.getCurrentUrl());
		System.out.println("Title of Page is --"+ driver.getTitle());
		driver.close();
	}
	
	@DataProvider(name="data")
	public Object[][] getData()
	{
		return new Object[][]{{"Living"}};
	}
	
	public void getScreenshot(WebDriver driver) throws IOException
	{
		String img= "image";
		int n=1;
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File ("C:\\Users\\Amit.Rai\\Desktop\\AutomationTest\\ScreenShot\\"+img+n+".png");
		
		FileUtils.copyFile(src, dest);
		n++;
	}
	
	

}
