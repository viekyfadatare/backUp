import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookFindElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("1234567890");
		
		WebElement password = driver.findElement(By.id("pass"));

		password.sendKeys("vieky@123");
		
		WebElement login =driver.findElement(By.xpath("//input[@name='login_source']"));
		
		login.click();
		
		Thread.sleep(2000);
		
		System.out.println(login.isSelected());
		 
		
		
		
	}

}
