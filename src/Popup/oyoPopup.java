package Popup;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class oyoPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.oyorooms.com/");
		
		driver.manage().window().maximize();


	}

}
