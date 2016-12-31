package TestCases;
import java.io.IOException;
import org.testng.annotations.Test;
import Global.Data_Provider;
import TestPages.GoogleLandingPage;
import TestPages.SignInGoogleAccountPage;
public class GmailLogIn extends BaseTest {
	
	@Test(dataProviderClass = Data_Provider.class, dataProvider="LogInTest")
	public void logIn(String username) throws IOException{

		GoogleLandingPage googleLandingpage = new GoogleLandingPage(driver);
		googleLandingpage.getsignInButton().click();
		sleepTest(2000);
		
		SignInGoogleAccountPage signAccountPage = new SignInGoogleAccountPage(driver);
		signAccountPage.getuserName().sendKeys(username);
		sleepTest(100000);

		
		signAccountPage.getnextButton().click();
		sleepTest(2000);
		

	} 
	@Test
	public void logout(){
		System.out.println("system logged out");
	}
}
