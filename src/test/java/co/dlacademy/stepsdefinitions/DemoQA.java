package co.dlacademy.stepsdefinitions;

import co.dlacademy.pages.DemoQA.BasePage;
import co.dlacademy.pages.DemoQA.BrowserWindows.NewTab;
import co.dlacademy.pages.DemoQA.BrowserWindows.NewWindow;
import co.dlacademy.pages.DemoQA.BrowserWindows.NewWindowMessage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DemoQA {

    public WebDriver driver;
    private BasePage basePage;
    private NewTab newTab;
    private NewWindow newWindow;
    private NewWindowMessage newWindowMessage;


    @Given("se dirige a la seccion de Alertas, Frame y Windows")
    public void se_dirige_a_la_seccion_de_alertas_frame_y_windows() {
        driver = Hooks.webDriverManager.getDriver();
        basePage = new BasePage(driver);
        basePage.opensearch();
    }

    @When("da click en el item de New Tab y valida la nueva pestaña")
    public void da_click_en_el_item_de_new_tab_y_valida_la_nueva_pestaña() {
        newTab = new NewTab(driver);
        newTab.navigationToNewTab();
    }
    @When("da click en la nueva ventana y valida la nueva ventana")
    public void da_click_en_la_nueva_ventana_y_valida_la_nueva_ventana() {
        newWindow = new NewWindow(driver);
        newWindow.navigationToNewWindow();
    }
    @Then("da click en la nueva ventana con mensaje y lo valida")
    public void da_click_en_la_nueva_ventana_con_mensaje_y_lo_valida() {
        newWindowMessage = new NewWindowMessage(driver);
        newWindowMessage.navigatioToNewWindowMessage();

    }


}
