package assertion;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class asserttttt {
	
	// AssertEquals
	
    @Test
	public void Test1()
	{
		String a="hello";
		String b="hello";
		Assert.assertEquals(a, b);
	}

    @Test
  	public void Test2()
  	{
  		String a="hello";
  		String b="hell";
  		Assert.assertNotEquals(a, b);
  	}
    
    @Test
    public void Test3()
    {
    	String a=null;
    	Assert.assertNull(a);
    }
    
    @Test
    public void test3()
    {
    	String a="satyam";
    	Assert.assertNotNull(a);
    }
    
    @Test
    public void test4()
    {
    	String a="satyam";
    	Assert.assertNotNull(a, "dj");
    }
    
    @Test
    public void test5()
    {
    	String a="satyam";
    	Assert.fail();
    }

}
