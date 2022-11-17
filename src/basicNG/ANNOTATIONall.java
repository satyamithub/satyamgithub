package basicNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ANNOTATIONall {
	@BeforeSuite
	public void enterclass4()
	{
		System.out.println("enter class");
	}
	
	@AfterSuite
	public void exitclass5()
	{
		System.out.println("exit class");
	}
	@BeforeTest
	public void enterclass1()
	{
		System.out.println("enter class");
	}
	
	@AfterTest
	public void exitclass2()
	{
		System.out.println("exit class");
	}
	@BeforeClass
	public void enterclass()
	{
		System.out.println("enter class");
	}
	
	@AfterClass
	public void exitclass()
	{
		System.out.println("exit class");
	}
	@BeforeMethod
	public void entermethod()
	{
		System.out.println("open browser");
	}
	@AfterMethod
	public void exitmethod()
	{
		System.out.println("close browser");
	}
	
	@Test(priority=1)
	public void first()
	{
		System.out.println("firstly open");
	}
	
	@Test(priority=2)
	public void second()
	{
		System.out.println("fseconds close");
	}

}
