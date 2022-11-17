package pommmm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class pom {
	
	@FindBy(xpath="//img[@alt='Facebook']") private WebElement reg_logo;
	@FindBy(xpath="//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy(xpath="//a[@title='Sign up for Facebook']") private WebElement signuplink;
	@FindBy(name="firstname") private WebElement firstname;
	@FindBy(name="lastname") private WebElement surname;
	@FindBy(name="reg_email__") private WebElement mob_email;
	@FindBy(xpath="//input[@type='password']") private WebElement password;;
	@FindBy(name="birthday_day") private WebElement birthdate;
	@FindBy(name="birthday_month") private WebElement birthmonth;
	@FindBy(name="birthday_year") private WebElement birthyear;
	@FindBy(xpath="//input[@value='2']") private WebElement gender_male;
	@FindBy(xpath="//input[@value='1']") private WebElement gender_female;
	@FindBy(name="websubmit") private WebElement submitbtn;
	
	
	/// initilation
	
	public  pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickFacebookSignup() {
		signuplink.click();
	}
	
	public void VerifyFacebookRegistrationPageFblogo() {
		Assert.assertTrue(reg_logo.isDisplayed(),"The facebook logo on registration page is  displayed or not");
	}
	
	public void VerifyFacebookRegistrationPageAlreadyAccount() {
		Assert.assertTrue(already_acc.isDisplayed(),"The already having an account option on registration page is not displayed");
		Assert.assertEquals(already_acc.getText(), "Already have an account?");
		Assert.assertTrue(already_acc.isEnabled(), "check wheather element is passive/or active ");
	}
	
	public void SetFacebookRegistrationPageFirstname(String fn) {
		firstname.sendKeys(fn);
	}
	
	public void SetFacebookRegistrationPageLastname() {
		surname.sendKeys("XYZ");
	}
	
	public void SetFacebookRegistrationPageMobileEmail() {
		mob_email.sendKeys("test123@gmail.com");
	}
	
	public void SetFacebookRegistrationPagePassword() {
		password.sendKeys("ABC^YTYEOP1253");
	}
	
	public void SetFacebookRegistrationPageBirthDay() {
		Select bday = new Select(birthdate);
		Assert.assertTrue(birthdate.isDisplayed(), "Birth day drop down is not avialable on the website.");
		Assert.assertFalse(birthdate.isSelected(), "The birth date is selected initially");
		bday.selectByVisibleText("19");
	}
	
	public void SetFacebookRegistrationPageBirthMonth() {
		Select bmonth = new Select(birthmonth);
		Assert.assertTrue(birthmonth.isDisplayed(), "Birth month drop down is not avialable on the website.");
		Assert.assertFalse(birthmonth.isSelected(), "The birth month is selected initially");
		bmonth.selectByVisibleText("Mar");
	}
	
	public void SetFacebookRegistrationPageBirthYear() {
		Select byear = new Select(birthyear);
		Assert.assertTrue(birthyear.isDisplayed(), "Birth year drop down is not avialable on the website.");
		Assert.assertFalse(birthyear.isSelected(), "The birth year is selected initially");
		byear.selectByVisibleText("1975");
	}
	
    public void SetFacebookRegistrationPageGender(String gender) {
		
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if (gender.equalsIgnoreCase("female")){
				gender_female.click();
			 }
		else {
			System.out.println("Please select valid input");
		}
		
	}
	
	public void ClickFacebookRegistrationPageSubmitBtn() {
		submitbtn.click();
	}
		
	}
	
	
	
	
	

	


