package co.dlacademy.pages.DemoQA.BrowserWindows;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static co.dlacademy.utilities.Windows.changeWindowNew;

public class NewTab {
    private WebDriver driver;
    private By tittleNewPage = By.xpath("//*[@id='sampleHeading']");
    private By alertsbutton = By.xpath("//*[text()='Browser Windows']");
    private By buttonNewTab = By.xpath("//button[text()='New Tab']");

    public NewTab(WebDriver driver) {this.driver = driver;}

    public void navigationToNewTab(){
        String originalWindow = driver.getWindowHandle();
        driver.findElement(alertsbutton).click();

        changeWindowNew(driver,driver.findElement(buttonNewTab));
        Assertions.assertNotEmpty("This is a sample page",driver.findElement(tittleNewPage).getText());

        driver.close();
        driver.switchTo().window(originalWindow);
    }

    }

