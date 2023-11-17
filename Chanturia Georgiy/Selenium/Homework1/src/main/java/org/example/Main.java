package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");

        driver.manage().window().maximize();

        WebElement loginHeaderTitleButton = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.id("login2")));
        loginHeaderTitleButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
        //usernameInput.sendKeys("Username333");
        usernameInput.sendKeys("qwerty1!");

        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
        //passwordInput.sendKeys("Password333");
        passwordInput.sendKeys("qwerty1!");

        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginButton.click();

        /*wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);*/

        WebElement usernameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
        String actualResult = usernameElement.getText();

        System.out.println("Actual text: " + actualResult);

        driver.quit();
    }
}
