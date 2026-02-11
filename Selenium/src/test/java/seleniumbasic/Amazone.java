package seleniumbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone{
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	driver.get("https://www.amazon.in/");
	WebElement searchbox = driver.findElement(By.xpath("//div[@class='nav-search-field ']/child::input[@id='twotabsearchtextbox']"));
	searchbox.click();
	searchbox.sendKeys("iphone");
	
	List<WebElement> All = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div//div[contains(text(),'iphone')]"));
	
	System.out.println(All.size());
	int count = 1;
	for ( WebElement list : All)
	{
		System.out.println(count + " " + list.getText());
		count++;
	}
	driver.quit();
}
}
