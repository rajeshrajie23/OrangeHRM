package com.orange.smoke;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class htmllogin {

     By uname = By.xpath("//input[@placeholder='Username']");
    By pword = By.xpath("//input[@placeholder='Password']");
    By login_btn = By.xpath("//button[@type='submit']");

    WebDriver driver;
    

    @BeforeClass
    void loadBrowser()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver=new ChromeDriver(options);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    void loginTest()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(uname).sendKeys("Admin");
        driver.findElement(pword).sendKeys("admin123");
        driver.findElement(login_btn).click();
        String title=driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM");
    }

    @AfterClass
    void closeallbrowsers()
    {
        driver.quit();
    }
}
