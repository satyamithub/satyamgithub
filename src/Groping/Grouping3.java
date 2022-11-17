package Groping;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Grouping3 {
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
	public void testcase7()
	{
		System.out.println("login");
	}

	@Test(groups="functional")
	public void testcase8()
	{
		System.out.println("upload profile pic");
		
	}
	
	@Test(groups={"functional","regression"})
	public void testcase9()
	{
		System.out.println("logout");
	}

}
