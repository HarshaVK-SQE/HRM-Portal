package org.orangeHRM;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private final By userName = By.xpath("//input[@name='username']");
    private final By passWord = By.xpath("//input[@name='password']");
    private final By loginButton = By.xpath("//button[@type='submit']");
    private final By loginVal = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    public void setUserName(String userNameText){
        setText(userName, userNameText);
    }

    public void setPassWord(String passWordText){
        setText(passWord, passWordText);
    }

    public void clickButton(){
        clickElement(loginButton);
    }


    //Direct Login
    public void loginUser(String userNameText, String passwordText){

        explicitWait_ElementVisibility(userName, 5);
        setText(userName, userNameText);
        setText(passWord, passwordText);
        clickElement(loginButton);

    }

    //Login Val
    public void loginSuccessVal(){

        explicitWait_ElementVisibility(loginVal, 5);

        String homePageText = findElement(loginVal).getText();

        System.out.println(homePageText);

    }




}
