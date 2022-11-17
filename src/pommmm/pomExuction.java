package pommmm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class pomExuction {
	WebDriver driver;
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Toshiba\\Desktop\\testing jar\\chromedriver_win32( 105)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@AfterClass
	public void quit()
	{
		//driver.quit();
	}
	
	@Test
	public void verifyFacebook() {
		pom p=new pom(driver);
	    p.clickFacebookSignup();
	    p.VerifyFacebookRegistrationPageFblogo();
	    p.VerifyFacebookRegistrationPageAlreadyAccount();
	    p.SetFacebookRegistrationPageLastname();
	    p.SetFacebookRegistrationPageFirstname("satyam");
	    p.SetFacebookRegistrationPageMobileEmail();
	    p.SetFacebookRegistrationPageMobileEmail();
	    p.SetFacebookRegistrationPageBirthDay();
	    p.SetFacebookRegistrationPageBirthMonth();
	    p.SetFacebookRegistrationPageBirthYear();
	    p.SetFacebookRegistrationPageGender("male");
	    
	}

}
