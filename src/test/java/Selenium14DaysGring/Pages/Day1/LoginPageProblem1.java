package Selenium14DaysGring.Pages.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageProblem1 {

    private WebDriverWait wait;

    @FindBy( id = "username") private WebElement usernameFiled;
    @FindBy(id = "password") private WebElement passwordField;
    @FindBy(className = "btn") private WebElement submitButton;


    public LoginPageProblem1(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(){
       //wait.until(ExpectedConditions.visibilityOf(usernameFiled));
       usernameFiled.click();
       usernameFiled.sendKeys("student");
    }

    public void enterPassword(){
        //wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.click();
        passwordField.sendKeys("Password123");
    }

    public void clickSubmit(){
       // wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }
}

