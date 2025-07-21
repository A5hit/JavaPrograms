package Selenium14DaysGring.Pages.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectMenuPage {

    private WebDriverWait wait;

    @FindBy(xpath = "//div[contains(text(),'Select Option')]")
    private WebElement headerDropdown;
    @FindBy(xpath = "//div[@class=' css-26l3qy-menu']//div[contains(text(),'Group 2, option 1')]")
    private WebElement dropdownItem;
    @FindBy(xpath = "//div[@class=' css-1uccc91-singleValue']")
    private WebElement optionText;

    public SelectMenuPage(WebDriver driver) {
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void getHeaderDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(headerDropdown));
        headerDropdown.click();
    }

    public void selectDropdownOption() {
        wait.until(ExpectedConditions.visibilityOf(dropdownItem));
        dropdownItem.click();
    }

    public String getSelectedOption() {
        wait.until(ExpectedConditions.visibilityOf(optionText));
        return optionText.getText();
    }


}
