package com.fall23.tripAdvisor;

import com.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;
import static com.fall23.WebElementManager.findElementByXpath;
import static jdk.internal.agent.Agent.getText;

public class TripAdvisorTest extends BaseTest {





        @Test
    void test3() throws InterruptedException {
            openTheSite("https:www.youtube.com//");
//            WebElement searchButton = findElementByXpath("//input[@id='search']");
//            searchButton.click();
//            searchButton.sendKeys("Мирбек Атабеков");
//
//            WebElement searchButton2 = findElementByXpath("//button[@id='search-icon-legacy']");
//            searchButton2.click();

            //WebElement searchVideo = findElementByXpath ("//img[@src='https://i.ytimg.com/vi/sTQ0AFR64pE/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAHQ_x5mHjVmK3H92wA_u6hGKB7KQ']");
            //searchVideo.click();


            String actualName =findElementByXpath("//span[text()='Главная']").getText();
            String expectedName ="Главная";
            Assert.assertEquals(actualName,expectedName);







        }



    }

