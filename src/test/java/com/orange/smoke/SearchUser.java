package com.orange.smoke;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.Assert;

import com.orange.Pages.UserInfo;

@Listeners(com.orange.smoke.ListenersClass.class)

public class SearchUser extends UserInfo {
    
    @BeforeClass
    void openUrlAndLogin() throws IOException
    {
        d=launch();
        LoginToOrange("Admin", "admin123");
    }

    @Test
    void searchUser()
    {
        Click(admin_btn);
        Assert.assertTrue(ElementFound(admin_pg_title));
        EnterText(usrname, "Admin");
        Click(user_role_btn);
        DropdownOption(user_role_options,"Admin");
        Click(status_btn);
        DropdownOption(status_options, "enabled");
        Click(search_btn);
    }

    @AfterClass
    void closeAllBrowsers()
    {
        d.quit();
    }

}
