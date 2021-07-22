package ReadDataFromOuterFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selNIUMHQ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.xpath("//td[@class='gsc-input']//input"));
		
		search.sendKeys("java",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		search.sendKeys("testng",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();


		

	}

}
