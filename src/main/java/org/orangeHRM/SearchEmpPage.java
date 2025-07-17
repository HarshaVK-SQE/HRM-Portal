package org.orangeHRM;

import org.openqa.selenium.By;

public class SearchEmpPage extends AddEmployeePage{

    private final By emp_ID_Search = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By searchButton = By.xpath("//button[@type='submit']");
    private final By searchResult = By.xpath("(//div[@class='oxd-table-cell oxd-padding-cell'])[3]");
    private final By editUser = By.xpath("//button[@class='oxd-icon-button oxd-table-cell-action-space'][1]");

    public void search_Emp_By_ID(String emp_ID){

        explicitWait_ElementVisibility(emp_ID_Search, 5);

        setText(emp_ID_Search, emp_ID);

        clickElement(searchButton);

    }

    public void val_SearchResults(){

        explicitWait_ElementVisibility(searchResult, 3);

        String result = findElement(searchResult).getText();

        System.out.println("Search Result: " + result);

    }

    public void click_Edit_User(){

        explicitWait_ElementVisibility(editUser, 3);
        clickElement(editUser);

    }

}
