package Global;
import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;
public class Data_Provider {
	
	@DataProvider(name="spotifySignIn")
	public static Object[][] getData(Method m){
		Object[][] data = null;   
		if(m.getName().equals("signIn")){	
			data = new Object[2][2];
			data [0][0] = "zaman_5213";
			data [0][1] = "Shahnewaz1@123";
	
		}else if(m.getName().equals("signUp")){
			data = new Object[2][3];  					
			data [0][0] = "zaman_5213";
			data [0][1] = "Shahnewaz1@";
			data [0][2] = "Shahnewaz1@gmail.com";
			
			data [1][0] = "Shahnewaz1@gmail.com";
			data [1][1] = "19";
			data [1][2] = "1983";

		}return data;}}
