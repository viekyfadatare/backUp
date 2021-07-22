import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchSWigy {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.swiggy.com/restaurants");
		
		driver.manage().window().maximize();
		
		String title= driver.getTitle();
		
		System.out.println(title);
		
	 Thread.sleep(4000);
	 
	 driver.navigate().back();
	 
	 Thread.sleep(4000);

	 driver .navigate().forward();
	
	 Thread.sleep(4000);

	 driver .navigate().refresh();

	 
	 
		
		//driver.close();
		
	}

}
