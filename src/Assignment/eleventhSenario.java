package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eleventhSenario {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bluestone.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//li[@class='menuparent offers-menuparent pull-right']/span")).click();
	
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//img[@alt='Upto 75% Off making charge of Diamond Jewellery']")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
