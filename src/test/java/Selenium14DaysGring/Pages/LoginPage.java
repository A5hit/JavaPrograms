package Selenium14DaysGring.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriverWait wait;

    @FindBy( id = "username") private WebElement usernameFiled;
    @FindBy(id = "password") private WebElement passwordField;
    @FindBy(className = "btn") private WebElement submitButton;


    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(){
       wait.until(ExpectedConditions.elementToBeClickable(usernameFiled));
       usernameFiled.sendKeys("student");
    }

    public void enterPassword(){
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys("Password123");
    }

    public void clickSubmit(){
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }
}

