import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchInstagram {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		
	String vieky	=driver.getCurrentUrl();
	
	System.out.println(vieky);
	
	String pagesource = driver.getPageSource();
	
	System.out.println(pagesource);
	
	}

}
