import java.util.ArrayList; 
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariIndex {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		Set<String> win =driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(win);
		
		driver.switchTo().window(lst.get(2));
		
		driver.close();
		
		
		
	}

}
