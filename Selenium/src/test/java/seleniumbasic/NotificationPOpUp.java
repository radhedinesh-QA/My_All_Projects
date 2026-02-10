package seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NotificationPOpUp {

	@Test
	public static void NotificationPopup()
	{
		 ChromeOptions options = new ChromeOptions();

	        // Disable browser notifications
	        //options.addArguments("--disable-notifications");

	        WebDriver driver = new ChromeDriver(options);

	        driver.manage().window().maximize();
	        driver.get("https://www.yatra.com/");
	        WebElement MobNoBOX = driver.findElement(By.cssSelector(".style_block__hmYLX"));
	        MobNoBOX.click();
	       
	}
	
}
