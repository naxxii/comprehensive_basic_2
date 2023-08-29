package com.qa.testscripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logo {

    WebDriver driver = null;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.automationanywhere.com/");
        driver.manage().window().maximize();

    }

    @Test(priority = 0)

    public void CheckLogo() throws InterruptedException {
        WebElement logoPresent = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[1]/div/a/img"));

        if (logoPresent.isDisplayed()) {
            System.out.println("Automation Anywhere logo is present.");
        } else {
            System.out.println("Automation Anywhere logo is not present.");
        }
        WebElement demoButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/article/div/div/div/div[1]/div/div/div/div[1]/a"));

        if (demoButton.isDisplayed() && demoButton.isEnabled()) {
            demoButton.click();
            System.out.println("Request demo button is present and clickable.");
        } else {
            System.out.println("Request demo button is not present or not clickable.");
        }

    }

    @AfterTest

    public void tearDown() {
        driver.quit();
    }
}



