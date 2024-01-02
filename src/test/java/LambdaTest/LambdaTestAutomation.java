package LambdaTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class LambdaTestAutomation {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.lambdatest.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void performActions() {
        // 3. Scroll to the WebElement 'SEE ALL INTEGRATIONS'
        WebElement seeAllIntegrations = driver.findElement(By.linkText("SEE ALL INTEGRATIONS"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", seeAllIntegrations);

        // 4. Click on the link and ensure that it opens in a new Tab.
        String mainWindowHandle = driver.getWindowHandle();
        seeAllIntegrations.click();

        // 5. Save the window handles in a LearnList
        Set<String> allWindowHandles = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(allWindowHandles);

        // 6. Verify whether the URL is the same as the expected URL
        String expectedURL = "https://example.com"; // Replace with your expected URL
        for (String handle : windowHandlesList) {
            driver.switchTo().window(handle);
            if (driver.getCurrentUrl().equals(expectedURL)) {
                break;
            }
        }
    }

    @AfterClass
    public void tearDown() {
        // Close the browser after all tests are finished.
        if (driver != null) {
            driver.quit();
        }
    }
}

