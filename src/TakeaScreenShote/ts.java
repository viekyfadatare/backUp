package TakeaScreenShote;

import java.io.File; 
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.skillrary.com/");
		
		driver.manage().window().maximize();
		
	TakesScreenshot	ts = (TakesScreenshot) driver;
	
	File ss = ts.getScreenshotAs(OutputType.FILE);

	File ssSave = new File("./ScreenShot/vieky.png");
	
	Files.copy(ss, ssSave);
	
	}
	
	public static void takeSnape(WebDriver driver , String name) throws IOException {
		
		TakesScreenshot ms = (TakesScreenshot) driver;
		
		File ss = ms.getScreenshotAs(OutputType.FILE);
		File ssSave = new File("./ScreenShot/"+name+".png");
		Files.copy(ss, ssSave);
		
		
	}

}
