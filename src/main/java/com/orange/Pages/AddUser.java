package com.orange.Pages;

import org.openqa.selenium.By;

public class AddUser extends LoginPage {

    protected By pim = By.xpath("//a/span[text()=\"PIM\"]");
    protected By pim_title = By.xpath("//div/span/h6[text()=\"PIM\"]");
    protected By add = By.xpath("//button/i[@class=\"oxd-icon bi-plus oxd-button-icon\"]");
    protected By add_emp_title = By.xpath("//h6[normalize-space()='Add Employee']");
    protected By firstName = By.xpath("//input[@placeholder=\"First Name\"]");
    protected By lastName = By.xpath("//input[@placeholder=\"Last Name\"]");
    protected By empId = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    protected By save = By.xpath("//button[normalize-space()='Save']");
    protected By username = By.xpath(String.format("//div[@class=\"orangehrm-edit-employee-name\"]/h6[text()=\"%s\"]","Rajesh Chatla"));
}