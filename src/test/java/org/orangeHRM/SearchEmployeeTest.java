package org.orangeHRM;

import org.testng.annotations.Test;

public class SearchEmployeeTest extends AddEmployeeTest{

    String empID = "0371";

    @Test (groups = "search", priority = 3)
    public void search_Emp(){

        searchEmpPage.search_Emp_By_ID(empID);
        searchEmpPage.val_SearchResults();

    }

    @Test (groups = "search", priority = 4)
    public void clickEditUser(){

        searchEmpPage.click_Edit_User();

    }

}
