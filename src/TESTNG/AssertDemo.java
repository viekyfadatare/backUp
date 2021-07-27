package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	
	@Test
	public void tc1() {
	
	String Et = "Vieky";
	String At = "Vieky";
	
	Assert.assertEquals(At, Et);
	
	System.out.println("Hello....a");
	
	}
}
