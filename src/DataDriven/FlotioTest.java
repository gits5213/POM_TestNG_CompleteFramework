package DataDriven;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FlotioTest {

	public static void main(String[] args) throws InterruptedException {
		
		String baseDirPa = System.getProperty("user.dir");
		String chromePath= baseDirPa + "\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://challengers.flood.io/start");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        // Step-1 (Start button)
		WebElement Start = driver.findElement(By.name("commit"));
		Start.click();
		
		Thread.sleep(1000);
		//Step-2 (select the age and put into the drop-down box)
		Select dropdownList = new Select(driver.findElement(By.id("challenger_age")));
		dropdownList.selectByVisibleText("30");
		
		/*//(Extract the List of age)
		List<WebElement> DropdownList = driver.findElements(By.tagName("option"));
		System.out.println(DropdownList.size());
		for (int i=0; i<=DropdownList.size(); i++){
			System.out.println(DropdownList.get(i).getAttribute("value"));*/
				
        //Click on Next Button
		WebElement ClickOnNext = driver.findElement(By.xpath("//*[@id='new_challenger']/input[3]"));
		ClickOnNext.click();
		
		Thread.sleep(1000);
		//Step-3 (Please select and enter the largest order value below)
		List<WebElement> radio = driver.findElements(By.className("collection_radio_buttons"));	// List of Radio Button	
		System.out.println(radio.size());    //How many of the radio button
		
		Thread.sleep(1000);
		List<Integer> list = new ArrayList<>();		
		for(WebElement radioOptions: radio){		
			list.add(Integer.parseInt(radioOptions.getText()));
			System.out.println(radioOptions.getText());
		}	
		System.out.println("-----Now printing from new list----");
		Collections.sort(list);                   //Sorting Ascending  order
		Collections.reverse(list);		           	//Sorting Descending  order
		for(int x=0; x<list.size(); x++){			
			System.out.println(list.get(x));	    // printing the All values related radio button
		}		
		System.out.println("Highest value is  : "+list.get(0));	  ////Printing the highest value
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='"+list.get(0)+"']")).click();  ////Selecting the Radio Button
		
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//*[@id='challenger_largest_order']"));  
		element.sendKeys(Integer.toString(list.get(0)));     //typing the largest value into the input box
		
		Thread.sleep(1000);
		//Click On Next Button
		WebElement ClickOnNext1 = driver.findElement(By.name("commit"));
		ClickOnNext1.click();
		
		Thread.sleep(1000);
		//Step-4 (Click On Next Button) 
	    driver.findElement(By.name("commit")).click();
		
	    Thread.sleep(1000);
	    //Step-5 (Please enter your one time token above)
	    WebElement OneTimeToken = driver.findElement(By.xpath("//*[@id='new_challenger']/h4/span[2]"));
	    String Number = OneTimeToken.getText();
	    System.out.println(Number);
	    
	    Thread.sleep(1000);
	     driver.findElement(By.id("challenger_one_time_token")).clear();
	     WebElement TypeOneTimeTokenNumber = driver.findElement(By.id("challenger_one_time_token"));
	     TypeOneTimeTokenNumber.sendKeys(Number);
	    			    
	     Thread.sleep(1000);
	    //Click On Next Button
	    WebElement ClickNext = driver.findElement(By.name("commit"));
	    ClickNext.click();
	    
	    Thread.sleep(1000);
	    WebElement YouAreDone = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div/h2"));
	    String Confirm = YouAreDone.getText(); System.out.println(Confirm);
	    Assert.assertEquals("You're Done!", Confirm);
	    System.out.println("Automation Test Is Successfull!");
	    
	    
	    Thread.sleep(1000);
	    driver.quit();
		
		}
	}


	


