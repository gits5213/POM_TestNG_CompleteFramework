package TestCases;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import Global.ObjectRepo;
import TestPages.SignInLandingPage;


public class SearchTest extends BaseTest {
	
	@Test
	public void searchTest() throws FindFailed{
	String baseDIRPath = System.getProperty("user.dir");	
	
	
	
	
	
	
	
	SignInLandingPage signInHomePage = new SignInLandingPage(driver);
	signInHomePage.gethelpLink().click();
	sleepTest(1000);
	
	signInHomePage.searchInputBox.sendKeys(ObjectRepo.searchSong);
	sleepTest(2000);
	//signInHomePage.firstList.click();
	//sleepTest(2000);
	
	signInHomePage.watchVideo.click();
	sleepTest(1000);
	
	Screen screen = new Screen();
	Pattern img1 = new Pattern(baseDIRPath + "//images//PlayVideo.PNG");
	screen.click(img1);
	
	
	
	
	
	
	}

}
