package com.mycompany.selenium_github_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Pablo Jacob
 */

public class Selenium_GitHub_Login {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
        
        driver = new FirefoxDriver();
        
        driver.get("https://github.com/login");
        
        WebElement login_field = driver.findElement(By.id("login_field"));
        Thread.sleep(1000);
        
        login_field.sendKeys("correo@ejemplo.com");
        
        WebElement password = driver.findElement(By.id("password"));
        Thread.sleep(1000);
        
        password.sendKeys("password.ejemplo");
        Thread.sleep(1000);
        
        WebElement commit = driver.findElement(By.name("commit"));
        
        commit.click();
        Thread.sleep(1000);
        
        driver.get("https://github.com/Pablo-Jacob/Pablo-Jacob");
    }
}
