package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverUtils {
	

	private static WebDriver driver;

	public static void abrirAplicacao() {
		System.setProperty("webdriver.chrome.driver", "C:\\bin\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}
	
	
	public static WebDriver getDriver(){
		return driver;
	}

}
