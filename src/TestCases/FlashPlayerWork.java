package TestCases;

import org.testng.annotations.Test;



public class FlashPlayerWork extends BaseTest {

	@Test
	public void flashPlayerWork(){
		
		FlashWebDriver player = new FlashWebDriver(driver,"movie_player");
		sleepTest(5000);

		player.call("pauseVideo");
		sleepTest(5000);
		player.call("playVideo");
		sleepTest(5000);
		player.call("seekTo", "70","playVideo");
		sleepTest(5000);
		player.call("mute");
		sleepTest(5000);
		player.call("unMute");
		
		
		driver.close();
		driver.quit();
		

	}

}
