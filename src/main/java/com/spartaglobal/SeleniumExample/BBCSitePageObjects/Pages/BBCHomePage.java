package com.spartaglobal.SeleniumExample.BBCSitePageObjects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BBCHomePage {

    private WebDriver driver;

    private String homePageURL = "https://www.bbc.co.uk/";

    private By signInLinkID = By.id("idcta-link");

    public BBCHomePage(WebDriver driver){
        this.driver = driver;
    }

    public BBCHomePage goToBbcHomepage(){
        driver.navigate().to(homePageURL);
        return this;
    }

    public BBCHomePage clickSignInLink(){
        driver.findElement(signInLinkID).click();
        return this;
    }

    public BBCHomePage closeDriver(){
        driver.close();
        return this;
    }
}
