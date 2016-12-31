package Global;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class Data_Provider {
	
	/*@DataProvider(name="LogInTest")
	public static Object[][] getData(){
		
		Object[][] data = new Object[1][1];
		data [0][0] = "remoteITUniversity";
		return data;
	}*/
	
	@DataProvider(name="LogInTest")
	public static Object[][] getData(Method m){
		
		Object[][] data = null;   
		
		if(m.getName().equals("logIn")){
			data = new Object[1][1];  //1 rows and 1 column
			data [0][0] = "remoteITUniversity";

		}else if(m.getName().equals("logInCreate")){
			
			data = new Object[2][3];
			data [0][0] = "md";
			data [0][1] = "zaman";
			data [0][2] = "Password";
			
			data [1][0] = "username";
			data [1][1] = "password";
			data [1][2] = "password";
	
		}
		return data;
	
	}

}
