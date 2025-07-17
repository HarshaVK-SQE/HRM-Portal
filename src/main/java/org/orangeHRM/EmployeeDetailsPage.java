package org.orangeHRM;

import org.openqa.selenium.By;

public class EmployeeDetailsPage extends SearchEmpPage{

    private final By otherID = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");

    public void setOtherID(String otherIDText){

        explicitWait_ElementVisibility(otherID, 3);

        setText(otherID, otherIDText);

    }

}
