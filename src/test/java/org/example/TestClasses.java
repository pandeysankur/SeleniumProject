package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestClasses extends TestBase {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        LOGGER.info("Setting up the WebDriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
    }

    @Test
    public void yourTestMethod() {
        LOGGER.info(driver.getTitle());
    }

    @AfterClass
    public void tearDown() {
        LOGGER.info("Closing the WebDriver");
        if (driver != null) {
            driver.quit();
        }
    }
}


