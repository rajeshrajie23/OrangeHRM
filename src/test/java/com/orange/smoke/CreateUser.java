package com.orange.smoke;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orange.Pages.AddUser;

@Listeners(com.orange.smoke.ListenersClass.class)

public class CreateUser extends AddUser{
    
    @BeforeClass
    void navigate_to_admin_page() throws IOException
    {
        d=launch();
        LoginToOrange("Admin","admin123");
    }

    @Test
    void addNewUser()
    {
        ImplicitWait(15);
        Click(pim);
        Assert.assertTrue(d.findElement(pim_title).isDisplayed());
        Click(add);
        Assert.assertTrue(d.findElement(add_emp_title).isDisplayed());
        EnterText(firstName, "Rajesh");
        EnterText(lastName, "Chatla");
        EnterText(empId, "1234");
        ExplicitWait(save,50);
        Click(save);
        Assert.assertEquals(d.findElement(username).getText(),"Rajesh Chatla");
    }

    @AfterClass
    public
    void closeallbrowsers()
    {
        d.quit();
    }
}
