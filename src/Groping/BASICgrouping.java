package Groping;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BASICgrouping {
	
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
	public void testcase1()
	{
		System.out.println("login");
	}

	@Test(groups="functional")
	public void testcase2()
	{
		System.out.println("upload profile pic");
		
	}
	
	@Test(groups={"functional","regression"})
	public void testcase3()
	{
		System.out.println("logout");
	}
}
