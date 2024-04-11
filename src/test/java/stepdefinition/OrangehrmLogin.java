package stepdefinition;

import java.io.IOException;

import org.testng.Assert;

import com.orange.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangehrmLogin extends LoginPage {

    @Given("launch the url")
    public void launch_the_url() throws IOException {
        d=launch();
    }

    @Then("verify the homepage is loaded")
    public void verify_the_homepage_is_loaded() {
        Assert.assertEquals(d.getTitle(), "OrangeHRM");
    }
    
    @When("enter username as {string} and password as {string} and click on login")
    public void enter_username_as_and_password_as_and_click_on_login(String uname, String pword) {
        LoginToOrange(uname, pword);
    }  
    
    @Then("verify the dashboard title")
    public void verify_the_dashboard_title() {
        Assert.assertTrue(ElementFound(dashboardText));
    }

    @When("click on the dropdown")
    void click_on_the_dropdown()
    {
        Click(drpDwn);
    }

    @When("click on logout")
    public void click_on_logout() {
        Click(logout_btn);
    }

    @Then("verify login page title")
    public void verify_login_page_title() {
        Assert.assertTrue(ElementFound(loginText));
    }

    @When("close all the browsers")
    public void close_all_the_browsers() {
        d.quit();
    }

    @Then("verify the login error message")
    public void verify_the_login_error_message() {
        Assert.assertTrue(ElementFound(login_error));
    }

}
