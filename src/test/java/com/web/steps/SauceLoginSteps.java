package com.web.steps;

import com.qz.factory.WebDriverFactory;
import com.qz.pages.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class SauceLoginSteps extends WebDriverFactory {
    public LoginPage loginPage;

    @Given("User enter username {string} and password {string}")
    public void user_enter_username_and_password(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.login(username, password);
    }

    @Given("User click on login button")
    public void user_click_on_login_button() {
        loginPage.submitLoginForm();
    }

    @Then("User verify products screen displayed")
    public void user_verify_products_screen_displayed() {
        String heading = loginPage.getHeaderText();
        System.out.println("heading :: " + heading);
        Assert.assertEquals(heading, "Products");
    }

    @Given("I enter username and refresh the page")
    public void iEnterUsernameAndRefreshThePage() {
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user");
        driver.navigate().refresh();
        loginPage.login("standard_user");
        System.out.println();
    }
}
