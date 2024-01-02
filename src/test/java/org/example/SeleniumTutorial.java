package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SeleniumTutorial {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\smsub\\IdeaProjects\\demo\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://demo.automationtesting.in/Register.html");
        String title = driver.getTitle();
        System.out.println("My Current Title is::" + title);
        String url = driver.getCurrentUrl();
        System.out.println("Current URL::" + url);
        WebElement fname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
        fname.sendKeys("Priya");
        WebElement lname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
        lname.sendKeys("Kumari");
       /* WebElement lang = driver.findElement(By.id("msdd"));
        lang.click();
        WebElement opt = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[16]/a"));
        Thread.sleep(2000);
        opt.click();*/
        //DropDown Menu

        WebElement dropDown = driver.findElement(By.id("Skills"));
        dropDown.click();
        Select option = new Select(dropDown);
        option.selectByVisibleText("Java");


    }
}
