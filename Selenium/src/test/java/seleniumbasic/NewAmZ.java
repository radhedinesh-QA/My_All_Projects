package seleniumbasic;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewAmZ {
public static void main(String[] args) throws InterruptedException {
	 ChromeOptions options = new ChromeOptions();
     options.addArguments("--disable-notifications");

     WebDriver driver = new ChromeDriver(options);
     driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();

     Thread.sleep(3000);

     String xpath = "//div[@class='navFooterLine navFooterLogoLine']/child::a";

     // Locate element
     WebElement footerLogo = driver.findElement(By.xpath(xpath));

     // Get location (optional – for debugging)
     int x = footerLogo.getLocation().getX();
     int y = footerLogo.getLocation().getY();
     System.out.println("Element location: X=" + x + ", Y=" + y);

     // JavaScript Executor
     JavascriptExecutor js = (JavascriptExecutor) driver;

     // Scroll element into view (important for footer elements)
     js.executeScript("arguments[0].scrollIntoView(true);", footerLogo);
     Thread.sleep(1000);

     // Click using JavaScript
     js.executeScript("arguments[0].click();", footerLogo);

     Thread.sleep(3000);
     driver.quit();
    
}
}
