package basicNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotationSUITLEVEL {
	@BeforeSuite
	public void enterclass()
	{
		System.out.println("enter class");
	}
	
	@AfterSuite
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
