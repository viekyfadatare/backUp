package TakeaScreenShote;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class whatsApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		
		driver.manage().window().maximize();
		
		
		  TakesScreenshot ts = (TakesScreenshot) driver;
		  
		  File ss = ts.getScreenshotAs(OutputType.FILE);
		  
		  File ssSave = new File("./ScreenShot/whataap.png");
		  
		  Files.copy(ss, ssSave);
		
		

	}

}
