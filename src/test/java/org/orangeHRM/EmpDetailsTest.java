package org.orangeHRM;

import org.testng.annotations.Test;

public class EmpDetailsTest extends SearchEmployeeTest{

    String otherID = "";

    @Test(groups = "search", priority = 5)
    public void enterOtherID(){

        employeeDetailsPage.setOtherID(otherID);

    }

}
