package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ActiTimeProject {
    WebDriver driver;

    @BeforeClass
    public void browserinvoke() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/user/submit_tt.do");
    }

    @Test
    public void loginPage() {
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
    }

    /*  @Test
      public void timeTrack() throws InterruptedException {
          Thread.sleep(5000);
          driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[2]/td[2]/div[2]/a")).click();
          Thread.sleep(5000);
          driver.findElement(By.xpath("//*[@id=\"viewTTContent\"]/div[2]/table/tbody/tr/td[3]")).click();
          Thread.sleep(5000);
          driver.findElement(By.xpath("//*[@id=\"viewTTPdfPreviewLightbox_downloadPdfBtn\"]/div/span")).click();
      }*/
    @Test
    public void timeTrack() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"topnav\"]/tbody/tr[2]/td[2]/div[2]/a"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"viewTTContent\"]/div[2]/table/tbody/tr/td[3]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"viewTTPdfPreviewLightbox_downloadPdfBtn\"]/div/span"))).click();
    }
    @Test
    public void windowsSwitch() {
        driver.get("https://demo.actitime.com/user/submit_tt.do");
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        // Switch to the new window
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        String newTabHandle = findNewTabHandle(windowHandles);
        driver.switchTo().window(newTabHandle);

        // Perform some actions on the new tab (if required)
        driver.get("https://www.example.com");
        // Switch back to the original window
        driver.switchTo().window(currentWindowHandle);
    }
    private String findNewTabHandle(Set<String> windowHandles) {
        String currentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(currentWindowHandle)) {
                return windowHandle;
            }
        }
        return null;
    }
    @Test
    public void taskOpen() throws InterruptedException {
        driver.findElement(By.id("container_tasks")).click();
        driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[1]/div[1]/div[3]/div/div[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen146\"]/div[19]/div[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[1]/input")).sendKeys("Agile Methods");


    }
    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(7000);
        driver.close();

    }

}
