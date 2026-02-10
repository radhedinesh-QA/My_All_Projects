package UdamySelProgram;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {
	public static void main(String[] args) {
		//invoking browser
		//System.setProperty("webdirver.chrome.driver", "D:\\Selenium installation folder DO NOT TOUCH\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/");
		String title = driver.getTitle();
		 System.out.println(title);
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
		 driver.quit();
	}

}
