package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

	public SignInPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id='login-username']")
	public WebElement usernameInputBox;
	
	@FindBy(xpath="//*[@id='login-password']")
	public WebElement loginPassword;
	
	
	@FindBy(xpath="//button[contains(.,'Log In')]")
	public WebElement log_In;
		
	public WebElement getusernameInputBox(){
		return usernameInputBox;
	}
	
	public WebElement getlog_In(){
		return log_In;
	}
	
	public WebElement getloginPassword(){
		return loginPassword;
	}
	
	
	
	

}
