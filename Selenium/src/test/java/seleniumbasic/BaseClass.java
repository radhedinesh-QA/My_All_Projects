package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		FacebookLogin.login(driver, "9739861919", "Radha@1991");
		EdgeDriver driver1 = new EdgeDriver(); 
		Google.googlelogin(driver1);
	}
}
