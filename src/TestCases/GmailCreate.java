package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailCreate extends BaseTest{
	@Test
	public void logInCreate() throws InterruptedException{
			
		// click on sign in button
		WebElement SignInButton = driver.findElement(By.xpath("//*[@id='gb_70']"));
		SignInButton.click();
		Thread.sleep(2000);
				
		WebElement pageTitle = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h1"));
		System.out.println(pageTitle.getText());
		String title = pageTitle.getText();
		Assert.assertEquals("One account. All of Google.", title);
		
		
		//user click on create account link
		WebElement ClickOnCreateAccountLink = driver.findElement(By.xpath("//*[@id='link-signup']/a"));
		ClickOnCreateAccountLink.click();
		Thread.sleep(2000);
	}
		@Test
		public void loginCreateDone(){
			System.out.println("account create is done");
			//code will goes here
		}
	}

