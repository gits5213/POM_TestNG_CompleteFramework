package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInLandingPage  extends BasePage{

	public SignInLandingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id='nav-link-help']")
	public WebElement helpLink;
	
	@FindBy(xpath="//*[@id='search']")
	public WebElement searchInputBox;
	
	@FindBy(xpath="//*[@id='login-username']")
	public WebElement searchIcon;
	
	@FindBy(xpath="//a[contains(.,'Play a Song')]")
	public WebElement firstList;
	
	@FindBy(xpath="//a[contains(@data-ga-event-label,'Listen Offline')]")
	public WebElement watchVideo;
	
	
	
	
	public WebElement gethelpLink(){
		return helpLink;
	}
	public WebElement getsearchInputBox(){
		return searchInputBox;
	}
	public WebElement getsearchIcon(){
		return searchIcon;
	}
	public WebElement getfirstList(){
		return firstList;
	}
	public WebElement getwatchVideo(){
		return watchVideo;
	}

}
