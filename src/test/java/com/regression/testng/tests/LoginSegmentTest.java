package com.regression.testng.tests;

import com.regression.testng.BaseSetup;
import com.regression.testng.pageObjects.LoginSegment;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by purushtoman on 18/8/17.
 */
public class LoginSegmentTest extends BaseSetup{
    private WebDriver driver;
    LoginSegment loginSegment;

    @BeforeClass
    public void setup(){
        driver = getDriver();
    }

    @Test
    public void checkUserLoginWithValidCredentials() throws InterruptedException {
        loginSegment = new LoginSegment(driver);
        loginSegment.clickOnSignInButton(driver);
        loginSegment.login("uttam@yopmail.com", "password");
        Thread.sleep(2000);
//        Assert.assertTrue(loginSegment.username().equals("uttam reddy"), "Username is not displayed after signing in");
    }
    @AfterTest
    public void close(){
        closeTest();
    }
}
