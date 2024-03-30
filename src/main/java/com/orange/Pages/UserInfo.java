package com.orange.Pages;

import org.openqa.selenium.By;

public class UserInfo extends LoginPage{
    
    protected By admin_btn = By.xpath("//li[1]//a[1]//span[1]");
    protected By admin_pg_title = By.xpath("(//h6[normalize-space()='User Management'])[1]");
    protected By usrname = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    protected By user_role_btn = By.xpath("(//div[contains(text(),'-- Select --')])[1]");
    protected By user_role_options = By.xpath("//div[@class=\"oxd-select-option\"]/span");
    protected By employee_name = By.xpath("//input[@placeholder='Type for hints...']");
    protected By status_btn = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");
    protected By status_options = By.xpath("//div[@class=\"oxd-select-option\"]/span");
    protected By search_btn = By.xpath("//button[normalize-space()='Search']");
    protected By reset_btn = By.xpath("//button[normalize-space()='Reset']");

}
