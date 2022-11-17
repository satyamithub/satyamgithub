package vefification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class verify {

	WebDriver driver;
	    @Parameters("browser")
		@Test(priority=1)
		public void crossbrowsing(String browser)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Toshiba\\Desktop\\testing jar\\chromedriver_win32( 105)\\chromedriver.exe");
			    driver=new ChromeDriver();
				
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Toshiba\\Desktop\\testing jar\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			    driver=new FirefoxDriver();
			}
			else
			{
				System.out.println("wrong selected browser name");
			}
			
		    driver.get("\"https://www.facebook.com/");
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 }
		
		@Test(priority=2)
		public void verfycurrenturl()
		{
			String url = driver.getCurrentUrl();
			Assert.assertEquals(url,"https://www.facebook.com/");
		}
		
		@Test(priority=3)
		public void verifytitle()
		{
			String title = driver.getTitle();
			Assert.assertEquals(title,"Facebook – log in or sign up");
		}
		
		@Test(priority=4)
		public void  VerifyUserNameField()
		{
			 WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
			 Assert.assertTrue(username.isDisplayed());
			 username.sendKeys("satyam");
			 
		}
		
		@Test(priority=5)
		public void VerifyPasswordField() {
			 WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
			 Assert.assertTrue(password.isDisplayed());
			 password.sendKeys("satyam@123");
		}
		
		@Test(priority=6)
		public void ClickLoginButton() {
			 WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
			 Assert.assertTrue(loginbtn.isEnabled());
			 loginbtn.click();
		}
		
		
		
		
		
		
		
		
	}


