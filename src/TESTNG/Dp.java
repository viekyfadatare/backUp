package TESTNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dp {
	
	@DataProvider
	public String[][] data(){
		
		String value [][] = new String [3] [2];
		
		value [0] [0] = "userA";
		value [0] [1]= "A";
		value [1] [0] = "userA";
		value [1] [1]= "A";
		value [2] [0] = "userA";
		value [2] [1]= "A";
		
		return value;
		
	}
	
	@Test(dataProvider = "data")
	
	public void tc(String user, String pass) {
		System.out.println(user+"   "+pass);
	}
			

}
