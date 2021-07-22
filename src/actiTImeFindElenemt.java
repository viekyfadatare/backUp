import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTImeFindElenemt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("username"));
		
		username.sendKeys("vsfadatare@gmail.com");
		
		WebElement password = driver.findElement(By.name("pwd"));
		
		password.sendKeys("vieky@123");
		
		WebElement login =driver.findElement(By.xpath("//tr/td[3]/a/div[1]"));
		
		login.click();
		
		
		
		
		

	}

}
