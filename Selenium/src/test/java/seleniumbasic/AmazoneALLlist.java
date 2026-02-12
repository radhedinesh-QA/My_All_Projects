package seleniumbasic;

import java.time.Duration;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneALLlist {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.get("https://www.amazon.in/");
		WebElement AllListMenu = driver.findElement(By.xpath("//div/descendant::a[@aria-label ='Open All Categories Menu']"));
		AllListMenu.click();
		Thread.sleep(4000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='hmenu hmenu-visible']/descendant::li")); 
		int count = list.size();
		System.out.println(count);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int num = 1;
		for(WebElement items: list)
		{
			String iname =(String) js.executeScript("return arguments[0].textContent;", items );
			System.out.println(num + " " + iname);
			if(iname.equalsIgnoreCase("Books"))
				{
					js.executeScript("arguments[0].scrollIntoView(true);", items);
					System.out.println(iname + 01);
					js.executeScript("arguments[0].click();", items);
					break;

				}
			num++;
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
