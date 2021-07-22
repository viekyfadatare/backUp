package Xpath;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import TakeaScreenShote.ss;

public class urbanLaDDer3 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.urbanladder.com");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(10000);

		WebElement close = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		
		close.click();
		
		Actions a = new Actions(driver);
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		
		for(WebElement menuName:menu) {

			String name = menuName.getText();
			System.err.println(name);
			Thread.sleep(1000);
			a.moveToElement(menuName).perform();
			Thread.sleep(2000);
			
			ss.takePic(driver, name);
			
		List<WebElement> submenu = driver.findElements
		(By.xpath("//span[contains(., '" + name + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));
		
	for (WebElement Subname : submenu) {
		
		a.moveToElement(Subname).perform();
		System.out.println(Subname.getText());
		
	}
		
	}
	}

}
