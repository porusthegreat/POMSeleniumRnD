package com.regression.testng.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by purushtoman on 18/8/17.
 */
public class LoginSegment {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginSegment(WebDriver driver){
        this.driver = driver;
    }

    private By signInButton = By.className("login");
    private By userEmail = By.id("email");
    private By password = By.id("passwd");
    private By loginButton = By.id("SubmitLogin");
    private By verifyUserName = By.className("account");

    public WebDriver clickOnSignInButton(WebDriver driver) {
//        wait = new WebDriverWait(driver,15);
//        wait.until(ExpectedConditions.presenceOfElementLocated(signInButton));
        driver.findElement(signInButton).click();
        return driver;
    }

    public void login(String email, String passwd){
        driver.findElement(userEmail).sendKeys(email);
        driver.findElement(password).sendKeys(passwd);
        driver.findElement(loginButton).click();
    }

    public String username(){
        String text = driver.findElement(verifyUserName).getText();
        return text;
    }
}
