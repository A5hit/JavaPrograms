package Tests.Day3;

import Selenium14DaysGring.Pages.Day3.DropdownPractisePage;

import Tests.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropdownPractise extends DriverFactory {

    DropdownPractisePage dropdownPractisePage;

    @BeforeClass
    public void initPages(){
        this.dropdownPractisePage = new DropdownPractisePage(driver);
    }

    @Test
    public void clickCity(){
        driver.get(dropdownPractisePage.setURl());
        dropdownPractisePage.setCity();

        String city = dropdownPractisePage.getCity();
        System.out.println(city);
        Assert.assertEquals(city,"Chennai (MAA)","City not selected properly!");
    }
}
