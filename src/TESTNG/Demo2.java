package TESTNG;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {

	WebDriver driver;

	@BeforeMethod
	
	public void BM() {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		 driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();
	}

	@Test
	public void tc_01() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);

		System.out.println("TC1");

	}

	@Test
	public void tc_02() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("testng", Keys.ENTER);

		System.out.println("TC1");

	}

	@AfterMethod
	public void am() {

		driver.close();
		System.out.println("am");
	}

}
