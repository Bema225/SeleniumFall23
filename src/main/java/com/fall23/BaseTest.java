package com.fall23;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {
    protected static WebDriver driver;
    protected WebDriverManager webDriverManager;
    @BeforeTest
    public void setUp(){
        driver= WebDriverManager.initChromeDriver();
    }
    @AfterClass
    public void tearDown(){
        WebDriverManager.closeDriver();
    }

}
