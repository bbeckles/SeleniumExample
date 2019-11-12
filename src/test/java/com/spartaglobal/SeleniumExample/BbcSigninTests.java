package com.spartaglobal.SeleniumExample;

import com.spartaglobal.SeleniumExample.BBCSitePageObjects.BbcSite;
import com.spartaglobal.SeleniumExample.seleniumConfig.SeleniumConfig;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcSigninTests {

    public static BbcSite bbcSite;



    @BeforeClass

    public static void setup(){
      SeleniumConfig chromeDriver = new SeleniumConfig("chrome","C:\\Users\\Bailee Beckles\\Downloads\\chromedriver_win32\\chromedriver.exe");
        bbcSite = new BbcSite(chromeDriver.getDriver());
    }


    @Test
    public void invalidPasswordTest(){
       String expected = "Sorry, that password isn't valid. Please include something that isn't a letter.";
        Assert.assertEquals(expected, bbcSite.bbcSignInPage().goToSignInPage().inputUsername("bobby").inputPassword("password").sendTabKey().passwordError());


    }

    @Test
    public void passwordTooShortError(){
        String expected = "Sorry, that password is too short. It needs to be eight characters or more.";
        Assert.assertEquals(expected, bbcSite.bbcSignInPage().goToSignInPage().inputUsername("bobby").inputPassword("boo").sendTabKey().passwordError());
    }

    @Test
    public void userNameErrorEmpty(){
        String expected = "Something's missing. Please check and try again.";
        Assert.assertEquals(expected, bbcSite.bbcSignInPage().goToSignInPage().inputUsername("").inputPassword("boo").sendTabKey().userNameError());
    }

//    @Test
//    public void incorrectPassword(){
//        String expected = "Uh oh, that password doesn’t match that account. Please try again.";
//        Assert.assertEquals(expected, bbcSite.bbcSignInPage().goToSignInPage().inputUsername("test@gmail.com").inputPassword("wrongpss123").sendTabKey().passwordError());
//
//    }
}
