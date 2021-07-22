package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conformPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();

		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();

		WebElement sms = driver.findElement(By.xpath("//span[@id='confirmResult']"));

		System.out.println(sms.getText());
		

		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);

		a.dismiss();
		System.out.println(sms.getText());

	}

}