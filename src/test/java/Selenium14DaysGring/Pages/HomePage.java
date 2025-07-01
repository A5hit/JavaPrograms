package Selenium14DaysGring.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriverWait wait;

    @FindBy(className = "post-title") private WebElement successfullLoginTitle;
    @FindBy(className = "has-text-align-center") private WebElement successfullLoginContext;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String getLoginTitle(){
        wait.until(ExpectedConditions.visibilityOf(successfullLoginTitle));
        return successfullLoginTitle.getText();
    }

    public String getLoginContext(){
        wait.until(ExpectedConditions.visibilityOf(successfullLoginContext));
        return successfullLoginContext.getText();
    }
}
