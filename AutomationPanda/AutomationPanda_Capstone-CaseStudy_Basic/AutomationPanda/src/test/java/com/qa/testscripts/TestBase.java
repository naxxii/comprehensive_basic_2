package com.qa.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.pages.AutomationPandaPages;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	WebDriver driver;
	AutomationPandaPages panda;
	@SuppressWarnings("deprecation")
	@Parameters("URL")
	@BeforeSuite
	public void setUp(String url) throws IOException {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get(url);
		panda=new AutomationPandaPages(driver);
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}