package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement textBox = driver.findElement(By.cssSelector("#APjFqb"));
		Thread.sleep(3000);
		textBox.sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div/span[contains(text(),'java')]"));
		for(WebElement opt : list)
		{
			System.out.println(opt.getText()  );
		}
		driver.quit();
	}
}
