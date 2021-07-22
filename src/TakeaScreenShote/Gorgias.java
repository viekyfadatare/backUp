package TakeaScreenShote;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gorgias {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub\
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.gorgias.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> sub = driver.findElements(By.xpath("//nav[@class='navbar-links w-nav-menu']/div"));
		Actions a = new Actions(driver);
		for (WebElement su : sub) {
			Thread.sleep(2000);
			String name = su.getText();
			a.moveToElement(su).perform();
			Thread.sleep(2000);
			ss.takePic(driver, name);

		}

	}

}
