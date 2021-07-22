import java.util.Set; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadNikariCom {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(2000);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> win = driver.getWindowHandles();
		win.remove(parent);
		
		for(String vieky : win) {
			System.out.println(vieky);
			
			driver.switchTo().window(vieky);
			
			
			
			Thread.sleep(4500);
			
			
		}
		driver.quit();
		
		
		
	}

}
