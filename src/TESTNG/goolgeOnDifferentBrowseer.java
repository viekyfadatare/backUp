package TESTNG;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class goolgeOnDifferentBrowseer {
	
	@Test
	
	@Parameters("browser")
	
	public void tc(String browser) throws InterruptedException {
		WebDriver driver = null;

		
		if(browser.equalsIgnoreCase("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

	driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");

			driver = new FirefoxDriver();
				}
		else {
			driver = null;
		}		
		
	driver.get("https://www.google.co.in/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
	
	
	Thread.sleep(5000);
	
	driver.close();
	
	
	
	
		
		
	}

}
