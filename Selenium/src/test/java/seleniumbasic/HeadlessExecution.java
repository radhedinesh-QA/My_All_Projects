package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessExecution {
public static void main(String[] args) {
	 ChromeOptions options = new ChromeOptions();
     options.addArguments("--headless=new");   // enable headless mode
     options.addArguments("--disable-gpu");
     options.addArguments("--window-size=1920,1080");

     WebDriver driver = new ChromeDriver(options);

     driver.get("https://www.amazon.in");
     System.out.println("Title: " + driver.getTitle());

     driver.quit();
}
}
