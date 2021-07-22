package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RollsRoy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
				co.addArguments("--disable-notifications");
				
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("http://www.rolls-roycemotorcars.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@style='width: 0px; height: 0px; border: 0px; display: none;']"));
		
		driver.switchTo().frame(frame);
		
		
		
		
	
		
	
		
		

	}

}
