package TESTNG;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertHArdAsser {

	@Test
	public void tc1() {
	
	String Et = "Vieky";
	String At = "Vieky";
	
	Assert.assertEquals(At, Et);
	
	System.out.println("Hello....a");
	
	List<Object> lst1 = new ArrayList<Object>();
	
	lst1.add("Alia");
	lst1.add(121);
	lst1.add(65.5);
	lst1.add(true);
	
List<Object> lst2 = new ArrayList<Object>();
	
	lst2.add("Alia");
	lst2.add(121);
	lst2.add(65.5);
	lst2.add(true);

Assert.assertEquals(lst1, lst2);

System.out.println("Ya its equal");

SoftAssert sa = new SoftAssert();

sa.assertEquals("Vieky", "Fadatre");

System.out.println("Matched");

sa.assertAll();
	
	}
	
}
