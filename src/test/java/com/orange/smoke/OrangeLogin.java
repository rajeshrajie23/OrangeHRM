package com.orange.smoke;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orange.Pages.LoginPage;

import java.io.IOException;


public class OrangeLogin extends LoginPage{

    @BeforeClass
    void loadBrowser() throws IOException
    {
        d=launch();
    }

    @Test(priority = 1)
    void loginTest()
    {
        String title=d.getTitle();
        Assert.assertEquals(title, "OrangeHRM");
        LoginToOrange("Admin", "admin123");
        Assert.assertTrue(ElementFound(dashboardText));
    }

    @Test(priority = 2)
    void logoutTest() 
    {
        Click(drpDwn);
        Click(logout_btn);
        Assert.assertTrue(ElementFound(loginText));
    }

    @AfterClass
    void endTests()
    {
        closeallbrowsers();
    }
}
