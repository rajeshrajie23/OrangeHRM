package com.orange.Pages;

import org.openqa.selenium.By;

import com.orange.ReusableMethods.Reusable;

public class LoginPage extends Reusable {

    protected By loginText = By.xpath("//h5[normalize-space()='Login']");
    protected By dashboardText = By.xpath("//h6[normalize-space()='Dashboard']");
    protected By uname = By.xpath("//input[@placeholder='Username']");
    protected By pword = By.xpath("//input[@placeholder='Password']");
    protected By login_btn = By.xpath("//button[@type='submit']");
    protected By drpDwn = By.xpath("//span[@class='oxd-userdropdown-tab']");
    protected By logout_btn = By.xpath("//a[normalize-space()='Logout']");

    protected void LoginToOrange(String username,String password)
    {
        ImplicitWait(10);
        EnterText(uname, username);
        EnterText(pword, password);
        Click(login_btn);
    }
}
