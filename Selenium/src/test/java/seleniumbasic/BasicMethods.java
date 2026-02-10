package seleniumbasic;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicMethods {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		driver.navigate().back();        Thread.sleep(3000);
		driver.navigate().forward();        Thread.sleep(3000);
		driver.navigate().refresh();          Thread.sleep(3000);
		driver.manage().window().minimize();  Thread.sleep(3000);
		driver.manage().window().maximize();        Thread.sleep(3000);
		driver.manage().window().fullscreen();         Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();      Thread.sleep(3000);
		String sub = driver.manage().window().getPosition().toString();
		System.out.println(sub);
		@Nullable
		String url = driver.getCurrentUrl();
		System.out.println(url);
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		@Nullable
		String Source = driver.getPageSource();
		System.out.println(Source);
		driver.quit();
		

	}
}
