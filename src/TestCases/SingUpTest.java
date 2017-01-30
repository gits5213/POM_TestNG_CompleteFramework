package TestCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Global.ObjectRepo;
import TestPages.SignUpPage;
import TestPages.SpotifyLandingPage;

public class SingUpTest extends BaseTest {

	@Test
	public void signUp(){  
		
		SpotifyLandingPage spotifyLandingpage = new SpotifyLandingPage(driver);
		spotifyLandingpage.signUpLink.click();
		sleepTest(1000);
		
		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.getusername().sendKeys(ObjectRepo.userName);
		signUpPage.getpassword().sendKeys(ObjectRepo.passWord);
		signUpPage.getemail().sendKeys(ObjectRepo.eamil);
		signUpPage.getconfirmEmail().sendKeys(ObjectRepo.conEmail);
		
		Select dobMonth = new Select (signUpPage.getdobMonth());
		dobMonth.selectByIndex(1);
		
		signUpPage.getdobDay().sendKeys(ObjectRepo.day);
		signUpPage.getdobYear().sendKeys(ObjectRepo.year);
		signUpPage.getmale().click();
		signUpPage.getsign_Up().click();
		
		sleepTest(1000);
		
	}

}
