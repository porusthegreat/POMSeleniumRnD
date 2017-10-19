/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.regression.testng;

import com.regression.testng.Utilities.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseSetup {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(String Browser, String URL) {
        switch (Browser){
            case  "Chrome" :
                System.setProperty(Constants.Chrome_Driver, Constants.Driver_Path);
                driver = new ChromeDriver();
                driver.get(URL);
                driver.manage().window().maximize();
                break;
        }
    }
    @Parameters({"Browser", "URL"})
    @BeforeClass
    public void startTest(String Browser,String URL){
        try{
            setDriver(Browser,URL);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void closeTest(){
        driver.close();
    }
}
