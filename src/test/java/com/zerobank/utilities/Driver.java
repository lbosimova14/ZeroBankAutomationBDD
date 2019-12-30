package com.zerobank.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
Under utilities package create Driver utility which can create a new web driver object based on value from
configuration.properties
.This is useful when exactly one object is needed to coordinate actions across the system.
Since there is only one Singleton instance, any instance fields of a Singleton will occur only once per class,
 just like static fields.
 */
public class Driver {
    //Declare a static reference variable of class. Static is needed to make it available globally.
    private static WebDriver driver;

    //Declare constructor of class as private so that no one instantiate class outside of it.
    private Driver() {
    }
//Declare a static method with return type as object of class which should check if class is already instantiated once.
    public static WebDriver get() {
        if (driver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "chrome_headless":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.setHeadless(true);
                    driver = new ChromeDriver(options);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new RuntimeException("Wrong browser,please type correctly");
            }
        }
        return driver;

    }
public static  void  close() {
    if (driver != null) {
        driver.quit();
        driver = null;
    }
}
}

/*
Singleton Design Pattern:
When we develop a class in such a way that it can have only instance at any time,
is called Singleton design pattern. It is very useful when you need to use same object of a class across
 all classes or framework. Singleton class must return the same instance again, if it is instantiated again.

To create a singleton class, we need to do following steps:

Declare constructor of class as private so that no one instantiate class outside of it.
Declare a static reference variable of class. Static is needed to make it available globally.
Declare a static method with return type as object of class which should check if class is already instantiated once.
 */