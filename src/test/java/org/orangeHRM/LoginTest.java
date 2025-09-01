package org.orangeHRM;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{


    @Test (priority = 1, groups = "search", dataProvider = "userDetails")
    public void loginUser(String userName, String passWord){

        loginPage.loginUser(userName, passWord);
        loginPage.loginSuccessVal();

    }

}
