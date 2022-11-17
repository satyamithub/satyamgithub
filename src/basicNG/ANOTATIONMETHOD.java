package basicNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ANOTATIONMETHOD {
	
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
	public void login()
	{
		System.out.println("login facebook");
	}
	@Test(priority=2)
	public void logout()
	{
		System.out.println("logout");
	}
	

}
