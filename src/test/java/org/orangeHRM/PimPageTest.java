package org.orangeHRM;

import org.testng.annotations.Test;

public class PimPageTest extends HomePageTest{


    @Test (priority = 3)
    public void clickAddEmpButton(){

        pimPage.addEmployeeButton();

    }



}
