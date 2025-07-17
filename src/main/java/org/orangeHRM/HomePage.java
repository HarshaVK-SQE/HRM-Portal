package org.orangeHRM;

import org.openqa.selenium.By;

public class HomePage extends LoginPage{

    private final By pimButton = By.xpath("(//a/span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]");

    public void click_PIM_Button(){

        explicitWait_ElementVisibility(pimButton,3);
        clickElement(pimButton);
    }


}
