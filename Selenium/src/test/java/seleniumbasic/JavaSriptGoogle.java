package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSriptGoogle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String xpathh = "#APjFqb";
		WebElement TextBox = driver.findElement(By.cssSelector(xpathh));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", TextBox); 
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Selenium';", TextBox);
		Thread.sleep(2000);
		js.executeScript(
			    "arguments[0].value += ' Automation';", TextBox);
		Thread.sleep(2000);
		String title = (String) js.executeScript(
			    "return document.title;");
		System.out.println(title);
		Thread.sleep(2000);
		String url = (String) js.executeScript(
			    "return document.URL;");
		System.out.println(url);
		Thread.sleep(2000);
		js.executeScript("location.reload();");
		driver.quit();
	}
}
