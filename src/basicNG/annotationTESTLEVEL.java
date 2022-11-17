package basicNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotationTESTLEVEL {
	@BeforeTest
	public void enterclass()
	{
		System.out.println("enter class");
	}
	
	@AfterTest
	public void exitclass()
	{
		System.out.println("exit class");
	}
	
	@Test
	public void login()
	{
		System.out.println("login in side age");
	}
	
	

}
