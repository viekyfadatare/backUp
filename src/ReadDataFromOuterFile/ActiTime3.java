package ReadDataFromOuterFile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		String user = ReadDemo.readCell("‪./Exel/login.xlsx", "Sheet1", 1, 0);
		String pass = ReadDemo.readCell("‪./Exel/login.xlsx", "Sheet1", 1, 1);

		driver.findElement(By.id("username")).sendKeys(user);

		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys(pass, Keys.ENTER);

	}

}
