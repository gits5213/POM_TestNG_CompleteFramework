package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpotifyLandingPage extends BasePage {
	
	
	public SpotifyLandingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id='nav-link-sign-up']")
	public WebElement signUpLink;
	
	public WebElement getsignUpLink(){
		return signUpLink;
	}
	
	
	
	
	
	
	
	
	
	
	

}
