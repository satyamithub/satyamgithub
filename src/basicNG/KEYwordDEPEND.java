package basicNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KEYwordDEPEND {
	
	
	@Test(priority=1)
	public void dad1()
	{
		System.out.println("dad");
		//Assert.assertTrue(false);
	}
	
	
	 @Test(dependsOnMethods ="dad1")
	 public void mom2()
	 {
		 System.out.println("mommom");
	 }

}
