package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gorgians {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.gorgias.com/");
		driver.manage().window().maximize();
		List<WebElement> menu = driver.findElements(By.xpath("//nav[@class='navbar-links w-nav-menu']/div"));
		Actions a = new Actions(driver);
		for (WebElement menus : menu) {

			String name = menus.getText();
			System.err.println(name);
			Thread.sleep(1000);
			a.moveToElement(menus).perform();
			Thread.sleep(1000);
		
		List<WebElement> submenu = driver.findElements
		(By.xpath("//div[contains(.,'"+name+"')]/parent::nav/descendant::nav[@id='w-dropdown-list-0']/div/a"));
		for (WebElement sub : submenu) {
			Thread.sleep(2000);
			System.out.println(sub.getText());
		
		}
	}
	}


}
