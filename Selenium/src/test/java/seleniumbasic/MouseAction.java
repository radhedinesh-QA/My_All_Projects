package seleniumbasic;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MouseAction extends BaseClass{
	
	@Test
	public static void MouseHoverAction()
	{
		driver.get("https://www.flipkart.com/");
		WebElement MOb = driver.findElement(By.xpath("//*[@class='jtYow_']/descendant::div[@class='vQDoqR']//a//div[text()='Apple iPhone 16']"));
		Actions a = new Actions(driver);
		a.moveToElement(MOb).perform();
		a.contextClick(MOb).perform();
	}
}
