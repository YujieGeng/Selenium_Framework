package com.yujie.drivers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/11
 */
public class SeleniumDriverTest {


    @Test
    public void OpenTest(){
        WebDriver driver = SeleniumDriver.open("chrome");

    }



}
