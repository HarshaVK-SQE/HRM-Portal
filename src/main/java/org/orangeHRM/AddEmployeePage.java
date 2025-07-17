package org.orangeHRM;

import org.openqa.selenium.By;

public class AddEmployeePage extends PimPage{

    private final By firstName = By.xpath("//input[@name='firstName']");
    private final By middleName = By.xpath("//input[@name='middleName']");
    private final By lastName = By.xpath("//input[@name='lastName']");
    private final By empID = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By profilePhotoButton = By.xpath("//div/img[@class='employee-image']");
    private final By employeeAddedSuccess = By.xpath("//h6[@class='oxd-text oxd-text--h6 --strong']");
    private final By saveEmployeeButton = By.xpath("//button[@type='submit']");

    public void setFirstName(String firstNameText){

        explicitWait_ElementVisibility(firstName, 5);

        setText(firstName, firstNameText);

    }

    public void setMiddleName(String middleNameText){

        setText(middleName, middleNameText);

    }

    public void setLastName(String lastNameText){

        setText(lastName, lastNameText);

    }

    public void setEmpID(String empIDtext){

        explicitWait_ElementVisibility(empID, 3);
        setText(empID, empIDtext);

    }

    public void setUserName(String firstNameText, String middleNameText, String lastNameText){

        explicitWait_ElementVisibility(firstName, 5);

        setText(firstName, firstNameText);
        setText(middleName, middleNameText);
        setText(lastName, lastNameText);

    }

    public void click_ProfilePhotoButton() throws Exception{

        explicitWait_ElementVisibility(profilePhotoButton, 5);

        clickElement(profilePhotoButton);

        String filePath = "D:\\Desktop\\Ram Sita Maa\\6.jpeg";

        fileUpload(filePath);

    }

    public void save_EmpDetails(){

        explicitWait_ElementVisibility(saveEmployeeButton, 3);
        clickElement(saveEmployeeButton);

    }


}
