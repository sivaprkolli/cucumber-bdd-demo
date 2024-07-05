package com.qz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#user-name")
    private WebElement userNameInputBox;

    @FindBy(css = "[name=\"password\"]")
    private WebElement passwordInputBox;

    @FindBy(css = ".submit-button.btn_action")
    private WebElement submitButton;

    @FindBy(css = ".title")
    private WebElement headerText;

    public void login(String un, String pwd){
        userNameInputBox.sendKeys(un);
        passwordInputBox.sendKeys(pwd);
    }

    public void login(String un){
        driver.findElement(By.cssSelector("#user-name")).sendKeys(un);
    }

    public void submitLoginForm(){
        submitButton.click();
    }

    public String getHeaderText(){
        return headerText.getText();
    }


}
