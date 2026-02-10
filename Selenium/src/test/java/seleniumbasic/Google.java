package seleniumbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void googlelogin(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		WebElement textBox = driver.findElement(By.id("APjFqb"));
		textBox.sendKeys("java");
		List<WebElement> list = driver.findElements(By.xpath("//li//span[contains(text(), \"java\")]"));
		int count = list.size();
		System.out.println(count);
		for (WebElement e : list)
		{
			System.out.println(e.getText());
		}
		
		driver.quit();
	}
}
