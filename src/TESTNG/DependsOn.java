package TESTNG;

import org.testng.annotations.Test;

public class DependsOn {

	@Test(dependsOnMethods = "tc3")

	public void tc1() {

		System.out.println("I am 1st");

	}

	@Test()

	public void tc2() {

		System.out.println("I am 2nd");

	}

	@Test(dependsOnMethods = "tc2")

	public void tc3() {

		System.out.println("I am 3rd");

	}

	
}
