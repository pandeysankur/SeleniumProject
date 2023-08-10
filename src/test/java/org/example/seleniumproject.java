package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class seleniumproject extends TestBase {
    WebDriver driver;

    @BeforeClass
    public void browserinvoke() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        LOGGER.info("Browser Invoke");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void getTitels() {
        LOGGER.info(driver.getTitle());
    }

    @Test
    public void printLink() {
        List<WebElement> allLinkElements = driver.findElements(By.tagName("a")).stream().filter(WebElement::isDisplayed).toList();
        LOGGER.info("Total Links Found 1st one : " + allLinkElements.size());
        allLinkElements.forEach(element -> {
            String text = element.getText();
            String href = element.getAttribute("href");
            LOGGER.info("Text [" + text + "] has href as : " + href);
        });
    }

    /* @Test
     public void inputElementTest() {
         List<String> inputData = Arrays.asList(
                 "abcd",
                 "efgh",
                 "abcd@gmail.com",
                 "1234567890",
                 "Hinjewadi Pune,Maharastra",
                 "Pune",
                 "1057",
                 "www.google.com",
                 "CP-SET Certified"
         );
         LOGGER.info("WebSite Title: " + driver.getTitle());
         LOGGER.info("Current URL: " + driver.getCurrentUrl());
         List<String> inputFields = Arrays.asList(
                 "first_name",
                 "last_name",
                 "email",
                 "phone",
                 "address",
                 "city",
                 "zip",
                 "website",
                 "comment"
         );
         for (int i = 0; i < inputData.size(); i++) {
             String field = inputFields.get(i);
             String value = inputData.get(i);
             driver.findElement(By.name(field)).sendKeys(value);
             LOGGER.info("Input Fields::"+field);
             LOGGER.info("Value::"+value);
         }
     }*/
    @Test
    public void inputElementTest1() {
        Map<String, String> input = new HashMap<>();
        input.put("first_name", "abcd");
        input.put("last_name", "efgh");
        input.put("email", "abcd@gmail.com");
        input.put("phone", "1234567890");
        input.put("address", "Hinjewadi Pune,Maharastra");
        input.put("city", "Pune");
        input.put("zip", "1057");
        input.put("website", "www.google.com");
        input.put("comment", "CP-SET Certified");

        LOGGER.info("WebSite Title: " + driver.getTitle());
        LOGGER.info("Current URL: " + driver.getCurrentUrl());

        for (Map.Entry<String, String> entry : input.entrySet()) {
            String field = entry.getKey();
            String value = entry.getValue();
            driver.findElement(By.name(field)).sendKeys(value);
            LOGGER.info("Input Fields::" + field);
            LOGGER.info("Value::" + value);
        }
    }


    // ...
 /*   @Test
    public void inputElementTest() {
        try {
            FileInputStream excelFile = new FileInputStream(new File("C:\\Users\\smsub\\OneDrive\\Desktop\\readData.xlsx"));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(0); // Replace with your sheet name

            LOGGER.info("WebSite Title: " + driver.getTitle());
            LOGGER.info("Current URL: " + driver.getCurrentUrl());

            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);

                String field = row.getCell(0).getStringCellValue(); // Assuming field name is in the first column
                String value = row.getCell(1).getStringCellValue(); // Assuming value is in the second column

                driver.findElement(By.name(field)).sendKeys(value);
                LOGGER.info("Input Fields::" + field);
                LOGGER.info("Value::" + value);
            }

            workbook.close();
            excelFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    @Test
    public void selectElementTest() {
        WebElement selectElement = driver.findElement(By.name("state"));
        Select elementAsSelect = new Select(selectElement);
        elementAsSelect.selectByVisibleText("District of Columbia");
    }

    @Test
    public void radioComponentTest() throws InterruptedException {
        List<WebElement> radioElements = driver.findElements(By.name("hosting"));
        // click on yes
        radioElements.get(0).click();
        Thread.sleep(5000);
        // click on No
        radioElements.get(1).click();
    }

    @Test
    public void submitButton() {
        WebElement button = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button"));
        button.submit();
    }

    @Test
    public void windowsSwitch() {
        driver.get("https://demo.actitime.com/user/submit_tt.do");
        LOGGER.info("Current Windows Titels::" + driver.getTitle());
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        // Switch to the new window
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        // Switch back to the original window
        //driver.switchTo().window(currentWindowHandle);
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.id("container_reports")).click();
        LOGGER.info("Task Titels::::::::" + driver.getTitle());
        driver.findElement(By.id("reportConfig_88")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//td[@class='content-cell']"));
        if (elements.size() >= 3) {
            WebElement thirdElement = elements.get(2);
            String thirdElementText = thirdElement.getText();
        } else {
            LOGGER.info("No Third Element available");
        }

    }

    @Test
    public void printAllLink() {
        List<WebElement> allLinkElements = driver.findElements(By.tagName("a")).stream().filter(WebElement::isDisplayed).toList();
        LOGGER.info("Total Links Found : " + allLinkElements.size());
        allLinkElements.forEach(element -> {
            String text = element.getText();
            String href = element.getAttribute("href");
            LOGGER.info("Text [" + text + "] has href as : " + href);
        });
    }


    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(7000);
        driver.close();
    }
}
