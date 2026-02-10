package seleniumbasic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart extends BaseClass {
	
	
	@Test
	public static void iphonelist() {
		//Go to Flipkart / click in searchBox / Enter the Iphone 17 / Get the Price of all iphone 17 phone along with names
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement searchBox = driver.findElement(By.xpath("//*[@title ='Search for Products, Brands and More' and @type ='text']"));
		searchBox.sendKeys("Iphone 17");
		driver.findElement(By.xpath("//*[@title ='Search for Products, Brands and More' and @type ='submit']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div [@class= 'QSCKDh dLgFEE']//div[contains(text(), 'Apple iPhone 17')]"));
		List<WebElement> price = driver.findElements(By.xpath("//div [@class= 'QSCKDh dLgFEE']//div[contains(text(), 'Apple iPhone 17')]/../../..//div[@class='oFEPlD']//div//div"));
		int count = list.size();
		int count1 = price.size();
		System.out.println(count);
		System.out.println(count1);
		for (int i = 0; i< count -1; i++)
		{
			System.out.println(list.get(i).getText()+ "====> " + price.get(i).getText() );
		}
		driver.quit();
	}
	
	@Test
	public static void disappearlist()
	// Go to Flipkart/ click in searcha Box / get the auto list appear
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement searchBox = driver.findElement(By.xpath("//*[@title ='Search for Products, Brands and More' and @type ='text']"));
		searchBox.click();
		List<WebElement> list = driver.findElements(By.xpath("//*[@class = 'URRkKz']"));
		int count = list.size();
		System.out.println(count);
		ArrayList<String> al = new ArrayList();
		for (WebElement item : list)
		{
			String value = item.getText();
			al.add(value);
		}
		System.out.println("Element added in list as : ");
		for (String res : al)
		{
			System.out.println(res);
		}
		driver.quit();
	}
	
	
	@Test
	public static void FashionMenu()
	//flipkart/ click on fashion Main menue /MouseHover to mens Menu / and get the jacket option text
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	WebElement FashionMenue = driver.findElement(By.xpath("//div[@class='jtYow_']/descendant::a[@class='tVzyDb' and @aria-label='Fashion']"));
	FashionMenue.click();
	WebElement MenMenu = driver.findElement(By.xpath("//*[text()='Men']"));
	Actions a = new Actions(driver);
	a.moveToElement(MenMenu).perform();
	WebElement jack = driver.findElement(By.xpath("//div[@class='rX6Fng']/descendant::div[@class='nCHhUt'][3]//a[@title='Jackets']"));
	System.out.println(jack.getText());
	driver.quit();
	}
	
	
	
}
