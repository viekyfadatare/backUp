package Robot;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateFB {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement lang = driver.findElement(By.xpath("//a[@title='English (UK)']"));

		lang.click();

		WebElement create = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));

		create.click();

		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));

		name.sendKeys("Vieky");

		WebElement sname = driver.findElement(By.xpath("//input[@name='lastname']"));

		sname.sendKeys("Fadatare");

		Thread.sleep(2000);

		WebElement mno = driver.findElement(By.xpath("//input[@name='reg_email__']"));

		mno.sendKeys("9834064126");

		WebElement pass = driver.findElement(By.xpath("//input[@id='password_step_input']"));

		pass.sendKeys("abc@123");

		Thread.sleep(1000);

		WebElement day = driver.findElement(By.xpath("//span/select[@id='day']/option[@value='7']"));

		day.click();

		WebElement mont = driver.findElement(By.xpath("//span/select[@id=\"month\"]/option[@value='2']"));
		mont.click();

		WebElement year = driver.findElement(By.xpath("//span/select[@id=\"year\"]/option[@value='1995']"));
		year.click();

		WebElement gender = driver.findElement(By.xpath("//label[contains(.,'Male')]"));

		gender.click();

		WebElement sub = driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));

		sub.click();
	}

}
