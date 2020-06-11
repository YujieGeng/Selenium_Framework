package com.yujie.FindWebElement;

import com.yujie.drivers.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/11
 */
public class WebElementUtilsTest {

    @Test
    public void findElementTest(){
        WebDriver driver = SeleniumDriver.open("chrome");
        driver.get("file:///Users/yujie/Downloads/index.html");

        WebElementUtils.findElement(By.className("wait")).click();

        String text = WebElementUtils.findElement(By.className("red")).getText();

        System.out.println(text);

    }

}