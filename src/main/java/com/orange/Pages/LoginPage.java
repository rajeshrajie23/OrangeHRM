package com.orange.Pages;

import org.openqa.selenium.By;

import com.orange.ReusableMethods.Reusable;

public class LoginPage extends Reusable {

    protected By loginText = By.cssSelector(".orangehrm-login-title");
    protected By dashboardText = By.xpath("//h6[normalize-space()='Dashboard']");
    protected By uname = By.cssSelector("input[name=\"username\"]");
    protected By pword = By.cssSelector("input[name=\"password\"]");
    protected By login_btn = By.cssSelector("button.orangehrm-login-button");
    protected By drpDwn = By.cssSelector("span.oxd-userdropdown-tab");
    protected By logout_btn = By.xpath("//a[normalize-space()='Logout']");
    protected By login_error = By.cssSelector("p.oxd-alert-content-text");


    protected void LoginToOrange(String username,String password)
    {
        ImplicitWait(10);
        EnterText(uname, username);
        EnterText(pword, password);
        Click(login_btn);
    }
}
