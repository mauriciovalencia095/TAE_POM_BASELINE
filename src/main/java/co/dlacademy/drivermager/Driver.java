package co.dlacademy.drivermager;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Driver {
    public static WebDriver driver;
    public static ConfigFileReader configFileReader;

    public static WebDriver get() {
        if (driver == null) {

            String br = "chrome";
            String os = System.getProperty("os.name");
            String extension = "";
            boolean osType = os.contains("Windows");
            if (osType) {
                extension = ".exe";
            }



            if (br.equals("chrome")) {
                WebDriverManager.chromedriver().clearDriverCache().setup();
                System.setProperty("webdriver.chrome.driver", Config.getProperty("chromepath") + extension);
                ChromeDriverManager.chromedriver().setup();
                ChromeOptions cOptions = new ChromeOptions();
                // Remove the "--headless" parameter if you need to run the tests with a graphical user interface
                // cOptions.addArguments("--headless");
                cOptions.addArguments("incognito");
                cOptions.addArguments("--window-size=3072,1920");
                cOptions.addArguments("--ignore-certificate-errors");
                cOptions.addArguments("--disable-cache");
                driver = new ChromeDriver(cOptions);
            } else if (br.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", Config.getProperty("firefoxpath") + extension);
                FirefoxProfile ffProfile = new FirefoxProfile();
                ffProfile.setPreference("browser.download.panel.shown", false);
                ffProfile.setPreference("browser.helperApps.neverAsk.openFile", "text/csv,application/vnd.ms-excel");
                ffProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv,application/vnd.ms-excel");
                ffProfile.setPreference("browser.download.folderList", 2);
                ffProfile.setPreference("browser.download.dir", String.valueOf(downloadPath));
                FirefoxOptions ffOptions = new FirefoxOptions();
                ffOptions.setHeadless(false);
                ffOptions.addArguments("--width=3072");
                ffOptions.addArguments("--height=1920");
                ffOptions.addArguments("--ignore-certificate-errors");
                ffOptions.setProfile(ffProfile);
                driver = new FirefoxDriver(ffOptions);
            }
        }
        return driver;
    }

}


