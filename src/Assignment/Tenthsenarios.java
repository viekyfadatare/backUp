package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tenthsenarios {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement frame = driver.findElement(By.id("chat-widget"));
		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("//div[@class='lc-a1mf5z ek650k30']//p")).click();

		driver.findElement(By.xpath("//div[@class='lc-17us0ak eptvlbh0']//input[@id='name']"))
				.sendKeys("vieky fadatare");
		driver.findElement(By.xpath("//div[@class='lc-17us0ak eptvlbh0']//input[@id='email']"))
				.sendKeys("vsfadatare@gmail.com");

		driver.findElement(By.xpath("//form/div[4]/div/input")).sendKeys("9834064126");

		driver.findElement(By.xpath("//div[@class='lc-110km49 e1n7ru1l0']")).click();
	}

}
