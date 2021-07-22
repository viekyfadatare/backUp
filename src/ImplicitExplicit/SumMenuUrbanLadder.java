package ImplicitExplicit;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SumMenuUrbanLadder {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.urbanladder.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement close = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));

		close.click();

		Actions a = new Actions(driver);
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));

		for (WebElement menuName : menu) {

			String name = menuName.getText();
			System.err.println(name);
			a.moveToElement(menuName).perform();

			List<WebElement> submenu = driver.findElements(
					By.xpath("//span[contains(., '" + name + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));

			for (WebElement Subname : submenu) {

				System.out.println(Subname.getText());

			}

		}

	}
}
