import java.util.ArrayList;
import java.util.List;
import java.util.Set; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Set<String> win=driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(win);
		
		for (int i = lst.size() - 1; i>=0; i--) {
			
			String win2 = lst. get(i);
			
			driver.switchTo().window(win2);
			
			driver.close();
			
			Thread.sleep(3500);
			
		}
		
				
	}

}
