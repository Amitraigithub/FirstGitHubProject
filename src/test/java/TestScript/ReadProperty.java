package TestScript;

import org.testng.annotations.Test;

public class ReadProperty {
	
	@Test
	public void readFromProperty()
	{
		String str= System.getProperty("User.dir");
		
		System.out.println(str);
	}

}
