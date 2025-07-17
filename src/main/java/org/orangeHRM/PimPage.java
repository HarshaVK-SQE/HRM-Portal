package org.orangeHRM;

import org.openqa.selenium.By;

public class PimPage extends HomePage{

    private final By addEmpButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");


    public void addEmployeeButton(){
        explicitWait_ElementVisibility(addEmpButton, 3);
        clickElement(addEmpButton);
    }



}
