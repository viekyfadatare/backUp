package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		Thread.sleep(1000);
		WebElement signup = driver.findElement(By.xpath("//a/span[contains(.,'Sign up')]"));

		signup.click();
		Thread.sleep(1000);

		WebElement no = driver.findElement(By.xpath("//input[@name='emailOrPhone']"));

		no.sendKeys("9834064126");

		WebElement name = driver.findElement(By.xpath("//input[@name='fullName']"));

		name.sendKeys("Vieky fadatare");

		WebElement usrename = driver.findElement(By.xpath("//input[@name='username']"));
		usrename.sendKeys("abc@insta.com");

		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));

		pass.sendKeys("abc@123");

		WebElement sup = driver.findElement(By.xpath("//button[text()='Sign up']"));

		sup.click();

	}

}
