package com.fall23.locators;

import com.fall23.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;
import static com.fall23.WebElementManager.findElementByXpath;

public class ByXpathDemo extends BaseTest {

    @Test
    void demo() throws InterruptedException {
        openTheSite("https://demoqa.com/text-box");
      WebElement fullNameInput = findElementByXpath ("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input");
      fullNameInput.sendKeys("John Doe");
      Thread.sleep(5000);
       


    }




}
