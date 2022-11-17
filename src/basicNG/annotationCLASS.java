package basicNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class annotationCLASS {
	
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
	
	@Test
	public void login()
	{
		System.out.println("login in side age");
	}
	
	

}
