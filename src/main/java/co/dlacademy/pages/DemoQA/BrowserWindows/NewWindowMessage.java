package co.dlacademy.pages.DemoQA.BrowserWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static co.dlacademy.utilities.Windows.changeWindowNew;

public class NewWindowMessage {

    private WebDriver driver;
    private By buttonNewMessageWindow= By.xpath("//button[text()='New Window Message']");
    private By bodyNewWindow= By.xpath("//body[text()='Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.']");


    public  NewWindowMessage (WebDriver driver){this.driver=driver;}

    public void navigatioToNewWindowMessage(){

        String originalWindow = driver.getWindowHandle();

        changeWindowNew(driver,driver.findElement(buttonNewMessageWindow));
        //Esta assertion no la pude hacer
        // Assertions.assertNotEmpty("This is a sample page",driver.findElement(tittleNewPage).getText());

        driver.close();
        driver.switchTo().window(originalWindow);

        driver.quit();
    }
}
