package Select;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBcreateAcount {

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

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(day);
		s1.selectByVisibleText("7");

		WebElement mont = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select s2 = new Select(mont);
		s2.selectByVisibleText("Feb");
		Thread.sleep(1000);

		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1995");

		
		
		WebElement gender = driver.findElement(By.xpath("//label[contains(.,'Male')]"));

		gender.click();

		WebElement sub = driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));

		sub.click();
		
		 List<WebElement> months = s2.getOptions();
		 for (WebElement mo : months) {
			 System.out.println(mo.getText());
			
		}

		 
		
	}

}
