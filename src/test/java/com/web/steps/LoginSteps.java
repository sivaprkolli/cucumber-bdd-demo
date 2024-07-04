package com.web.steps;

import com.qz.utilities.Context;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginSteps {
    Context context;
    public LoginSteps(){
        context = new Context();
    }

    @Given("User on login screen")
    public void user_on_login_screen() {
        System.out.println("User on login screen");
    }
    @When("User enter login credentials")
    public void user_enter_login_credentials() {
        System.out.println("User enter login credentials");
    }
    @When("User click on submit button")
    public void user_click_on_submit_button() {
        System.out.println("User click on submit button");
    }
    @Then("User verify products page displayed")
    public void user_verify_products_page_displayed() {
        System.out.println("User verify products page displayed");
    }

    @When("User enter login credentials {string} and {string}")
    public void userEnterLoginCredentialsAnd(String username, String password) {
        System.out.println("username :: " + username);
        System.out.println("password :: " + password);
    }

    @When("User enter login credentials using below row")
    public void userEnterLoginCredentialsUsingBelowRow(DataTable dataTable) {
        List<String> singleRowData = dataTable.row(0);

        System.out.println("email :: " + singleRowData.get(3));
        for(String data: singleRowData){
            System.out.println(data);
        }
    }

    @When("User enter login credentials using row header")
    public void userEnterLoginCredentialsUsingRowHeader(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String userName = null;
        String password = null;
        String phone = null;
        String email = null;
        for (Map<String, String> dataMap: data){
            userName = dataMap.get("username");
            password = dataMap.get("password");
            phone = dataMap.get("phone");
            email = dataMap.get("email");
        }

        System.out.println(userName);
        System.out.println(password);
        System.out.println(phone);
        System.out.println(email);

        context.setContext("un", userName);
        context.setContext("ph", phone);
    }

    @Then("User verify username {string} displayed")
    public void userVerifyUsernameDisplayed(String username) {
        System.out.println(context.getContext("un"));
        System.out.println(context.getContext("ph"));
        Assert.assertEquals(context.getContext("un"), username);
        Assert.assertEquals(context.getContext("ph"), "98765443");
    }
}
