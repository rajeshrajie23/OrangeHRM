package com.orange.smoke;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import com.orange.Pages.LoginPage;

@Listeners(com.orange.smoke.ListenersClass.class)

public class OrangeLogin extends LoginPage {
    
    @BeforeClass
    void launchTheBrowser() throws IOException
    {
        d=launch();
    }

    @Test(priority=1,description = "login with valid credentials")
    void loginTest()
    {
        ImplicitWait(10);
        Assert.assertTrue(ElementFound(loginText));
        EnterText(uname, "Admin");
        EnterText(pword, "admin123");
        Click(login_btn);
        Assert.assertTrue(ElementFound(dashboardText));
    }

    @Test(priority = 2,description = "log out from application")
    void logoutTest() 
    {
        Click(drpDwn);
        Click(logout_btn);
        Assert.assertTrue(ElementFound(loginText));
    }

    @AfterClass
    void closeAllBrowsers()
    {
        d.quit();
    }
}
