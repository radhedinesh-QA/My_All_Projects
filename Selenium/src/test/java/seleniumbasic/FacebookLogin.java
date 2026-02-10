package seleniumbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import graphql.VisibleForTesting;

public class FacebookLogin extends BaseClass{
	
		public static void login(WebDriver driver, String Userid,String password)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement Useridbox = driver.findElement(By.id("email"));
		Useridbox.sendKeys(Userid);
		WebElement Passwordbox = driver.findElement(By.id("pass"));
		Passwordbox.sendKeys(password);
		WebElement logingButton = driver.findElement(By.xpath("//div//button[@name='login']"));
		logingButton.click();
		System.out.println("Test Pass");
		driver.quit();
	}
		
		@Test
		public static void Signup() throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.facebook.com/");
			WebElement SignupButton = driver.findElement(By.xpath("//*[text()= \"Create new account\"]"));
			SignupButton.click();
			WebElement YearDropDown = driver.findElement(By.id("year"));
			Select s = new Select(YearDropDown);
			s.selectByValue("2002");
			Thread.sleep(3000);
			List<WebElement> alloption = s.getOptions();
			for (WebElement year : alloption)
			{
				System.out.println("Year : " + year.getText());
			}
			driver.quit();
		}
		
		@Test
		public static void LoginButtonDetails()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.facebook.com/");
			WebElement LogButton = driver.findElement(By.xpath("//div/button[@name = 'login']"));
			int Hight = LogButton.getSize().height;
			System.out.println("hight " + Hight);
			int Width =LogButton.getSize().width;
			System.out.println("Width "+ Width);
			String text = LogButton.getText().toString();
			System.out.println("text " + text);
			System.out.println(LogButton.getLocation());
			String color = LogButton.getCssValue("color");
			System.out.println(color);
			driver.quit();
		}
		
		
		
		
}
