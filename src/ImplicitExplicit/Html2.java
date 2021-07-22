package ImplicitExplicit;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Html2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/admin/Desktop/Selenium/Html2.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebDriverWait ww = new WebDriverWait(driver, 10);
ww.until(new ExpectedCondition<Boolean>(){

	@Override
	public Boolean apply(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("xyz")).isEnabled();
	}
	
	
});

driver.findElement(By.id("xyz")).sendKeys("vieky");

	}

}
