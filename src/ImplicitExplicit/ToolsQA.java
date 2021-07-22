package ImplicitExplicit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='row']//button[@id='alertButton']")).click();
		
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();
		
 driver.findElement(By.id("confirmButton")).click();

		Thread.sleep(2000);
		a.dismiss();
		WebElement res = driver.findElement(By.id("confirmResult"));
		
		System.out.println(res.getText());
		
	 driver.findElement(By.id("promtButton")).click();
			Thread.sleep(2000);
		a.sendKeys("vieky");
		a.accept();
		
		WebElement res1 = driver.findElement(By.id("promptResult"));
		System.out.println(res1.getText());
		
		
		
	}

}
