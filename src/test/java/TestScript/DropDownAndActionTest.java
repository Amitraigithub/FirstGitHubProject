package TestScript;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownAndActionTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void brosweLaunch()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Amit.Rai\\Desktop\\AutomationTest\\Driver\\geckodriver.exe");
	    driver=new FirefoxDriver();
	}
	
	@Test
	public void dropdnCheck()
	{
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		
		WebElement drop= driver.findElement(By.id("select-demo"));
		
		Select sel= new Select(drop);
		
		List<WebElement> allOpts = sel.getOptions();
		
		for (int i=1; i<allOpts.size();i++)
		{
			String drpdnValues=allOpts.get(i).getText();
			System.out.println(drpdnValues);
		}
		
//		sel.selectByVisibleText("Sunday");
//		
//		System.out.println(sel.getFirstSelectedOption().getText());
		
		driver.quit();
	}
	
	@Test
	public void actionCheck()
	{
		
		Actions act=new Actions(driver);
		
		
	}
	
	@Test
	public void collectionTest()
	{
		ArrayList al= new ArrayList();
		al.add("A");
		al.add("B");
		al.add("c");
		al.add("B");
		
		System.out.println("Arraylist element are--"+ al);
		
		HashSet hs=new HashSet(al);
		
		System.out.println("After removing Duplicate element--- "+ hs);
	}

}
