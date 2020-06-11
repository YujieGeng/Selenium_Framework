package com.yujie.drivers;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/11
 */
public class SeleniumDriver {
    public static WebDriver driver;
    public static WebDriver open(String browser){

        String path = System.getProperty("user.dir");

        if("chrome".equalsIgnoreCase(browser)){
            System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver");
            driver = new ChromeDriver();
        }else if("firefox".equalsIgnoreCase(browser)){
            System.setProperty("webdriver.gecko.driver", path+"/drivers/geckodriver");
            driver = new FirefoxDriver();
        }else {
            System.out.println("你传入的浏览器名称有误: "+browser);
        }

        return driver;
    }


    public static void closeAll(){

        if(driver != null) {
            driver.quit();
        }
    }

    public static void closeCurrent(){

        if(driver != null) {
            driver.close();
        }
    }
}
