package seleniumbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazoneMajorList32Elemets {
	public static void main(String[] args) throws InterruptedException {

		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");

	        WebDriver driver = new ChromeDriver(options);
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();

	        Thread.sleep(5000);

	        String xp = "//div[@id='nav-xshop']//li//a";

	        List<WebElement> elements = driver.findElements(By.xpath(xp));
	        System.out.println("Total elements located: " + elements.size());
	      int ct = 1;
	        for(WebElement es : elements)
	        {
	        	System.out.println(ct+" "+ es.getText());
	        	ct++;
	        }
	        System.out.println("--------------------");
	        
	       JavascriptExecutor js = (JavascriptExecutor) driver;

	        int count = 1;
	        for (WebElement element : elements) {

	            // Fetch hidden + visible text
	            String text = (String) js.executeScript(
	                    "return arguments[0].textContent;", element);

	            text = text.trim();
	           
	            if (!text.isEmpty()) {
	                System.out.println(count + ". " + text);
	                count++;
	            }
	        }
	        

	        driver.quit();
	}
}

