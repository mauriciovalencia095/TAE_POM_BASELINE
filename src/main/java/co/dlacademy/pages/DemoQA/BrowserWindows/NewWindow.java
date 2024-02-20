package co.dlacademy.pages.DemoQA.BrowserWindows;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static co.dlacademy.utilities.Windows.changeWindowNew;

public class NewWindow {

    private WebDriver driver;
    private By buttonNewWindow = By.xpath("//button[text()='New Window']");
    private By tittleNewPage = By.xpath("//*[@id='sampleHeading']");



    public NewWindow (WebDriver driver){this.driver = driver;}

    public void navigationToNewWindow(){

        String originalWindow = driver.getWindowHandle();
        changeWindowNew(driver,driver.findElement(buttonNewWindow));
        Assertions.assertNotEmpty("This is a sample page",driver.findElement(tittleNewPage).getText());

        driver.close();
        driver.switchTo().window(originalWindow);

    }
}
