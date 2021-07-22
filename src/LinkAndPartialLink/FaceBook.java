package LinkAndPartialLink;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("English (UK)")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText(" New Account")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Data Policy")).click();
		
		Thread.sleep(1000);

		Set<String> swit = driver.getWindowHandles();
		for (String handle : swit) {
			
			driver.switchTo().window(handle);	
	}
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Facebook Products")).click();
		Thread.sleep(1000);

		driver.findElement(By.partialLinkText("an Account")).click();

		
		
		
	}

}
