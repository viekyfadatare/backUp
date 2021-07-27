package TESTNG;

import org.testng.annotations.AfterClass; 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo23 {

	@BeforeSuite

	public void bs() {

		System.out.println("Before S ");
	}

	@BeforeTest

	public void bt() {
		System.out.println("Before T");

	}

	@BeforeClass
	public void bc() {
		System.out.println("Before C");

	}

	@BeforeMethod

	public void bm() {
		System.out.println("Before M");
	}

	@Test

	public void tc1() {
		System.out.println("Hello..1");

	}

	@Test

	public void tc2() {
		System.out.println("Hello..2");

	}

	@AfterMethod

	public void am() {
		System.out.println("After M");
	}

	@AfterClass

	public void ac() {
		System.out.println("After C");
		System.out.println();
		System.out.println();
	}
	
	@AfterTest

	public void at() {
		System.out.println("After T");

	}
	@AfterSuite

	public void as() {

		System.out.println("After S ");
	}


	@AfterSuite

	public void as2() {

		System.out.println("After S2 ");
	}
	
}
