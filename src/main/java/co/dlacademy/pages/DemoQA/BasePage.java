package co.dlacademy.pages.DemoQA;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static co.dlacademy.utilities.Windows.changeWindowNew;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class BasePage {

    private WebDriver driver;

    private By alertsFramesWindows = By.xpath("//div[@class='card-body']/h5[text()='Alerts, Frame & Windows']");
    private By alertsbutton = By.xpath("//*[text()='Browser Windows']");
    private By buttonNewTab = By.xpath("//button[text()='New Tab']");
    private By tittleNewPage = By.xpath("//*[@id='sampleHeading']");
    private By buttonNewWindow = By.xpath("//button[text()='New Window']");
    private By buttonNewMessageWindow= By.xpath("//button[text()='New Window Message']");
    private By bodyNewWindow= By.xpath("//body[text()='Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.']");




    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void opensearch() {
        WebElement opensearchButton = driver.findElement(alertsFramesWindows);
        if (opensearchButton.isDisplayed()) {
            opensearchButton.click();
        }

      /*  String originalWindow = driver.getWindowHandle();
        driver.findElement(alertsbutton).click();

        changeWindowNew(driver,driver.findElement(buttonNewTab));
        Assertions.assertNotEmpty("This is a sample page",driver.findElement(tittleNewPage).getText());

        driver.close();
        driver.switchTo().window(originalWindow);


        changeWindowNew(driver,driver.findElement(buttonNewWindow));
        Assertions.assertNotEmpty("This is a sample page",driver.findElement(tittleNewPage).getText());

        driver.close();
        driver.switchTo().window(originalWindow);

        changeWindowNew(driver,driver.findElement(buttonNewMessageWindow));
        //Esta assertion no la pude hacer
        // Assertions.assertNotEmpty("This is a sample page",driver.findElement(tittleNewPage).getText());

        driver.close();
        driver.switchTo().window(originalWindow);

*/



    }
}
