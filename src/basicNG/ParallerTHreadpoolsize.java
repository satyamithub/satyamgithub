package basicNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//threadPoolSize = 2
public class ParallerTHreadpoolsize {
	@Test (invocationCount = 5,threadPoolSize = 5)
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Toshiba\\Desktop\\testing jar\\chromedriver_win32( 105)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}}
