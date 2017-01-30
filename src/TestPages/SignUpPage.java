package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

	public SignUpPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id='register-username']")
	public WebElement username;
	
	@FindBy(xpath="//*[@id='register-password']")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='register-email']")
	public WebElement email;
	
	@FindBy(xpath="//*[@id='register-confirm-email']")
	public WebElement confirmEmail;
	
	@FindBy(xpath="//*[@id='register-dob-month']")
	public WebElement dobMonth;
	
	@FindBy(xpath="//*[@id='register-dob-day']")
	public WebElement dobDay;
	
	@FindBy(xpath="//*[@id='register-dob-year']")
	public WebElement dobYear;
	
	@FindBy(xpath="//*[@id='register-male']")
	public WebElement male;
	
	@FindBy(xpath="//*[@id='register-button-email-submit']")
	public WebElement sign_Up;
	
	public WebElement getusername(){
		return username;
	}
	
	public WebElement getpassword(){
		return password;
	}
	
	public WebElement getemail(){
		return email;
	}
	
	public WebElement getconfirmEmail(){
		return confirmEmail;
	}
	
	public WebElement getdobMonth(){
		return dobMonth;
	}
	
	public WebElement getdobDay(){
		return dobDay;
	}
	
	public WebElement getdobYear(){
		return dobYear;
	}
	
	public WebElement getmale(){
		return male;
	}
	
	public WebElement getsign_Up(){
		return sign_Up;
	}

}
