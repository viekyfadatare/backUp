package TESTNG;

import org.testng.annotations.Test;

public class DependsOnGroup {
	
	@Test(groups = "Adhoc",dependsOnGroups = "Smoke"  )

	public void tc1() {

		System.out.println("I am Adhoc");

	}

	@Test(groups = "Int")

	public void tc2() {

		System.out.println("I am Int");

	}

	@Test(groups = "Fun",dependsOnGroups = "Int")

	public void tc3() {

		System.out.println("I am Fun");

	}
	
	@Test(groups = "Smoke", dependsOnGroups = "Fun")

	public void tc4() {

		System.out.println("I am Smoke");

	}
	

}
