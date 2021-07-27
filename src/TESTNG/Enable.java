package TESTNG;

import org.testng.annotations.Test;

public class Enable {
	
	
	@Test(enabled = true)
	
	public void tc1() {
		System.out.println("Yes i am Enable");
	}

}
