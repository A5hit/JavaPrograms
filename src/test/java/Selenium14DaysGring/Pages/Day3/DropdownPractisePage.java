package Selenium14DaysGring.Pages.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DropdownPractisePage {

     WebDriver driver;
     WebDriverWait wait;
     String URl = "https://rahulshettyacademy.com/dropdownsPractise";
     String city = "Chennai (MAA)";

    @FindBy(id = "ctl00_mainContent_ddl_originStation1")
    private WebElement citiesLocator;

    public DropdownPractisePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public String setURl() {
        return URl;
    }

    public void setCity() {
        Select select = new Select(citiesLocator);
        select.selectByVisibleText(city);
    }

    public String getCity() {
        Select select = new Select(citiesLocator);
        return select.getFirstSelectedOption().getText();
    }


}
