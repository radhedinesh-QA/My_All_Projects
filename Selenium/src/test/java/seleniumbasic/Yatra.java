package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Yatra {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.yatra.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='style_popup__a7PrI MuiBox-root css-0']/child::section[2]/span/img[@alt ='cross']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='MuiBox-root css-1ng6cxl']/child::div[3])/descendant::button[text()='Search']")).click();
        Thread.sleep(2000);
        //driver.quit();
    }
}