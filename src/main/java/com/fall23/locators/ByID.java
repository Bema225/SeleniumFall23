package com.fall23.locators;

import com.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.driver;
import static com.fall23.WebDriverManager.openTheSite;
import static com.fall23.WebElementManager.findById;
import static com.fall23.WebElementManager.scrollDownWebPage;

public class ByID extends BaseTest {

    @Test
    void byIDTest(){

        openTheSite("https://demoqa.com/text-box");

        findById("userName").sendKeys("John");
        findById("currentAddress").sendKeys("John@gmail.com");
        findById("permanentAddress").sendKeys("WallStreet 555");
        findById("permanentAddress").sendKeys("Sovet 123");

        scrollDownWebPage();
        findById("submit").click();
       

    }


    }

