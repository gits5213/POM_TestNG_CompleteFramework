package TestCases;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import Global.Data_Provider;
import Global.ObjectRepo;
import TestPages.SignInLandingPage;
import TestPages.SignInPage;

public class SignInTest extends BaseTest {
	
	@Test(dataProviderClass = Data_Provider.class, dataProvider="spotifySignIn")
	public void signIn(String username, String password) throws FindFailed{
		
		SignInPage signInPage=new SignInPage(driver);
		signInPage.usernameInputBox.isEnabled();
		signInPage.usernameInputBox.sendKeys(username);
		sleepTest(1000);
		
		signInPage.getloginPassword().isEnabled();
		signInPage.getloginPassword().sendKeys(password);
		sleepTest(1000);
		
	
		if (signInPage.getlog_In().isEnabled()){
			signInPage.getlog_In().click();
		}else{
			System.out.println("LogIn button is disable");
		}
		
		sleepTest(5000);
		
		String baseDIRPath = System.getProperty("user.dir");	
		
		
		SignInLandingPage signInHomePage = new SignInLandingPage(driver);
		signInHomePage.gethelpLink().click();
		sleepTest(1000);
		
		if(signInHomePage.searchInputBox.isEnabled()){
		signInHomePage.searchInputBox.sendKeys(ObjectRepo.searchSong);
		}else{
			System.out.println("Search Input box is disable");
		}
		sleepTest(2000);
		
		signInHomePage.watchVideo.click();
		sleepTest(1000);
		
		Screen screen = new Screen();
		Pattern img1 = new Pattern(baseDIRPath + "//images//PlayVideo.PNG");
		screen.click(img1);
		
		sleepTest(5000);
		
	}

}
