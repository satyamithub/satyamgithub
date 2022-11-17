package basicNG;

import org.testng.annotations.Test;

public class ng {
	
			@Test(priority = 1)
			public void login()
			{
				System.out.println("login");
			}
			
			@Test(priority = 2)
			public void pass()
			{
				System.out.println("enter password");
			}
			
			@Test(priority = 3)
			public void loginclick()
			{
				System.out.println("login click");
			}

		
		
	

}
