package TestScript;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PracticeTest {

	@Test
	public void cokkiesTest() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Amit.Rai\\Desktop\\BDD_TEST\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://restservicestesting.blogspot.in/");
		Set<Cookie> ck= driver.manage().getCookies();
		
		System.out.println(ck);

	}
	
	@Test
	public void listToArray() {
		List<String> fruitList = new ArrayList<String>();  
        //adding String Objects to fruitsList ArrayList  
        fruitList.add("Mango");  
        fruitList.add("Banana");  
        fruitList.add("Apple");  
        fruitList.add("Strawberry");  
        fruitList.add("Pineapple");  
        System.out.println("Converting ArrayList to Array" );  
        
        String []arr= fruitList.toArray(new String[fruitList.size()]); 
        
        for(String str: arr)
        {
        	System.out.println("element is "+str);
        }
        
        System.out.println("Converting Array to ArrayList" );  
        List<String>l2 = new ArrayList<String>();  
        l2 =  Arrays.asList(arr);  
        System.out.println(l2);  
	}
	
	@Test
	public void mapTest()
	{
		Map<Integer, String> mp= new HashMap<Integer, String>(); 
		mp.put(2020, "Covid 2020");
		mp.put(2021, "Covid 2021");
		
		System.out.println("Map data is --"+mp);
		
		Set<Integer> keys= mp.keySet();
		
		System.out.println("Key is Map  are----"+keys);
		
		Set<Entry<Integer,String>> entries= mp.entrySet();
		
		System.out.println("Entry in Map is ---"+entries);
		
		Iterator itr= entries.iterator();
		
		while (itr.hasNext())
		{
			Map.Entry<Integer, String> ent= (Map.Entry<Integer, String>)itr.next();
			
			System.out.println("Key is -"+ent.getKey()+"and value is --"+ent.getValue());
		}
	}

}


