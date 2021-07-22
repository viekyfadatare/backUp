package javaScriptExecutor;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*
		 * js.executeScript("window.scroll(0,2000)");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * js.executeScript("window.scroll(0,-500)");
		 */
/*
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

		Thread.sleep(15000);

		driver.close();
*/
		WebElement ele = driver.findElement(By.xpath("//span[text()='View all']"));
		
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
		
		
	}

}
