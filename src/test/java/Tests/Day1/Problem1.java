package Tests.Day1;

import Selenium14DaysGring.Pages.Day1.HomePageProblem1;
import Selenium14DaysGring.Pages.Day1.LoginPageProblem1;
import Tests.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Problem1 extends DriverFactory {

    LoginPageProblem1 loginPageProblem1 = new LoginPageProblem1(driver);
    HomePageProblem1 homePageProblem1 = new HomePageProblem1(driver);

    @Test
    public void SuccessfulLoginVerification(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPageProblem1.enterUsername();
        loginPageProblem1.enterPassword();
        loginPageProblem1.clickSubmit();
        Assert.assertTrue(homePageProblem1.getLoginTitle().equalsIgnoreCase("Logged In Successfully"));
    }
}
