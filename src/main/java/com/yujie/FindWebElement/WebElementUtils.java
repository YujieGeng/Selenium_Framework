package com.yujie.FindWebElement;

import com.sun.jna.platform.win32.OaIdl;
import com.yujie.drivers.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/11
 */
public class WebElementUtils extends SeleniumDriver {


    public static WebElement findElement(final By by){

        WebElement element = null;

        try {
           element = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e){
            System.out.println("元素: "+by+" 查找超时");
            e.printStackTrace();
        }
        return element;
    }
}
