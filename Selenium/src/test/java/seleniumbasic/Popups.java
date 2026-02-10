package seleniumbasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Popups extends BaseClass {
	
	@Test
	public static void AlertPopup() throws InterruptedException
	{
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//div[@id='OKTab']//button")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public static void CalenderPopup()
	{
		driver.get("");
		
	}
	
	@Test
	public static void FileUploadPopup()
	{
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		  // 4. Locate the file input element
        WebElement uploadInput = driver.findElement(By.cssSelector("input[type='file']"));

        // 5. Provide the full file path to upload
        String filePath = System.getProperty("C:\\Users\\dines\\Downloads\\Pillar of OOP_Hw.pdf") +
            "/Downloads/Pillar of OOP_Hw";    // adjust extension if needed

        uploadInput.sendKeys(filePath);

        // 6. (Optional) Add additional actions/assertions if necessary
        System.out.println("File path sent to input: " + filePath);
	}
	
	@Test
	
	public static void PrintPopup() throws AWTException
	{
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
	}	
	
	@Test
	public static void AuthenticationPopup()
	{
		driver.get("https://Dinesh:Radha@991@www.google.com");
	}
	
	
	@Test
	public static void ChildWindowHandlePopup()
	{
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//div[@id='branding']/following::span[text()='Continue with Google']")).click();
		driver.findElement(By.xpath("//div[@id='branding']/following::span[text()='Continue with Apple']")).click();
		Set<String> AllWindows = driver.getWindowHandles();
		int count = AllWindows.size();
		
		for (String s : AllWindows)
		{
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
		}
		driver.quit();
		
	}
}
	




























