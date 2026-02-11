package seleniumbasic;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class ScreenerCanvasHoverAllTooltips {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            driver.manage().window().maximize();
            driver.get("https://www.screener.in/company/PNB/consolidated/");

            // Wait for chart
            WebElement canvas = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector("#chart canvas")
                )
            );

            Dimension size = canvas.getSize();
            Actions actions = new Actions(driver);

            Set<String> seenDates = new HashSet<>();

            System.out.println("Date | Price | Vol | D");
            System.out.println("------------------------------------------------");

            // Sweep graph
            for (int x = 10; x < size.getWidth() - 10; x += 5) {

                actions.moveToElement(canvas)
                       .moveByOffset(-size.getWidth() / 2 + x, 0)
                       .pause(Duration.ofMillis(200))
                       .perform();

                Thread.sleep(120);

                // 🔥 READ SVG TOOLTIP CORRECTLY
                List<WebElement> tspans =
                        driver.findElements(
                                By.cssSelector(".highcharts-tooltip text tspan"));

                if (tspans.isEmpty()) {
                    continue;
                }

                List<String> lines = new ArrayList<>();
                for (WebElement tspan : tspans) {
                    String txt = tspan.getText().trim();
                    if (!txt.isEmpty()) {
                        lines.add(txt);
                    }
                }

                if (lines.isEmpty()) {
                    continue;
                }

                // Parse tooltip lines
                String date = null, price = null, vol = null, d = null;

                for (String line : lines) {
                    if (date == null && !line.contains(":")) {
                        date = line;
                    } else if (line.startsWith("Price:")) {
                        price = line.replace("Price:", "").trim();
                    } else if (line.startsWith("Vol:")) {
                        vol = line.replace("Vol:", "").trim();
                    } else if (line.startsWith("D:")) {
                        d = line.replace("D:", "").trim();
                    }
                }

                if (date != null && seenDates.add(date)) {
                    System.out.printf("%s | %s | %s | %s%n",
                            date,
                            price != null ? price : "-",
                            vol != null ? vol : "-",
                            d != null ? d : "-"
                    );
                }
            }

            System.out.println("------------------------------------------------");
            System.out.println("✅ Tooltip extraction completed");

        } finally {
            driver.quit();
        }
    }
}
