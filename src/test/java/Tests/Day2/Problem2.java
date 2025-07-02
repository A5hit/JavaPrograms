package Tests.Day2;

import Selenium14DaysGring.Pages.Day2.SelectMenuPage;
import Tests.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Problem2 extends DriverFactory {

    SelectMenuPage selectMenuPage;

    @BeforeClass
    public void initPages(){
        this.selectMenuPage = new SelectMenuPage(driver);
    }

    @Test
    public void selectOption() {
        driver.get("https://demoqa.com/select-menu");
        selectMenuPage.getHeaderDropdown();
        selectMenuPage.selectDropdownOption();
        String text = selectMenuPage.getSelectedOption();
        Assert.assertEquals(text, "Group 2, option 1", "Selected option is incorrect!");
    }

}
