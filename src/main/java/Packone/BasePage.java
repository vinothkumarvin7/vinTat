package Packone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	public static WebDriver driver;
	public String browser = "chrome";
	
	public BasePage(){
		if (driver == null) {
			
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\HOME\\Downloads\\chromedriver.exe");
				driver = new ChromeDriver();
			} 
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");

}
}
