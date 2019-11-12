package com.spartaglobal.SeleniumExample.BBCSitePageObjects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BbcSignInPage {
    private WebDriver driver;
    private String bbcSignInPageURL = "https://account.bbc.com/signin";
    private By userNameField  = By.id("user-identifier-input");
    private By passwordField = By.id("password-input");
    private By submitButton = By.id("submit-button");
    private By userNameError = By.id("form-message-username");
    private By passwordError = By.id("form-message-password");

    public BbcSignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public BbcSignInPage goToSignInPage(){
        driver.navigate().to(bbcSignInPageURL);
        return this;
    }

    public BbcSignInPage inputUsername (String username){
        driver.findElement(userNameField).sendKeys(username);
        return this;
    }

    public BbcSignInPage inputPassword (String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public BbcSignInPage clickSubmitButton(){
        driver.findElement(submitButton).click();
        return this;
    }

    public BbcSignInPage sendTabKey (){
        driver.findElement(passwordField).sendKeys(Keys.TAB);
        return this;
    }
    public String passwordError (){
       return driver.findElement(passwordError).getText();

    }

    public String userNameError (){
        return driver.findElement(userNameError).getText();
    }
}
