package expection;

public class TRYCATCHFINALLY {
	public static void main(String[] args) {
		
	
	int a=10;
	
	try
	{
		System.out.println(a/0);
	}
//	catch(ArithmeticException e)
//	{
//	System.out.println(a/10);
//	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	finally
	{
		System.out.println("method completed");
	}
}
}