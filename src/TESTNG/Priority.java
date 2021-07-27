package TESTNG;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 0)

	public void tc1() {

		System.out.println("I am 1st");

	}

	@Test(priority = -15485 )

	public void tc2() {

		System.out.println("I am 2nd");

	}

	@Test(priority = -1)

	public void tc3() {

		System.out.println("I am 3rd");

	}

}
