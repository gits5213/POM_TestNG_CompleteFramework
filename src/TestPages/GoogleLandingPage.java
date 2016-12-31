package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleLandingPage extends BasePage {
	
	
	public GoogleLandingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id='gb_70']")
	public WebElement signInButton;
	
	public WebElement getsignInButton(){
		return signInButton;
	}
	
	
	
	
	
	
	
	
	
	
	

}
