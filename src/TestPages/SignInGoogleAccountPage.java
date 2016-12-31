package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SignInGoogleAccountPage extends BasePage {
	
	
	
	public SignInGoogleAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id='Email']")
	public WebElement userName;
	
	

	@FindBy(xpath="//*[@id='next']")
	public WebElement nextButton;
	

	public WebElement getuserName(){
		return userName;
	}
	
	public WebElement getnextButton(){
		return nextButton;
	}
	
	
	
	
	

}
