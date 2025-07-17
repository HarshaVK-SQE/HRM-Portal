package org.orangeHRM;

import org.testng.annotations.Test;

import java.util.Arrays;

public class AddEmployeeTest extends PimPageTest{

    String firstName = "geetha";
    String middleName = "lakshmi";
    String lastName = "Kanakagiri";

    @Test (priority = 4)
    public void addEmpDetails(){

        addEmployeePage.setUserName(firstName, middleName, lastName);

    }

    @Test ( priority = 5)
    public void uploadPhoto() {

        try{
            addEmployeePage.click_ProfilePhotoButton();
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

    }

    @Test (priority = 6)
    public void save_Employee_Details(){
        addEmployeePage.save_EmpDetails();
    }


}
