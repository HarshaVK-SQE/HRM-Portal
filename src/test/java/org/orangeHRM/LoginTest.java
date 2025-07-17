package org.orangeHRM;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    String userName = "Admin";
    String passWord = "admin123";

    @Test (priority = 1, groups = "search")
    public void loginUser(){

        loginPage.loginUser(userName, passWord);
        loginPage.loginSuccessVal();

    }

}
