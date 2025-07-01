package Tests;

import Selenium14DaysGring.Pages.HomePage;
import Selenium14DaysGring.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Problem1 extends DriverFactory {

    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    @Test
    public void SuccessfulLoginVerification(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickSubmit();
        Assert.assertTrue(homePage.getLoginTitle().equalsIgnoreCase("Logged In Successfully"));
    }
}
