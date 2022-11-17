package Groping;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GROUPING2 {
	@BeforeClass
	public void browseron()
	{
		System.out.println("browser start");
	}
	@AfterClass
	public void browseroff()
	{
		System.out.println("browser close");
	}
	
	@Test(groups="smoke")
	public void testcase4()
	{
		System.out.println("login");
	}

	@Test(groups="functional")
	public void testcase5()
	{
		System.out.println("upload profile pic");
		
	}
	
	@Test(groups={"functional","regression"})
	public void testcase6()
	{
		System.out.println("logout");
	}

}
