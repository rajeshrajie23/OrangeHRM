package stepdefinition;

import org.testng.Assert;

import com.orange.Pages.UserInfo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchUser extends UserInfo {
    
    @When("click on admin button")
    public void click_on_admin_button()
    {
        Click(admin_btn);
    }

    @Then("vefiy the page title")
    public void vefiy_the_page_title() {
        Assert.assertTrue(ElementFound(admin_pg_title));
    }

    @When("enter username as {string}")
    public void enter_username_as(String s) {
        EnterText(usrname, s);
    }
    
    @When("click on user role dropdown")
    public void click_on_user_role_dropdown() {
        Click(user_role_btn);
    }

    @When("select user role as {string}")
    public void select_user_role_as(String s) {
        DropdownOption(user_role_options, s);
    }

    @When("click on status button")
    public void click_on_status_button() {
        Click(status_btn);
    }

    @When("select status as {string}")
    public void select_status_as(String s) {
        DropdownOption(status_options, s);
    }

    @When("click on search button")
    public void click_on_search_button() {
        Click(search_btn);
    }
}
