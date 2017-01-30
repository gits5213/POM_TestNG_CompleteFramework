package TestCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Global.ObjectRepo;
public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		String baseDIRPath = System.getProperty("user.dir");
		String FirefoxServerPath = baseDIRPath + "\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", FirefoxServerPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	
	@BeforeMethod
	public void beforeMethod(){
	//driver.get(ObjectRepo.spotifyLandigUrl);
	//driver.get(ObjectRepo.youTubeUrl);
	driver.get(ObjectRepo.spotifyLoginUrl);  
	System.out.println(driver.getCurrentUrl());
	driver.getTitle();
	
	//Sign In page validation
	String URL = driver.getCurrentUrl();
	Assert.assertEquals(URL, ObjectRepo.spotifyLoginUrl, "This is login page!" );
	
	
	}
	
	@AfterMethod
	public void afterTest(){
		System.out.println("Method is passing");
	}
	
	@AfterClass
	public void afterClass(){
		driver.quit();
		
	}
	
	public static void sleepTest(long sleeptime){
		try{Thread.sleep(sleeptime);
	}catch (Exception e){
		
			}
		}	
	}
