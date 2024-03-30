package com.orange.smoke;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orange.Pages.UserInfo;

public class SearchForrUser extends UserInfo {
    
    @BeforeClass
    void navigate_to_admin_page() throws IOException
    {
        d=launch();
        LoginToOrange("Admin","admin123");
    }

    @Test
    void searchUser()
    {
        Click(admin_btn);
        Assert.assertTrue(ElementFound(admin_pg_title));
        EnterText(usrname, "Victor123");        
        Click(user_role_btn);
        DropdownOption(user_role_options,"ESS");
        DropdownOption(status_btn, "enabled");
        Click(search_btn);
    }

    @AfterClass
    void exitTest()
    {
        closeallbrowsers();
    }
}
