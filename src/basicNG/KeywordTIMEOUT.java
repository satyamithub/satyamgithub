package basicNG;

import org.testng.annotations.Test;

public class KeywordTIMEOUT {
	@Test
	public void one()
	{
		System.out.println("one");
	}
	@Test
	public void two()
	{
		System.out.println("two");
	}
	@Test(timeOut=5000)
	public void three()
	{
		System.out.println("three");
	}
	@Test(enabled=false)
	public void four()
	{
		System.out.println("four");
	}
	

}
