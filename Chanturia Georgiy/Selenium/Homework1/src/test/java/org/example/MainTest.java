package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;

public class MainTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLogInValidData(){
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        WebElement loginHeaderTitleButton = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.id("login2")));
        loginHeaderTitleButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
        usernameInput.sendKeys("qwerty1!");

        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
        passwordInput.sendKeys("qwerty1!");

        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginButton.click();

        WebElement usernameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
        String actualResult = usernameElement.getText();
        String expectedResult = "Welcome qwerty1!";

        assertEquals(expectedResult, actualResult);
    }

    //With a weak password, account authorization with a message without specific information does not occur, but for some reason registration occurs.
    @Test
    public void testLogInWeakPassword(){
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        WebElement loginHeaderTitleButton = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.id("login2")));
        loginHeaderTitleButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
        usernameInput.sendKeys("Username333");

        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
        passwordInput.sendKeys("Password333");

        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginButton.click();

        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String actualResult = alert.getText();
        String expectedResult = "Welcome Username333";

        assertEquals(expectedResult, actualResult);
    }
}