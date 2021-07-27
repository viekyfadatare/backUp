package TESTNG;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demotetsng {

		@Test (invocationCount = 5)
		
		public void tc_01() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
			
			driver.close();
					
		}
		

	}


