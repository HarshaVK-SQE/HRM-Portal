package org.orangeHRM;

import org.testng.annotations.Test;

public class HomePageTest extends LoginTest {

    @Test (priority = 2, groups = "search")
    public void clickPIMButton(){
        homePage.click_PIM_Button();
    }

}
