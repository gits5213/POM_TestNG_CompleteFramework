package TestCases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
public class BaseTest {
	public WebDriver driver;
	public static final String project_URL = "http://www.google.com";
	@BeforeClass
	public void beforeClass(){
		String baseDIRPath = System.getProperty("user.dir");
		String FirefoxServerPath = baseDIRPath + "\\lib\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FirefoxServerPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void beforeMethod(){
	driver.get(project_URL);
	//open up the Firefox Browser
	System.out.println(driver.getCurrentUrl());
	driver.getTitle();
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
		
	}	}	}
