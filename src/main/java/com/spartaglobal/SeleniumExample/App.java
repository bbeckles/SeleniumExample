package com.spartaglobal.SeleniumExample;

import com.spartaglobal.SeleniumExample.BBCSitePageObjects.BbcSite;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bailee Beckles\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();

        BbcSite bbcSite = new BbcSite(chromeDriver);
        bbcSite.bbcHomePage().goToBbcHomepage().clickSignInLink();
        bbcSite.bbcSignInPage().inputUsername("helo").inputPassword("password").clickSubmitButton();



}
}
