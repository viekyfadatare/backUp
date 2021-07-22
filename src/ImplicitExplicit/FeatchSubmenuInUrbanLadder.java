package ImplicitExplicit;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FeatchSubmenuInUrbanLadder {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.urbanladder.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		
		Actions a = new Actions(driver);
		for (WebElement menus : menu) {
		
			a.moveToElement(menus).perform();
			
			String name = menus.getText();
			
			System.err.println(menus.getText());
			
			List<WebElement> sub = driver.findElements
		(By.xpath("//span[contains(.,'"+name+"')]/parent::li/descendant::ul[@class=\"taxonslist\"]/li"));
			for (WebElement submenu : sub) {

				System.out.println(submenu.getText());
				
			}
			
			
		}
	}

}
