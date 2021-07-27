package Assignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ThirteenthSenario {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bluestone.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement offer = driver.findElement(By.xpath("//li[@class='menuparent offers-menuparent pull-right']/span"));
		Actions a = new Actions(driver);

		a.moveToElement(offer).perform();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,'Additional 50% off on your 1st installment on GMS')]")).click();

		driver.findElement(By.xpath("//div/input[@name='amount']")).sendKeys("15000");
		driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys("vsfadatare@gmail.com");
		driver.findElement(By.xpath("//input[@id='gmsStart']")).click();

		Thread.sleep(2000);

	}

}
