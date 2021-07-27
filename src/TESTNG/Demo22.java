package TESTNG;

import org.testng.annotations.AfterClass; 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo22 {

	@BeforeGroups
	
	 public void bs() {
		System.out.println("Before S");
		
	}
	
	@BeforeClass
	 public void bc() {
		System.out.println("Before C");
		
	}

	@BeforeMethod
	
	public void bm() {
		System.out.println("Before M");	
	}

	@BeforeTest
	
	public void bt() {
		System.out.println("Before .. T");	

	}
	
	@Test
	
	public void tc1() {
		System.out.println("Hello..1");	

	}
	
@Test
	
	public void tc2() {
		System.out.println("Hello..2");	

	}

@AfterTest

public void at() {
	System.out.println("After .. T");	

}

@AfterMethod

public void am() {
	System.out.println("After M");	
}

@AfterClass

public void ac() {
	System.out.println("After C");
	
}

@AfterSuite

public void as() {
	System.out.println("After S");
	
}

	
	
	
}
