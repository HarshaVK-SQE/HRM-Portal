package org.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class BasePage {

    public static WebDriver driver;


    public void setDriver(WebDriver driver){

        BasePage.driver = driver;

    }

    public WebElement findElement(By locator){

        return driver.findElement(locator);

    }

    public void clickElement(By locator){
        findElement(locator).click();
    }

    public void setText(By locator, String enterText){
        findElement(locator).clear();
        findElement(locator).sendKeys(enterText);
    }

    public void explicitWait_ElementVisibility(By locator, long sec){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public void explicitWait_ElementClick(By locator, long sec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
    }

    public void explicitWait_ElementSendKeys(By locator, long seconds, String text){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);

    }

    public void actions_MoveToElement(By locator, long sec){

        Actions actions = new Actions(driver, Duration.ofSeconds(sec));

        actions.moveToElement(findElement(locator)).perform();

    }

    public void actions_ScrollToElement(By locator, long sec){

        Actions actions = new Actions(driver, Duration.ofSeconds(sec));
        actions.scrollToElement(findElement(locator)).perform();

    }

    public void action_ClickableElement(long seconds, By locator){

        Actions actions = new Actions(driver, Duration.ofSeconds(seconds));

        actions.scrollToElement(findElement(locator)).click().perform();

    }

    public void quitDriver(long millis) throws Exception{
        Thread.sleep(millis);
        driver.quit();
    }

    public void fileUpload(String filePath) throws Exception {

        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        // Simulate keyboard events
        Robot robot = new Robot();
        robot.delay(3000);

        // Press CTRL+V to paste the path
        // Copy
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        // Paste
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press ENTER to confirm
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public void select_ByVisibleText(By locator, String visibleText){

        Select select = new Select(findElement(locator));

        select.selectByVisibleText(visibleText);

    }

    public void select_ByValue(By locator, String valueText){
        Select select = new Select(findElement(locator));

        select.selectByValue(valueText);
    }
}
